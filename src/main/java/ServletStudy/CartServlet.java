package ServletStudy;

import ServletStudy.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @title: CartServlet
 * @Author Xu
 * @Date: 11/11/2022 下午 5:18
 * @Version 1.0
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        List<Book> cart=null;

        boolean purFlag=true;
        HttpSession session=request.getSession(false);
        if(session==null) {
            purFlag=false;
        }else {
            cart=(List)session.getAttribute("cart");
            if(cart==null) {
                purFlag=false;
            }
        }
        if(!purFlag) {
            out.write("对不起！您还没有购买任何商品！<br>");
            out.write("三秒后将自动为您跳转到购买页面");
            response.setHeader("Refresh", "3;URL=http://localhost:8080/study/booklist");
        }else {
            out.write("您购买的图书有：<br>");
            for(Book book:cart) {
                out.write(book.getName()+"<br>");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
