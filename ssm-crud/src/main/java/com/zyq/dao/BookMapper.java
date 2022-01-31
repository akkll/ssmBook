package com.zyq.dao;

import com.zyq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Author MagicBOOK
 * @Date 2022-01-30 17:28
 * @Version 1.0
 */
public interface BookMapper {
    int addBook(Books books);
    int deleteBookById(@Param("bookId") Integer id);
    int updateBook(Books books);
    Books queryBookById(@Param("bookId") Integer id);
    List<Books> queryAllBook();
}
