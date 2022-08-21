package JavaSE;

import java.util.Scanner;

/**
 * @title: Example
 * @Author Xu
 * @Date: 2022/8/11 22:11
 * @Version 1.0
 */
public class Example {
    private static String name = "xxxx";
    private static String password = "123456";

    public static void main(String[] args) throws PasswordException, NameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String name = scanner.next();
        System.out.println("请输入密码: ");
        String password = scanner.next();

        login(name,password);
    }

    public static void login(String name, String password) throws PasswordException, NameException {
        if (!Example.name.equals(name)) {
            throw new NameException("用户名错误");
        }
        if (!Example.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功!");
    }
}

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
