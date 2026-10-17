import java.util.ArrayList;
import java.util.Scanner;

class Account {
    protected final int accountNumber;
    protected final String name;
    protected double balance;

    Account(int accountNumber, String name, double openingBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.printf("Balance: ₹%.2f%n", balance);
    }
}

class SavingsAccount extends Account {
    private final double interestRate;

    SavingsAccount(int accountNumber, String name, double openingBalance,
                   double interestRate) {
        super(accountNumber, name, openingBalance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100.0;
        balance += interest;
        System.out.printf("Interest added: ₹%.2f%n", interest);
    }
}

public class BankManagementSystem {
    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<SavingsAccount> accounts = new ArrayList<>();

    private static SavingsAccount findAccount(int number) {
        for (SavingsAccount account : accounts) {
            if (account.accountNumber == number) return account;
        }
        return null;
    }

    private static void createAccount() {
        System.out.print("Account number: ");
        int number = in.nextInt();
        in.nextLine();

        if (findAccount(number) != null) {
            System.out.println("That account number already exists.");
            return;
        }

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Opening balance: ");
        double balance = in.nextDouble();
        if (balance < 0) {
            System.out.println("Opening balance cannot be negative.");
            return;
        }

        accounts.add(new SavingsAccount(number, name, balance, 5.0));
        System.out.println("Savings account created.");
    }

    public static void main(String[] args) {
        int choice = -1;

        do {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display account");
            System.out.println("5. Add savings interest");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            if (!in.hasNextInt()) {
                System.out.println("Enter a menu number.");
                in.nextLine();
                continue;
            }
            choice = in.nextInt();

            switch (choice) {
                case 1: {
                    createAccount();
                    break;
                }
                case 2: {
                    System.out.print("Account number: ");
                    SavingsAccount account = findAccount(in.nextInt());
                    if (account == null) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.print("Deposit amount: ");
                        account.deposit(in.nextDouble());
                    }
                    break;
                }
                case 3: {
                    System.out.print("Account number: ");
                    SavingsAccount account = findAccount(in.nextInt());
                    if (account == null) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.print("Withdrawal amount: ");
                        account.withdraw(in.nextDouble());
                    }
                    break;
                }
                case 4: {
                    System.out.print("Account number: ");
                    SavingsAccount account = findAccount(in.nextInt());
                    if (account == null) System.out.println("Account not found.");
                    else account.display();
                    break;
                }
                case 5: {
                    System.out.print("Account number: ");
                    SavingsAccount account = findAccount(in.nextInt());
                    if (account == null) System.out.println("Account not found.");
                    else account.addInterest();
                    break;
                }
                case 0:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        in.close();
    }
}
