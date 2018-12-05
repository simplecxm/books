package com.lj.service;

import com.github.pagehelper.PageInfo;
import com.lj.common.ServerResponse;
import com.lj.pojo.Book;

import java.util.List;

public interface IBookService {
    String addBooks(Book book);
    String updateBook(Book book);
    String delete(Integer bIsbn);
    ServerResponse<PageInfo> listBook(int pageNum, int pageSize);
}
