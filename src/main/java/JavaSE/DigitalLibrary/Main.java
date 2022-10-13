package JavaSE.DigitalLibrary;


import JavaSE.DigitalLibrary.book.BookList;
import JavaSE.DigitalLibrary.user.AdminUser;
import JavaSE.DigitalLibrary.user.NormalUser;
import JavaSE.DigitalLibrary.user.User;

import java.util.Scanner;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class Main {

    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员，0-》普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new AdminUser(userName);
        } else {
            return new NormalUser(userName);
        }
    }

    public static void main(String[] args) {
        //0、准备数据
        BookList bookList = new BookList();
        //1、登录
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
