package com.sqm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * mybatis工具类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyBatisUtil {
    private static SqlSessionFactory factory;

    public static SqlSession getSession() {
        try {
            if (factory == null) {
                InputStream inputStream = Resources.getResourceAsStream("spring-config/spring-config.xml");
                factory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return factory.openSession();
    }
}
