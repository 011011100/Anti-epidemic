package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [管理员表](Admin)
 * @author LZH
 * @version V1.0
 * @description zh - 管理员表
 * @description en - Admin
 * @since 2021/12/14 18:36
 */
public class Admin {
    private Long id;
    private String account;
    private String cipher;
    private String name;
    private Date gmtCreate;
    private Date gmtModified;

    public Admin() {
    }

    public Admin(Long id, String account, String cipher, String name, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.account = account;
        this.cipher = cipher;
        this.name = name;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", cipher='" + cipher + '\'' +
                ", name='" + name + '\'' +
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

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

