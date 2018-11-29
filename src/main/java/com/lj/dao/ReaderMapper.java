package com.lj.dao;

import com.lj.pojo.Reader;
import org.apache.ibatis.annotations.Param;

public interface ReaderMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Reader record);

    int insertSelective(Reader record);

    Reader selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Reader record);

    int updateByPrimaryKey(Reader record);

    Reader login(@Param("rname")String rname,@Param("rpwd")String rpwd);

    int register(@Param("rname")String rname,@Param("rpwd")String rpwd,@Param("rage")Integer rage,@Param("rsex")String rsex);
}