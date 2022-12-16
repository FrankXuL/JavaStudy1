package HeiMa.Spring.Service.impl;

import HeiMa.Spring.Dao.BookDao;
import HeiMa.Spring.Dao.impl.BookDaoImpl;
import HeiMa.Spring.Service.BookService;

/**
 * @title: BookService
 * @Author Xu
 * @Date: 12/12/2022 上午 7:23
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("Book Service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}