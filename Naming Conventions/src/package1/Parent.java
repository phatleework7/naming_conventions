// Trong cùng gói
package package1;

public class Parent {
    protected String message = "This is a protected message";

    protected void showMessage() {
        System.out.println(message);
    }
}

class SamePackage {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.showMessage(); // Truy cập được vì cùng gói
    }
}

