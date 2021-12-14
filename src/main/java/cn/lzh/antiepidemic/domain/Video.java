package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [视频表](Video)
 * @author LZH
 * @version V1.0
 * @description zh - 视频表
 * @description en - Video
 * @since 2021/12/14 18:38
 */
public class Video {
    private Long id;
    private Long userId;
    private Long articleId;
    private String video;
    private Date gmtCreate;
    private Date gmtModified;

    public Video() {
    }

    public Video(Long id, Long userId, Long articleId, String video, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.userId = userId;
        this.articleId = articleId;
        this.video = video;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleId=" + articleId +
                ", video='" + video + '\'' +
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
