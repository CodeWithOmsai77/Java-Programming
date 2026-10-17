<div align="center">

<img src="../assets/java-learning-banner.svg" width="100%" alt="Java Learning Projects" />

<p>
  <img src="https://img.shields.io/badge/Java-Console%20Applications-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java console applications" />
  <img src="https://img.shields.io/badge/Level-Beginner%20to%20Early%20Intermediate-0F766E?style=for-the-badge" alt="Beginner to early intermediate" />
</p>

**Eight small-to-medium console projects, from basic arithmetic to menu-driven management systems.**

[⬅ Back to Java Learning](../README.md)

</div>

---

## 🧩 Project Index

<table>
  <thead><tr><th>Project</th><th>Main concepts</th><th>Level</th></tr></thead>
  <tbody>
    <tr><td><a href="Calculator.java">01 · Calculator</a></td><td>Menu loop, switch, arithmetic, input checks</td><td>Beginner</td></tr>
    <tr><td><a href="NumberGuessingGame.java">02 · Number Guessing Game</a></td><td>Random numbers, loops and conditions</td><td>Beginner</td></tr>
    <tr><td><a href="StudentGradeManager.java">03 · Student Grade Manager</a></td><td>Input validation, totals, averages and grades</td><td>Beginner</td></tr>
    <tr><td><a href="QuizApplication.java">04 · Quiz Application</a></td><td>Arrays, answer checking and score calculation</td><td>Beginner</td></tr>
    <tr><td><a href="LibraryBookTracker.java">05 · Library Book Tracker</a></td><td>Arrays, menus, searching and methods</td><td>Beginner–Intermediate</td></tr>
    <tr><td><a href="ExpenseTracker.java">06 · Expense Tracker</a></td><td>Arrays, loops, totals and summary calculations</td><td>Beginner–Intermediate</td></tr>
    <tr><td><a href="BankManagementSystem.java">07 · Bank Management System</a></td><td>Classes, inheritance, collections and account operations</td><td>Intermediate beginner project</td></tr>
    <tr><td><a href="HospitalManagementSystem.java">08 · Hospital Management System</a></td><td>Classes, inheritance, interfaces, lists and appointments</td><td>Largest existing practice project</td></tr>
  </tbody>
</table>

## 🚀 Compile and Run

Run commands from the **repository root**. A JDK must be installed. The `-d out` option places compiled classes in a separate output folder.

### Calculator

```bash
mkdir -p out
javac -d out Java-Projects/Calculator.java
java -cp out Calculator
```

### Number Guessing Game

```bash
javac -d out Java-Projects/NumberGuessingGame.java
java -cp out NumberGuessingGame
```

### Student Grade Manager

```bash
javac -d out Java-Projects/StudentGradeManager.java
java -cp out StudentGradeManager
```

### Quiz Application

```bash
javac -d out Java-Projects/QuizApplication.java
java -cp out QuizApplication
```

### Library Book Tracker

```bash
javac -d out Java-Projects/LibraryBookTracker.java
java -cp out LibraryBookTracker
```

### Expense Tracker

```bash
javac -d out Java-Projects/ExpenseTracker.java
java -cp out ExpenseTracker
```

### Bank Management System

```bash
javac -d out Java-Projects/BankManagementSystem.java
java -cp out BankManagementSystem
```

### Hospital Management System

```bash
javac -d out Java-Projects/HospitalManagementSystem.java
java -cp out HospitalManagementSystem
```

These are local console exercises; they use in-memory data and do not connect to a database. Data entered during a run is not automatically saved after the program exits.

## ✅ Suggested Practice Order

Start with the Number Guessing Game, then Calculator, Quiz Application, Student Grade Manager, Library Book Tracker, and Expense Tracker. After those, revisit Bank and Hospital Management to practise classes and multiple interacting objects.

For every project:
1. Run at least three normal test cases and one boundary case.
2. Try invalid menu entries or invalid numeric inputs.
3. Explain the program flow before editing the code.
4. Add one feature independently.
5. Compile and resolve errors before considering the project complete.

---

[⬅ Back to Java Learning roadmap](../README.md)
