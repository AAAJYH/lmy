package com.jyh.dao.po.request.common;

import lombok.Data;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Data
public class CommonRequest {

    /**
     * 查询页码，从0开始
     */
    private int page = 0;

    /**
     *每页个数
     */
    private int pageSize = 10;

    /**
     * 开始查询的索引号
     */
    private int start = -1;

    /**
     * true分页
     */
    private boolean paging = false;

    /**
     * 获取开始查询的页数
     * @return
     */
    public int getStart() {
        return page * pageSize;
    }

    public boolean isPaging() {
        return paging;
    }

}
