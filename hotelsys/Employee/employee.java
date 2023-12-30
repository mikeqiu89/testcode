package Employee;
import java.util.ArrayList;
import java.util.Scanner;
record Employee(String name, String position) {
}//员工信息
public class employee {
    final ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(String name, String position) {
        Employee employee = new Employee(name, position);
        employees.add(employee);
    } //添加员工

    public void removeEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.name().equals(name)) {
                employees.remove(employee);
                System.out.println("员工姓名" + name + " 删除成功");
                return;
            }
        }
    } //删除员工
    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("姓名: " + employee.name() + ", 位置: " + employee.position());
        }
    } //显示员工信息

}
