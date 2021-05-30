package org.spring.demo.bean.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 容器启动测试
 */
public class ApplicationContextTest_1 {

    public static void main(String[] args) {
        //实例化容器，参数为classpath下面的文件路径
        ApplicationContext context = new ClassPathXmlApplicationContext("application_1.xml");
        //通过getBean方法获取对象的实例，参数为对应的配置的xml对应的id内容
        //例如xml配置是<bean id="oneBean" class="org.spring.demo.bean.test1.OneBean"> getBean方法的参数就是oneBean
        Object oneBean = context.getBean("oneBean");
        //输出org.spring.demo.bean.OneBean@13805618
        System.out.println(oneBean);
    }

}
