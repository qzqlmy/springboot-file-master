package com.shipin.shangchuan.service;

import com.shipin.shangchuan.dao.ShiPinDao;
import com.shipin.shangchuan.model.Shipin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class ShiPinService {

    @Autowired
    private ShiPinDao shiPinDao;

    //插入
    public int insertUrl(String name,String lujing,String url){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=lujing=="+lujing+"\n");
        System.out.print("开始插入=url=="+url+"\n");
        int jieguo=shiPinDao.insertUrl(name,lujing,url);
        System.out.print("插入结果==="+jieguo+"\n");
        return jieguo;
    }
    //查询
    public List<Shipin> selectShipin(){
        List<Shipin> shipins=shiPinDao.selectShipin();
        return  shipins;
    }
}
