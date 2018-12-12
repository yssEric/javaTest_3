package com.hk.test;

import com.hk.entity.dataModel;
import com.hk.entity.saveDao;

import java.util.Iterator;
import java.util.List;

/**
 * @program: javaTest 面向接口编程
 * @description: 全新测试类
 * @author: Mr.Yi
 * @create: 2018-12-05 11:18
 **/
public class XFTest {
    public static void main(String[] args) {

        //简单数据插入
        //saveDao.save();

        //条件查询
        //System.out.println(saveDao.getData());

        saveDao.save();

        //条件list查询
        List<dataModel> listArly = saveDao.getListData();
        Iterator igor = listArly.iterator();

        while (igor.hasNext()) {
            System.out.println(igor.next());
        }

    }
}

