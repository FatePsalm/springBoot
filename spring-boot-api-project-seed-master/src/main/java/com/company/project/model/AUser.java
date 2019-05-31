package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "a_user")
public class AUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户账号（电话号码）
     */
    private String account;

    /**
     * 用户名
     */
    private String nickname;

    /**
     * 姓名
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证号
     */
    private String card;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别0-男 1-女
     */
    private Integer sex;

    /**
     * 手机号码
     */
    @Column(name = "u_phone")
    private String uPhone;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 信誉度
     */
    private Integer credit;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 用户签名
     */
    private String sign;

    /**
     * 推荐人 
     */
    private String recommend;

    /**
     * 经销商ID
     */
    @Column(name = "dealers_id")
    private String dealersId;

    /**
     * 名称
     */
    @Column(name = "dealers_name")
    private String dealersName;

    /**
     * 营业执照编号
     */
    @Column(name = "business_num")
    private String businessNum;

    /**
     * 法人
     */
    @Column(name = "legal_person")
    private String legalPerson;

    /**
     * 对公账号
     */
    @Column(name = "brought_account")
    private String broughtAccount;

    /**
     * 开户行
     */
    @Column(name = "opening_bank")
    private String openingBank;

    /**
     * 执照照片
     */
    @Column(name = "lcense_img")
    private String lcenseImg;

    /**
     * 买家序号
     */
    @Column(name = "buyer_num")
    private String buyerNum;

    /**
     * 客户经理
     */
    @Column(name = "staff_id")
    private Integer staffId;

    /**
     * 头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 用户等级
     */
    private Integer grade;

    /**
     * 用户类型
     */
    private Integer type;

    /**
     * 是否有效
     */
    private Integer flag;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户账号（电话号码）
     *
     * @return account - 用户账号（电话号码）
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户账号（电话号码）
     *
     * @param account 用户账号（电话号码）
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取用户名
     *
     * @return nickname - 用户名
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户名
     *
     * @param nickname 用户名
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取姓名
     *
     * @return u_name - 姓名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置姓名
     *
     * @param uName 姓名
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取身份证号
     *
     * @return card - 身份证号
     */
    public String getCard() {
        return card;
    }

    /**
     * 设置身份证号
     *
     * @param card 身份证号
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别0-男 1-女
     *
     * @return sex - 性别0-男 1-女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别0-男 1-女
     *
     * @param sex 性别0-男 1-女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号码
     *
     * @return u_phone - 手机号码
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 设置手机号码
     *
     * @param uPhone 手机号码
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取信誉度
     *
     * @return credit - 信誉度
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * 设置信誉度
     *
     * @param credit 信誉度
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * 获取积分
     *
     * @return integration - 积分
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 设置积分
     *
     * @param integration 积分
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取用户签名
     *
     * @return sign - 用户签名
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置用户签名
     *
     * @param sign 用户签名
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 获取推荐人 
     *
     * @return recommend - 推荐人 
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * 设置推荐人 
     *
     * @param recommend 推荐人 
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    /**
     * 获取经销商ID
     *
     * @return dealers_id - 经销商ID
     */
    public String getDealersId() {
        return dealersId;
    }

    /**
     * 设置经销商ID
     *
     * @param dealersId 经销商ID
     */
    public void setDealersId(String dealersId) {
        this.dealersId = dealersId;
    }

    /**
     * 获取名称
     *
     * @return dealers_name - 名称
     */
    public String getDealersName() {
        return dealersName;
    }

    /**
     * 设置名称
     *
     * @param dealersName 名称
     */
    public void setDealersName(String dealersName) {
        this.dealersName = dealersName;
    }

    /**
     * 获取营业执照编号
     *
     * @return business_num - 营业执照编号
     */
    public String getBusinessNum() {
        return businessNum;
    }

    /**
     * 设置营业执照编号
     *
     * @param businessNum 营业执照编号
     */
    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    /**
     * 获取法人
     *
     * @return legal_person - 法人
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * 设置法人
     *
     * @param legalPerson 法人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * 获取对公账号
     *
     * @return brought_account - 对公账号
     */
    public String getBroughtAccount() {
        return broughtAccount;
    }

    /**
     * 设置对公账号
     *
     * @param broughtAccount 对公账号
     */
    public void setBroughtAccount(String broughtAccount) {
        this.broughtAccount = broughtAccount;
    }

    /**
     * 获取开户行
     *
     * @return opening_bank - 开户行
     */
    public String getOpeningBank() {
        return openingBank;
    }

    /**
     * 设置开户行
     *
     * @param openingBank 开户行
     */
    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    /**
     * 获取执照照片
     *
     * @return lcense_img - 执照照片
     */
    public String getLcenseImg() {
        return lcenseImg;
    }

    /**
     * 设置执照照片
     *
     * @param lcenseImg 执照照片
     */
    public void setLcenseImg(String lcenseImg) {
        this.lcenseImg = lcenseImg;
    }

    /**
     * 获取买家序号
     *
     * @return buyer_num - 买家序号
     */
    public String getBuyerNum() {
        return buyerNum;
    }

    /**
     * 设置买家序号
     *
     * @param buyerNum 买家序号
     */
    public void setBuyerNum(String buyerNum) {
        this.buyerNum = buyerNum;
    }

    /**
     * 获取客户经理
     *
     * @return staff_id - 客户经理
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 设置客户经理
     *
     * @param staffId 客户经理
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取头像
     *
     * @return head_img - 头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置头像
     *
     * @param headImg 头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取用户等级
     *
     * @return grade - 用户等级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置用户等级
     *
     * @param grade 用户等级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 获取用户类型
     *
     * @return type - 用户类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型
     *
     * @param type 用户类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取是否有效
     *
     * @return flag - 是否有效
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否有效
     *
     * @param flag 是否有效
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}