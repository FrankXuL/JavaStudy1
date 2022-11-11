package ServletStudy;

import ServletStudy.Dao.BookDao;
import ServletStudy.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * @title: ListBookServlet
 * @Author Xu
 * @Date: 11/11/2022 下午 5:16
 * @Version 1.0
 */
@WebServlet("/booklist")
public class ListBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        Collection<Book> books= BookDao.getAll();
        out.write("共有以下图书：<br>");
        for(Book book:books) {
            String url="/study/purchase?id="+book.getId();
            out.write(book.getName()+"<a href='"+url+"'>点击购买<a><br>");
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
