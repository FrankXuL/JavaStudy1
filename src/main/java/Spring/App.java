package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @title: App
 * @Author Xu
 * @Date: 25/10/2022 下午 9:52
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        //创建Spring上下文方式一
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        //创建Spring上下文方式二
        //BeanFactory beanFactory= new ClassPathXmlApplicationContext("spring-config.xml");
        //获取Bean方式一
        //User user = (User) context.getBean("user");
        //获取Bean方式二
        //User user = context.getBean(User.class);
        //获取Bean方式三
        User user = context.getBean("user",User.class);
        System.out.println(user.hello("Spring"));
    }
}