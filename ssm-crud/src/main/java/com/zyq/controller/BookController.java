package com.zyq.controller;

import com.zyq.pojo.Books;
import com.zyq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        model.addAttribute("list", books);
        return "allBook";
    }
    @RequestMapping(value = "/book",method = RequestMethod.PUT)
    public String addBook(Books books){
        int i = bookService.addBook(books);
        System.out.println(i);
        return "redirect:/book/book";
    }
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String updateBook(Books books){
        int i = bookService.updateBook(books);
        System.out.println(i);
        return "redirect:/book/book";
    }
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(Model model, @PathVariable int id){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }
    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable Integer id){
        System.out.println(id);
        bookService.deleteBookById(id);
        return "redirect:/book/book";
    }

}
