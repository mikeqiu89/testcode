package RMS;

import java.util.Scanner;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Customer.customer cr = new Customer.customer();
        Employee.employee ee = new Employee.employee();
        Menu.menu mu = new Menu.menu();
        Room.room rm = new Room.room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********酒店管理系统***********");
        System.out.println("1. 用户");
        System.out.println("2. 管理员");
        System.out.print("选择选项: ");
        String chose;
        chose = scanner.nextLine();
        if (chose.equals("1")) { //进入用户界面
            while (true) {


                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("房间为{101-125}");
                        System.out.print("姓名: ");
                        String customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        String roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 2:
                        System.out.print("房间为{201-225}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 3:
                        System.out.print("房间为{301-325}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 4:
                        System.out.print("房间为{401-425}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 5:
                        System.out.print("房间为{501-525}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 6:
                        System.out.print("房间为{601-625}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 7:
                        System.out.print("房间为{701-725}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 8:
                        System.out.print("房间为{801-925}");
                        System.out.print("姓名: ");
                        customerName = scanner.nextLine();
                        System.out.print("手机号: ");
                        phoneNumber = scanner.nextLine();
                        System.out.print("选择房间号：");
                        roomNumber = scanner.nextLine();
                        cr.emptyRoom(roomNumber);
                        cr.addCustomer(customerName, phoneNumber, roomNumber);
                        break;
                    case 9:
                        System.out.println("退出系统...");
                        System.exit(0);
                    default:
                        System.out.println("选择不合理，请再次尝试");
                }

            }
        } else if (chose.equals("2")) {
            String key;
            System.out.print("输入密码：");
            key = scanner.nextLine();
            if (key.equals("asd123")) {
                //进入管理员界面
                while (true) {
                    System.out.print("1. 添加顾客  ");
                    System.out.print("2. 删除顾客  ");
                    System.out.print("3. 添加员工  ");
                    System.out.print("4. 删除员工  ");
                    System.out.println("5. 添加菜品  ");
                    System.out.print("6. 删除菜品  ");
                    System.out.print("7. 显示顾客  ");
                    System.out.print("8. 显示员工  ");
                    System.out.println("9. 显示菜单    ");
                    System.out.println("10. 退出系统");
                    System.out.print("选择选项: ");

                    int option = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    switch (option) {
                        case 1:
                            System.out.print("客户名为: ");
                            String customerName = scanner.nextLine();
                            System.out.print("客户号码为: ");
                            String phoneNumber = scanner.nextLine();
                            System.out.print("选择房间号：");
                            String roomNumber = scanner.nextLine();
                            cr.emptyRoom(roomNumber);
                            cr.addCustomer(customerName, phoneNumber,roomNumber);
                            break;
                        case 2:
                            System.out.print("客户名为: ");
                            customerName = scanner.nextLine();
                            cr.removeCustomer(customerName);
                            break;
                        case 3:
                            System.out.print("员工名为: ");
                            String employeeName = scanner.nextLine();
                            System.out.print("员工位置为: ");
                            String position = scanner.nextLine();
                            ee.addEmployee(employeeName, position);
                            break;
                        case 4:
                            System.out.print("员工名为: ");
                            employeeName = scanner.nextLine();
                            ee.removeEmployee(employeeName);
                            break;
                        case 5:
                            System.out.print("菜品名为: ");
                            String itemName = scanner.nextLine();
                            System.out.print("菜品价格为: ");
                            double price = scanner.nextDouble();
                            mu.addMenuItem(itemName, price);
                            break;
                        case 6:
                            System.out.print("菜品名为: ");
                            itemName = scanner.nextLine();
                            mu.removeMenuItem(itemName);
                            break;
                        case 7:
                            cr.displayCustomers();
                            break;
                        case 8:
                            ee.displayEmployees();
                            break;
                        case 9:
                            mu.displayMenu();
                            break;
                        case 10:
                            System.out.println("退出系统...");
                            System.exit(0);
                        default:
                            System.out.println("选择不合理，请再次尝试");
                    }
                }
            }else {
                System.out.println("密码错误。");
            }
        }
    }
}