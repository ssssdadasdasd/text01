package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil(){

    }
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "com/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();
    // 取得SqlSession 对象
    public static SqlSession getSession(){
        SqlSession session = t.get();
        if(session==null){
            session=sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }
    //关闭sqlsession对象

    public static void myclose(SqlSession session){
        if(session!=null){
            session.close();
            t.remove();
        }
    }
}
