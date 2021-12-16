package cn.lzh.antiepidemic.domain;

import java.util.Date;

/**
 * [图像表](Image)
 *
 * @author LZH
 * @version V1.0
 * @description zh - 图像表
 * @description en - Image
 * @since 2021/12/14 18:38
 */
public class Image {
    private Long id;
    private String image;
    private Date gmtCreate;
    private Date gmtModified;

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", image='" + image + '\'' +
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Image(Long id, String image, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.image = image;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Image() {
    }
}
