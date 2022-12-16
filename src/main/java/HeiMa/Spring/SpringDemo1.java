package HeiMa.Spring;

import HeiMa.Spring.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: SpringDemo1
 * @Author Xu
 * @Date: 12/12/2022 上午 7:17
 * @Version 1.0
 */
public class SpringDemo1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
