package JavaSE.DigitalLibrary.operations;

import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;

import java.util.Scanner;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class DelOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的图书：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //1. 遍历数组当中 是否有你要删除的书  有记录下标
        int index = -1;
        int currentSize = bookList.getUsedSize();
        ;
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                index = i;
                break;
            }
        }
        //
        if (index == -1) {
            System.out.println("没有你要删除的书！");
            return;
        }

        for (int i = index; i < currentSize - 1; i++) {
            //bookList[i] = bookList[i+1];
            Book book = bookList.getPos(i + 1);
            bookList.setBooks(book, i);
        }

        //每次删除 都要置空
        bookList.setBooks(null, currentSize - 1);

        bookList.setUsedSize(currentSize - 1);

        System.out.println("删除成功！");

    }
}
