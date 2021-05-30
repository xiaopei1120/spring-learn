package org.spring.demo.bean.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器启动测试
 */
public class ApplicationContextTest_2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_2.xml");
        UserService userService = (UserService) context.getBean("userService");
        UserDao userDao = userService.getUserDao();
        System.out.println(userService);//输出org.spring.demo.bean.OneBean@13805618
        System.out.println(userDao);//输出org.spring.demo.bean.OneBean@13805618
    }

}
