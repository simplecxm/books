package com.lj.service;

import com.lj.common.ServerResponse;
import com.lj.pojo.Manager;

public interface IManagerService {

    ServerResponse<Manager> mlogin(String mname, String mpwd);
}
