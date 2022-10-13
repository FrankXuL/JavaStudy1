package JavaSE.DigitalLibrary.operations;


import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;

import java.util.Scanner;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class FindOperation implements IOPeration {

    public void work(BookList bookList) {
        //查找图书
        System.out.println("查找图书！");
        System.out.println("请输入你要查找的图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            //Book book = bookList[i];
            if (name.equals(book.getName())) {
                System.out.println("找到了这本书！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
