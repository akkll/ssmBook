package com.zyq.service;

import com.zyq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BookService
 * @Author MagicBOOK
 * @Date 2022-01-30 20:17
 * @Version 1.0
 */
public interface BookService {
    int addBook(Books books);
    int deleteBookById(Integer id);
    int updateBook(Books books);
    Books queryBookById(Integer id);
    List<Books> queryAllBook();
}
