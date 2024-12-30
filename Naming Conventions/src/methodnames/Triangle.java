package methodnames;

public class Triangle {

    public double areaOfTriangle(int a, int b, int c) {
        return (double) (a + b + c) / 2;
    }

    public boolean isEqualTriangle(int a, int b, int c) {
        return a == b && a == c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.areaOfTriangle(22, 53, 45));
        System.out.println(triangle.isEqualTriangle(3, 3, 3));
        System.out.println(triangle.isEqualTriangle(3, 3, 4));

    }
}
