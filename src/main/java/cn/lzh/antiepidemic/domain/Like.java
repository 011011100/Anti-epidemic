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
}
