package com.lj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lj.common.ServerResponse;
import com.lj.dao.BookMapper;
import com.lj.pojo.Book;
import com.lj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iBookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    public String addBooks(Book books) {
        int result = bookMapper.insert(books);
        if (result > 0) {
            return "success";
        }
        return "fail";
    }

    public String updateBook(Book books){
        int result = bookMapper.updateBook(books.getBisbn(),books.getBname(),
                     books.getBwriter(),books.getBnumber(),books.getBsort(),
                     books.getBpub(),books.getBprice(),books.getBintro(),books.getBpic());
        if(result > 0){
            return "success";
        }else {
            return "fail";
        }

    }

    public String delete(Integer bIsbn){
        int result = bookMapper.delete(bIsbn);
        if(result > 0){
            return "success";
        }else {
            return "fail";
        }
    }

   public ServerResponse<PageInfo> listBook(int  pageNum,int pageSize){
       PageHelper.startPage(pageNum,pageSize);
       List<Book> books = bookMapper.listBook();
       PageInfo<Book> pageInfo = new PageInfo<>(books);
       return ServerResponse.createBySuccess("success",pageInfo);
   }
}
