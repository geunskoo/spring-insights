package com.geunskoo.naivedao.ver1;

import com.geunskoo.naivedao.NaiveDaoApplication;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;

public class Command {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(NaiveDaoApplication.class, args);
        User user = new User();
        user.setId("1");
        user.setName("태근");
        user.setPassword("1234");

        UserDao userDao = new UserDao();
        userDao.add(user);
        System.out.println(user.getName() + "등록 성공");

        User findUser = userDao.get("1");
        System.out.println(user.getName() + "조회 성공");
    }
}
