package ServletStudy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: testServlet
 * @Author Xu
 * @Date: 13/10/2022 下午 8:11
 * @Version 1.0
 */
@WebServlet("/hello")
public class testServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().write("Hello World");
    }
}