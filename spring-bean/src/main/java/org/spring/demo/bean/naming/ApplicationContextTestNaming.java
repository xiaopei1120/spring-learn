package org.spring.demo.bean.naming;

import org.spring.demo.bean.test2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean命名测试
 */
public class ApplicationContextTestNaming {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_bean_naming.xml");
        UserService userService = (UserService) context.getBean("userService");
        UserService userService1 = (UserService) context.getBean("userService1");
        System.out.println(userService);//输出org.spring.demo.bean.test2.UserService@56ef9176
        System.out.println(userService1);//输出org.spring.demo.bean.test2.UserService@56ef9176
    }

}
