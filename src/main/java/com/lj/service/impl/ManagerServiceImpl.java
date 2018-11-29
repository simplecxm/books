package com.lj.service.impl;

import com.lj.dao.BookMapper;
import com.lj.pojo.Book;
import com.lj.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iManagerService")
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private BookMapper bookMapper;

    public String addBooks(Book books){
        int result = bookMapper.insert(books);
        if (result > 0) {
            return "success";
        }
        return "fail";
    }
}
