package com.lj.dao;

import com.lj.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKeyWithBLOBs(Book record);

    int updateByPrimaryKey(Book record);

    int addBook(@Param("bIsbn")Integer bIsbn ,@Param("bName")String bName,
                 @Param("bWriter")String bwriter,@Param("bNumber")Integer bNumber,
                 @Param("bSort")String bSort,@Param("bPub")String bPub,
                 @Param("bPrice")Double bPrice,@Param("bIntro")String bIntro,
                 @Param("bPic")byte[] bPic);
    int updateBook(@Param("bIsbn")Integer bIsbn ,@Param("bName")String bName,
                   @Param("bWriter")String bwriter,@Param("bNumber")Integer bNumber,
                   @Param("bSort")String bSort,@Param("bPub")String bPub,
                   @Param("bPrice")Double bPrice,@Param("bIntro")String bIntro,
                   @Param("bPic")byte[] bPic);

    int delete(@Param("bIsbn")Integer bIsbn);


    List<Book> listBook();



}