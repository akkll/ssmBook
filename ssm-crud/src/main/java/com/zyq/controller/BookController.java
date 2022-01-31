package com.zyq.controller;

import com.zyq.pojo.Books;
import com.zyq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName BookController
 * @Author MagicBOOK
 * @Date 2022-01-31 11:30
 * @Version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
//查询全部书籍，并返回到展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        model.addAttribute("list", books);
        return "allBook";
    }
}
