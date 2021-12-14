package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [评论表](Comment)
 * @author LZH
 * @version V1.0
 * @description zh - 评论表
 * @description en - Comment
 * @since 2021/12/14 18:37
 */
public class Comment {
    private Long id;
    private Long userId;
    private Long articleId;
    private String comment;
    private Date gmtCreate;
    private Date gmtModified;

    public Comment() {
    }

    public Comment(Long id, Long userId, Long articleId, String comment, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.comment = comment;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", comment='" + comment + '\'' +
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
