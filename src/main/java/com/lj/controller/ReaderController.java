package com.lj.controller;

import com.github.pagehelper.PageInfo;
import com.lj.common.ServerResponse;
import com.lj.pojo.Reader;
import com.lj.service.IBookService;
import com.lj.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ReaderController {

    @Autowired
    private IReaderService iReaderService;

    @Autowired
    private IBookService iBookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "register";
    }


    @RequestMapping(value = "register.do", method = RequestMethod.GET)
    @ResponseBody
    public String register(Reader reader) {

        return iReaderService.register(reader);
    }

    @RequestMapping(value = "loginHtml", method = RequestMethod.GET)
    public String loginHtml(){

        return "login";
    }

    @RequestMapping(value = "login.do", method = RequestMethod.GET)
    //@ResponseBody
    public String login(String rName, String rPwd, /*HttpSession session, */Model model) {//ServerResponse<Reader>
        ServerResponse<Reader> response = iReaderService.login(rName, rPwd);
        if(response.isSuccess()){
            //session.setAttribute("rName",response.getData());
            model.addAttribute("rName",rName);
            //return response;
            return "reader";
        }
        //return response;
        return "error";
    }

    @RequestMapping(value = "updateReaderHtml.do",method = RequestMethod.GET)
    public String updateReaderHtml(){
        return "updateReader";
    }

    @RequestMapping(value = "updateReader.do",method = RequestMethod.POST)
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

    @RequestMapping(value = "get_reader_info.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse  getReaderInfo(HttpSession session){//ServerResponse
        Reader reader = (Reader)session.getAttribute("rName");
        if(reader!=null){
           return ServerResponse.createBySuccess("获取成功",reader);
        }
        return ServerResponse.createByErrorMessage("请登录");
    }

    @RequestMapping(value = "readerHtml",method = RequestMethod.GET)
    //@ResponseBody
    public String listBook(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model){
        ServerResponse<PageInfo> response = iBookService.listBook(pageNum,pageSize);
        model.addAttribute("bookList", response.getData().getList());
        return "reader";
    }
}
