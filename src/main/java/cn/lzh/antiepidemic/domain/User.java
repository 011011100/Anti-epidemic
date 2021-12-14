package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [用户表](User)
 * @author LZH
 * @version V1.0
 * @description zh - 用户表
 * @description en - User
 * @since 2021/12/14 18:36
 */
public class User {
    private Long id;
    private String account;
    private String name;
    private String cipher;
    private String gender;
    private Date birthday;
    private String sign;
    private Date gmtCreate;
    private Date gmtModified;

    public User() {
    }

    public User(Long id, String account, String name, String cipher, String gender, Date birthday, String sign, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.cipher = cipher;
        this.gender = gender;
        this.birthday = birthday;
        this.sign = sign;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", cipher='" + cipher + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", sign='" + sign + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}


