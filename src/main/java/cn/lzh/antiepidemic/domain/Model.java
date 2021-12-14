package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [类别表](Model)
 * @author LZH
 * @version V1.0
 * @description zh - 类别表
 * @description en - Model
 * @since 2021/12/14 19:05
 */
public class Model {
    private Long id;
    private String type;
    private Date gmtCreate;
    private Date gmtModified;

    public Model() {
    }

    public Model(Long id, String type, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.type = type;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", type='" + type + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
