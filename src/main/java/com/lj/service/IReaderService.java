package com.lj.service;

import com.lj.pojo.Reader;

public interface IReaderService {

    String register(Reader reader);

    Reader login(String rName, String rPwd);

    String updateReader(Reader reader);

    String deleteReader(String rname);

    Reader findReader(String rname);
}
