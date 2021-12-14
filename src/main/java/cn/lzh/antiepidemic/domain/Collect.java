package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [收藏表](Collect)
 * @author LZH
 * @version V1.0
 * @description zh - 收藏表
 * @description en - Collect
 * @since 2021/12/14 18:37
 */
public class Collect {
    private Long id;
    private Long userId;
    private Long articleId;
    private Date gmtCreate;
    private Date gmtModified;

    public Collect() {
    }

    public Collect(Long id, Long userId, Long articleId, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleId=" + articleId +
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

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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
