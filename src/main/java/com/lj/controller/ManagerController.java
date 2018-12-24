package com.lj.controller;


import com.github.pagehelper.PageInfo;
import com.lj.common.Const;
import com.lj.common.ServerResponse;
import com.lj.pojo.Manager;
import com.lj.service.IBookService;
import com.lj.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class ManagerController {

    @Autowired
    private IManagerService iManagerService;

    @Autowired
    private IBookService iBookService;

  /*  @RequestMapping(value = "managerHtml.do", method = RequestMethod.GET)
    public String loginHtml(){

        return "manager";
    }*/

    @RequestMapping(value = "manager.do", method = RequestMethod.GET)
    //@ResponseBody
    public String manager(String mname, String mpwd, Model model, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "5") int pageSize, HttpSession session) {

        ServerResponse<com.lj.pojo.Manager> response = iManagerService.mlogin(mname, mpwd);
        if (response.isSuccess()) {
            session.setAttribute(Const.Reader.CURRENT_READER, response.getData().getMname());
            model.addAttribute("mname", response.getData().getMname());
            ServerResponse<PageInfo> response1 = iBookService.listBook(pageNum, pageSize);
            model.addAttribute("bookList", response1.getData().getList());
            model.addAttribute("mname", mname);
            return "manager";
        }
        return "error";

    }
}
