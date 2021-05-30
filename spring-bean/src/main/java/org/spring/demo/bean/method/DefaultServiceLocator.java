package org.spring.demo.bean.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 工厂方法实例化bean
 */
public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public static void main(String[] args) {
        //实例化容器，参数为classpath下面的文件路径
        ApplicationContext context = new ClassPathXmlApplicationContext("application_method_factory.xml");
        Object clientService = context.getBean("clientService");
        //输出org.spring.demo.bean.method.ClientService@64bf3bbf
        System.out.println(clientService);
    }
}
