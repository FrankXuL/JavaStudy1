package ServletStudy;

import ServletStudy.Dao.BookDao;
import ServletStudy.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @title: PurchaseServlet
 * @Author Xu
 * @Date: 11/11/2022 下午 5:16
 * @Version 1.0
 */
@WebServlet("/purchase")
public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null) {
            String url = "/Study/booklist";
            response.sendRedirect(url);
            return;
        }
        Book book= BookDao.getBookById(id);
        HttpSession session=request.getSession();
        List<Book> cart=(List)session.getAttribute("cart");
        if(cart==null) {
            cart=new ArrayList<Book>();
            session.setAttribute("cart", cart);
        }
        cart.add(book);
        Cookie cookie=new Cookie("JSESSIONID",session.getId());

        cookie.setMaxAge(60*30);
        cookie.setPath("/study");
        response.addCookie(cookie);

        String url="/study/cart";
        response.sendRedirect(url);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
