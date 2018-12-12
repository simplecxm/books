package com.lj.service;

import com.lj.common.ServerResponse;
import com.lj.pojo.Reader;

import java.util.List;

public interface IReaderService {

    String register(Reader reader);

    ServerResponse<Reader> login(String rName, String rPwd);

    String updateReader(Reader reader);

    String deleteReader(String rname);

    List<Reader> findReader(String rname);
}
