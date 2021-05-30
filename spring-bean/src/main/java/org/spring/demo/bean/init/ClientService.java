package org.spring.demo.bean.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂实例化对象
 */
public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    /**
     * factory-method属性指定的方法
     */
    public static ClientService createInstance() {
        return clientService;
    }

    public static void main(String[] args) {
        //实例化容器，参数为classpath下面的文件路径
        ApplicationContext context = new ClassPathXmlApplicationContext("application_static_factory.xml");
        Object clientService = context.getBean("clientService");
        //输出org.spring.demo.bean.init.ClientService@49993335
        System.out.println(clientService);
    }
}
