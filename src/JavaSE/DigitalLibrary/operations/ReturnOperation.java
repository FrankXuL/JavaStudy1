package JavaSE.DigitalLibrary.operations;

import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;

import java.util.Scanner;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class ReturnOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");
        System.out.println("请输入你要归还的图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                book.setBorrowed(false);
                System.out.println("归还图书成功！");
                return;
            }
        }
        System.out.println("没有你要归还的图书！");
    }
}

