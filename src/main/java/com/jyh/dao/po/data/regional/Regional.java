package com.jyh.dao.po.data.regional;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Data
@TableName("lmy_regional")
public class Regional {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 大区名称
     */
    private String name;

    /**
     * 简称
     */
    private String abbreviation;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Integer updateAdmin;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

}
