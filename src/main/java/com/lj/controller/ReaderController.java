package com.lj.controller;

import com.lj.pojo.Reader;
import com.lj.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReaderController {

    @Autowired
    private IReaderService iReaderService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "register";
    }


    @RequestMapping(value = "register.do", method = RequestMethod.GET)
    @ResponseBody
    public String register(Reader reader) {

        return iReaderService.register(reader);
    }

    @RequestMapping(value = "loginHtml.do", method = RequestMethod.GET)
    public String loginHtml(){

        return "login";
    }

    @RequestMapping(value = "login.do", method = RequestMethod.GET)
    @ResponseBody
    public Reader login(String rname,String rpwd) {

        return iReaderService.login(rname, rpwd);
    }


}
