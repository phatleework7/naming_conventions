package variablenames;

public class local {
    public static void main(String[] args) {
        // Tính tổng các số từ 1 đến 5
        int sum = 0; // Biến sum dùng để lưu tổng

        // Duyệt qua các số từ 1 đến 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // Cộng số i vào sum
        }

        System.out.println("Tổng các số từ 1 đến 5 là: " + sum);
    }
}
