package org.spring.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器启动测试
 */
public class ApplicationContextTest_1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_2.xml");
        Object oneBean = context.getBean("oneBean");
        System.out.println(oneBean);//输出org.spring.demo.bean.OneBean@13805618
    }

}
