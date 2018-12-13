package com.lj.controller;

import com.github.pagehelper.PageInfo;
import com.lj.common.ServerResponse;
import com.lj.pojo.Book;
import com.lj.service.IBookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;

    @RequestMapping(value = "headerHtml.do", method = RequestMethod.GET)
    public String headerHtml(){ return "header"; }

    @RequestMapping(value = "bookHtml.do", method = RequestMethod.GET)
    public String bookHtml(){ return "book"; }

    @RequestMapping(value = "book.do", method = RequestMethod.POST)
    @ResponseBody
    public String addBooks(Book book){ return iBookService.addBooks(book);}

    @RequestMapping(value = "updateBookHtml.do",method = RequestMethod.GET)
    public String updateBookHtml(){return "updateBook";}

    @RequestMapping(value = "updateBook.do",method = RequestMethod.POST)
    @ResponseBody
    public String updateBook(Book book){return  iBookService.updateBook(book);}

    @RequestMapping(value = "deleteHtml.do",method = RequestMethod.GET)
    public String deleteHtml(){return "delete";}

    @RequestMapping(value = "delete.do",method = RequestMethod.GET)
    @ResponseBody
    public String delete(Integer bIsbn){return iBookService.delete(bIsbn);
    }

    @RequestMapping(value = "listBookHtml.do", method = RequestMethod.GET)
    public String listBookHtml(){return "listBook";}

    @RequestMapping(value = "listBook.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<PageInfo> listBook(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam(value = "pageSize",defaultValue = "5") int pageSize){
        return iBookService.listBook(pageNum,pageSize);
    }

    @RequestMapping(value = "findBookHtml.do", method = RequestMethod.GET)
    public String findBookHtml(){return "findBook";}

    @RequestMapping(value = "findBook.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findBook(Integer bisbn){
        return iBookService.findBook(bisbn);

    }

    @RequestMapping(value = "findBookNameHtml.do", method = RequestMethod.GET)
    public String findBookNameHtml(){return "findBookName";}

    @RequestMapping(value = "findBookName.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findBookName(String bname){
        return iBookService.findBookName(bname);

    }

    @RequestMapping(value = "findBookWriterHtml.do", method = RequestMethod.GET)
    public String findBookWriterHtml(){return "findBookWriter";}

    @RequestMapping(value = "findBookWriter.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findBookWriter(String bwriter){
        return iBookService.findBookWriter(bwriter);

    }

    @RequestMapping(value = "findBooks.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Book> findBooks(String bsearch){
        return iBookService.findBooks(bsearch);

    }

}
