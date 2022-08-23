package JavaSE.DigitalLibrary.user;


import JavaSE.DigitalLibrary.book.BookList;
import JavaSE.DigitalLibrary.operations.IOPeration;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        ioPerations[choice].work(bookList);
    }
}
