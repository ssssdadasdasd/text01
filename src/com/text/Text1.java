package com.text;

import com.domain.student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;
import com.util.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Text1 {
    public static void main(String[] args) {
//        StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
//        student s = new student();
//        s.setId(10);
//        s.setName("逗比");
//        s.setSex("男");
//        s.setAge(30);
//        s.setAddress("上海");
//        s.setMath(30);
//        s.setEnglish(50);
//        ss.save(s);


//        查询所有记录
        List<student> slist = ss.getAll();
        for(student s : slist){
            System.out.println(s);
        }
    }
}
