package org.spring.demo.ioc;

/**
 * 不使用IOC时类的依赖方式
 */
public class NormalDI {

    //这里NormalDI要依赖OneBean，必须交给程序员自己控制实例化
    OneBean oneBean = new OneBean();

}






















