package Customer;
import java.util.ArrayList;
import java.util.Scanner;

record Customer(String name, String phoneNumber,String roomNumber) {
}
public class customer {
    final ArrayList<Customer> customers = new ArrayList<>();
    public void addCustomer(String name, String phoneNumber, String roomNumber) {
        Customer customer = new Customer(name, phoneNumber, roomNumber);
        customers.add(customer);
    } //添加客户

    public void removeCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.name().equals(name)) {
                customers.remove(customer);
                System.out.println("客户姓名" + name + "删除成功");
                return;
            }
        }
    } //删除用户
    public void emptyRoom(String roomNumber) {
        for (Customer customer : customers) {
            if (customer.roomNumber().equals(roomNumber)) {
                System.out.println("已被预定");
            } else {
                System.out.println("预定成功");
                return;
            }
        }
    } //判断房间是否被预定
    public void displayCustomers() {
        System.out.println("Customer List:");
        for (Customer customer : customers) {
            System.out.println("姓名: " + customer.name() + ", 号码: " + customer.phoneNumber() +
                    "房号：" + customer.roomNumber());
        }
    } //显示顾客信息
}
