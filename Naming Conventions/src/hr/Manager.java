package hr;

public class Manager extends Employee {
    public Manager(String name, int id, int salary, String department) {
        super(name, id, salary, department);
    }

    public void manageTeam() {
        // System.out.println(name); // Lỗi: Không thể truy cập private
        System.out.println("Salary: " + salary); // Truy cập protected
        System.out.println("Department: " + department); // Truy cập mặc định

        Employee emp = new Employee("Sơn", 1, 5000, "IT");
    }
}
