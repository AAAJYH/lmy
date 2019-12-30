package com.jyh.dao.po.result.common;

import com.jyh.constant.ResultConstant;
import lombok.Data;

import java.util.List;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Data
public class CommonResult<T> {

    /**
     * 返回的状态
     */
    private int code;

    /**
     * 影响的行数
     */
    private int count;

    /**
     * 总页数
     */
    private long totalCount;

    /**
     * 返回页码
     */
    private int page;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 查询集合
     */
    private List<T> list;

    public boolean isSuccess() {
        return code == ResultConstant.Code.SUCCESS ? true : false;
    }

    public void setSuccess() {
        code = ResultConstant.Code.SUCCESS;
        message = ResultConstant.Message.SUCCESS_MESSAGE;
    }

    public void setValues(CommonResult<T> result, List<T> list) {
        if (list != null) {
            list = list;
            count = list.size();
        }
    }

}
