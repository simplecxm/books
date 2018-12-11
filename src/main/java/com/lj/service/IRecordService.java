package com.lj.service;

import com.lj.common.ServerResponse;
import com.lj.pojo.Record;

public interface IRecordService {
    ServerResponse borrow(Record record);
}
