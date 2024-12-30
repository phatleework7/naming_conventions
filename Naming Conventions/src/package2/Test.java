// Trong gói khác
package package2;
import package1.Parent;

class Child extends Parent {
    public void displayMessage() {
        System.out.println(message); // Truy cập được vì là lớp con
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();
    }
}
