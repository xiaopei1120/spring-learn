package org.spring.demo.ioc;

/**
 * IOC 依赖注入
 */
public class IOCDI {

    //这里OneBean要依赖TwoBean，借助容器帮程序员自动实例化对象
    //IOC 帮我们实例化了对象，所以这里不会出现空指针
    OneBean oneBean;

}
