package hr;

import hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sơn", 1, 5000, "IT");


        // System.out.println(emp.name); // Lỗi: Không thể truy cập private
        // System.out.println(emp.salary); // Lỗi: Không thể truy cập protected
        // System.out.println(emp.department); // Lỗi: Không thể truy cập mặc định
        System.out.println(emp.id); // Truy cập được public

        emp.displayPublicInfo(); // Truy cập được public method

        Manager manager = new Manager("Linh", 2, 30000,"HR");
        System.out.println(manager.id);
        manager.displayPublicInfo();
    }
}
