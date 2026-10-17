class DemoStudent {
    int id;
    String name;

    DemoStudent() {
        id = 78;
        name = "Rahul";
    }

    DemoStudent(int id) {
        this.id = id;
        name = "Omsai";
    }

    DemoStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        DemoStudent first = new DemoStudent();
        DemoStudent second = new DemoStudent(101);
        DemoStudent third = new DemoStudent(102, "Om");

        first.display();
        second.display();
        third.display();
    }
}
