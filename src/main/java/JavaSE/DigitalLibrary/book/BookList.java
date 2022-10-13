package JavaSE.DigitalLibrary.book;

/**
 * @author Xu
 * @date: 2022/8/23 19:34
 */
@SuppressWarnings("all")
public class BookList {

    private Book[] books = new Book[10];
    private int usedSize; //存储当前书的个数

    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 89, "小说");
        books[1] = new Book("西游记", "吴承恩", 78, "小说");
        books[2] = new Book("红楼梦", "曹雪芹", 49, "小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int pos) {
        return books[pos];
    }

    public void setBooks(Book book, int pos) {
        books[pos] = book;
    }
}
