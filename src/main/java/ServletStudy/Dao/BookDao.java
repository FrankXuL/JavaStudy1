package ServletStudy.Dao;

import ServletStudy.model.Book;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @title: BookDao
 * @Author Xu
 * @Date: 11/11/2022 下午 5:14
 * @Version 1.0
 */
public class BookDao {
    private static Map<String, Book> books=new LinkedHashMap<String,Book>();
    static {
        books.put("1",new Book("1","javaweb开发"));
        books.put("2",new Book("2","jdbc开发"));
        books.put("3",new Book("3","java基础"));
        books.put("4",new Book("4","西游记"));
        books.put("5",new Book("5","红楼梦"));
    }
    public static Collection<Book> getAll(){
        return books.values();
    }
    public static Book getBookById(String id) {
        return books.get(id);
    }
}
