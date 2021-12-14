package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [抗疫英雄表](Hero)
 * @author LZH
 * @version V1.0
 * @description zh - 抗疫英雄表
 * @description en - Hero
 * @since 2021/12/14 18:37
 */
public class Hero {
    private Long id;
    private Long modelId;
    private Long articleId;
    private String name;
    private Date gmtCreate;
    private Date gmtModified;

    public Hero() {
    }

    public Hero(Long id, Long modelId, Long articleId, String name, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.modelId = modelId;
        this.articleId = articleId;
        this.name = name;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", articleId=" + articleId +
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

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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
