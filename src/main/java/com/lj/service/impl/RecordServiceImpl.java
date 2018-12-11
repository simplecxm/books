package com.lj.service.impl;

import com.lj.common.ServerResponse;
import com.lj.dao.RecordMapper;
import com.lj.pojo.Record;
import com.lj.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iRecordService")
public class RecordServiceImpl implements IRecordService {
    @Autowired
    private RecordMapper recordMapper;

    public ServerResponse borrow(Record record){
        int result = recordMapper.borrow(record);
        if(result > 0){
            return ServerResponse.createBySuccessMessage("借书成功");
        }
        return ServerResponse.createByErrorMessage("结束失败");
    }

}
