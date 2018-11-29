package com.lj.controller;

import com.lj.pojo.Book;
import com.lj.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerController {

    @Autowired
    private IManagerService iManagerService;

    @RequestMapping(value = "managerHtml.do", method = RequestMethod.GET)

    public String managerHtml(){ return "manager"; }

    @RequestMapping(value = "manager.do", method = RequestMethod.GET)
    @ResponseBody
    public String addBooks(Book book){ return iManagerService.addBooks(book); }
}
