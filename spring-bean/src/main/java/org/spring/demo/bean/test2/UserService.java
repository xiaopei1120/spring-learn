package org.spring.demo.bean.test2;

/**
 * 模拟service
 */
public class UserService {

    private UserDao userDao;


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
