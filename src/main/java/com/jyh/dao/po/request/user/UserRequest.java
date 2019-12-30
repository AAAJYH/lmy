package com.jyh.dao.po.request.user;

import com.jyh.dao.po.request.common.CommonRequest;
import lombok.Data;

import java.util.Date;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Data
public class UserRequest extends CommonRequest {

    private Integer id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别（常量）
     */
    private Integer sex;

    /**
     * 介绍
     */
    private String intro;

    /**
     * 大区id
     */
    private Integer regionalId;

    /**
     * lol id
     */
    private String lolId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

}
