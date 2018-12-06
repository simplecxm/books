package com.lj.controller;

import com.lj.pojo.Reader;
import com.lj.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public Reader login(String rName,String rPwd) {

        return iReaderService.login(rName, rPwd);
    }

    @RequestMapping(value = "updateReaderHtml.do",method = RequestMethod.GET)
    public String updateReaderHtml(){
        return "updateReader";
    }

    @RequestMapping(value = "updateReader.do",method = RequestMethod.GET)
    @ResponseBody
    public String updateReader(Reader reader) {

        return iReaderService.updateReader(reader);
    }

    @RequestMapping(value = "deleteReaderHtml.do",method = RequestMethod.GET)
    public String deleteReaderHtml(){
        return "deleteReader";
    }

    @RequestMapping(value = "deleteReader.do",method = RequestMethod.GET)
    @ResponseBody
    public String deleteReader(String rname) {

        return iReaderService.deleteReader(rname);
    }

    @RequestMapping(value = "findReaderHtml.do",method = RequestMethod.GET)
    public String findReaderHtml(){
        return "findReader";
    }

    @RequestMapping(value = "fineReader.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Reader> findReader(String rname) {

        return iReaderService.findReader(rname);
    }

}
