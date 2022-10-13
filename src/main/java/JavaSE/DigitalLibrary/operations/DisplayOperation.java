package JavaSE.DigitalLibrary.operations;

import JavaSE.DigitalLibrary.book.Book;
import JavaSE.DigitalLibrary.book.BookList;


/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class DisplayOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有图书！");

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
