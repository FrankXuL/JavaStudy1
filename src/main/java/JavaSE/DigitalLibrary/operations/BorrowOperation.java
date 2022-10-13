package JavaSE.DigitalLibrary.operations;

import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;
import java.util.Scanner;

/**
 * @Author 12629
 * @Description：
 */
public class BorrowOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍！");
        System.out.println("请输入你要借阅的图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                if (book.isBorrowed()) {
                    System.out.println("该书已经被借出! ");
                } else {
                    book.setBorrowed(true);
                    System.out.println("借阅图书成功！");
                }
                return;
            }
        }
        System.out.println("没有你要借阅的图书！");
    }
}
