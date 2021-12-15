package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [点赞表](Like)
 * @author LZH
 * @version V1.0
 * @description zh - 点赞表
 * @description en - Like
 * @since 2021/12/14 19:05
 */
public class Like {
    private Long id;
    private Long userId;
    private Long articleId;
    private Long commentId;
    private Date gmtCreate;
    private Date gmtModified;

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", commentId=" + commentId +
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

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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

    public Like(Long id, Long userId, Long articleId, Long commentId, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.commentId = commentId;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Like() {
    }
}
