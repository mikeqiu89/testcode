package Menu;
import java.util.ArrayList;
import java.util.Scanner;
record Menu(String itemName, double price) {
}//菜单信息
public class menu {
    final ArrayList<Menu> menu = new ArrayList<>();
    public void addMenuItem(String name, double price) {
        Menu item = new Menu(name, price);
        menu.add(item);
    }//添加菜品

    public void removeMenuItem(String itemName) {
        for (Menu item : menu) {
            if (item.itemName().equals(itemName)) {
                menu.remove(item);
                System.out.println("菜单" + itemName + "删除成功");
                return;
            }
        }
    }//删除菜品
    public void displayMenu() {
        System.out.println("Menu:");
        for (Menu item : menu) {
            System.out.println("项目: " + item.itemName() + ", 价格: " + item.price());
        }
    }//显示菜品
}
