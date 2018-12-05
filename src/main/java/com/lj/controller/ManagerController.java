package com.lj.controller;


import com.lj.pojo.Manager;
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
    public String loginHtml(){

        return "manager";
    }

    @RequestMapping(value = "manager.do", method = RequestMethod.GET)
    @ResponseBody
    public Manager manager(String mname, String mpwd) {

        return iManagerService.mlogin(mname, mpwd);
    }

}
