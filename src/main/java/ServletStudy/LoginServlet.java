package ServletStudy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: LoginServlet
 * @Author Xu
 * @Date: 13/10/2022 下午 8:40
 * @Version 1.0
 */
@SuppressWarnings({"all"})
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals("admin") && password.equals("123456")){
            resp.sendRedirect("welcome.html");
        }else{
            resp.sendRedirect("login.html");
        }
    }
}