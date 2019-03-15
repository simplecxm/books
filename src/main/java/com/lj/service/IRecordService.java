package com.lj.service;

import com.github.pagehelper.PageInfo;
import com.lj.common.ServerResponse;
import com.lj.pojo.Record;

import java.util.List;

public interface IRecordService {
    ServerResponse borrow(Record record);
    /*List<Record> reader_record(String rname);*/
    ServerResponse<PageInfo> reader_record(int pageNum1, int pageSize1, String rname);
}
