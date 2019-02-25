package com.lj.service;

import com.lj.common.ServerResponse;
import com.lj.pojo.Record;

import java.util.List;

public interface IRecordService {
    ServerResponse borrow(Record record);
    List<Record> reader_record(String rname);
}
