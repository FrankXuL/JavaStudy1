package JavaSE.DigitalLibrary.operations;


import JavaSE.DigitalLibrary.book.BookList;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class ExitOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统!");
        System.exit(0);
    }
}
