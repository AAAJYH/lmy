package com.jyh.dao.mysql.user;

import com.jyh.dao.po.request.user.UserRequest;
import com.jyh.dao.po.result.user.UserResult;
import org.springframework.stereotype.Repository;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Repository
public interface UserDao {

    /**
     * 多条件查询
     * @param request
     * @return
     */
    UserResult queryByRequest(UserRequest request);

}
