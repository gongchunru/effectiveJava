package com.java.patterns.book1.ch19.adapter0;

import java.util.Map;

/**
 * 劳动服务公司的人员信息接口
 *
 * @author gongchunru
 * @create 2018/6/26 上午11:47
 */
public interface IOuterUser {

    /**
     * 基本信息，比如名称、性别、手机号码等
     */
    Map getUserBaseInfo();

    /**
     * 工作区域信息
      * @return
     */
    Map getUserOfficeInfo();

    /**
     * 用户的家庭信息
     * @return
     */
    Map getUserHomeInfo();


}
