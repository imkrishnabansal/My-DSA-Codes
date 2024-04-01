interface A {
    void display();
}

// Interface B
interface B extends A {
    void show();
}

// Interface C
interface C extends A {
    void print();
}

// Class D implementing both B and C
class D implements B, C {
    public void display() {
        System.out.println("Display from D");
    }

    public void show() {
        System.out.println("Show from D");
    }

    public void print() {
        System.out.println("Print from D");
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();  // Output: Display from D
        obj.show();     // Output: Show from D
        obj.print();    // Output: Print from D
    }
}