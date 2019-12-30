package com.jyh.dao.po.result.user;

import com.jyh.dao.po.data.user.User;
import com.jyh.dao.po.result.common.CommonResult;
import lombok.Data;

import java.util.Hashtable;
import java.util.List;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Data
public class UserResult extends CommonResult {

    private List<User> users;
}
