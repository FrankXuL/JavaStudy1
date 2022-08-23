package JavaSE.DigitalLibrary.operations;

import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;
import java.util.Scanner;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class AddOperation implements IOPeration {

    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入你要新增的图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你要新增的图书的作者：");
        String author = scanner.nextLine();

        System.out.println("请输入你要新增的图书的价格：");
        int price = scanner.nextInt();

        scanner.nextLine();

        System.out.println("请输入你要新增的图书的类型：");
        String type = scanner.nextLine();

        Book book = new Book(name, author, price, type);

        //1. 获取到当前可以存放书的位置
        int currentSize = bookList.getUsedSize();
        //2. 把书放入指定位置
        bookList.setBooks(book, currentSize);
        //3. 书的有效个数+1
        bookList.setUsedSize(currentSize + 1);
        System.out.println("fdsfafsafa");
    }
}
