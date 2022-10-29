package Spring.beans;

import org.springframework.stereotype.Controller;

/**
 * @title: User
 * @Author Xu
 * @Date: 25/10/2022 下午 10:02
 * @Version 1.0
 */
@Controller
public class User {
    public String hello(String name) {
        return name + " hello";
    }

}