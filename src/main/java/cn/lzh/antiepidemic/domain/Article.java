package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [文章表](Article)
 * @author LZH
 * @version V1.0
 * @description zh - 文章表
 * @description en - Article
 * @since 2021/12/14 18:36
 */
public class Article {
    private Long id;
    private Long userId;
    private String context;
    private Date gmtCreate;
    private Date gmtModified;

    public Article() {
    }

    public Article(Long id, Long userId, String context, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userId = userId;
        this.context = context;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", userId=" + userId +
                ", context='" + context + '\'' +
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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
