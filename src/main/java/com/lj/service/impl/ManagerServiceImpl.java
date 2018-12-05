package com.lj.service.impl;


import com.lj.dao.ManagerMapper;
import com.lj.pojo.Manager;
import com.lj.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("iManagerService")
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public Manager mlogin(String mname,String mpwd){
        Manager manager = managerMapper.mlogin(mname,mpwd);
        if(!manager.equals(null)){
            return manager;
        }
        return null;
    }
}
