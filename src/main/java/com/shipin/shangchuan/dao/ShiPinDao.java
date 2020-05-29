package com.shipin.shangchuan.dao;

import com.shipin.shangchuan.model.Shipin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ShiPinDao {

    //插入
    @Insert({"insert into shipins (name,lujing,url) values (#{name},#{lujing},#{url})"})
    public int insertUrl(@Param("name")String name,@Param("lujing")String lujing,@Param("url")String url);

    //查询
    @Select("select * from shipins")
    public List<Shipin> selectShipin();
}
