package com.zyq.dao;

import com.zyq.pojo.Books;
import com.zyq.service.impl.BookServiceImpl;
import com.zyq.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName DaoTest
 * @Author MagicBOOK
 * @Date 2022-01-30 20:07
 * @Version 1.0
 */
public class DaoTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bean = classPathXmlApplicationContext.getBean(BookServiceImpl.class);
        List<Books> books = bean.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
