package com.java.patterns.book1.ch19.adapter0;

import java.util.Map;

/**
 * @author gongchunru
 * @description
 * @create 2018-06-26 上午11:58
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    //员工的基本信息
    private Map homeInfo = super.getUserHomeInfo();
    //员工的家庭信息
    private Map officeInfo = super.getUserOfficeInfo();
    //工作信息
    private Map baseInfo = super.getUserBaseInfo();

    // /* * 家庭地址 */
    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /* * 家庭电话号码 */
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
    /* *职位信息 */
    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }


    /**
    * @Author gongchunru
    * @Description
    * @Date 2018/6/26 下午3:32
    * @Param [id, version]
    * @return java.lang.String
    */
    public String getMobileNumber(Long id,Integer version) {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
    * @Author gongchunru
    * @Description
    * @Date
    * @Param 
    * @return 
    */
    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
                System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
    * @Author gongchunru
    * @Description
    * @Date 2018/6/26 下午3:21
    * @Param []
    * @return java.lang.String
    */
    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
}
