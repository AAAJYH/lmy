package com.jyh.dao.mysql.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jyh.dao.mapper.user.UserMapper;
import com.jyh.dao.mysql.user.UserDao;
import com.jyh.dao.po.data.user.User;
import com.jyh.dao.po.request.user.UserRequest;
import com.jyh.dao.po.result.user.UserResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserResult queryByRequest(UserRequest request) {
        UserResult result = new UserResult();

        try {
            LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper();

            if (request.getId() != null) {
                wrapper.eq(User::getId , request.getId());
            }

            if (request.isPaging()) {

            }else {
                List<User> userList = userMapper.selectList(wrapper);
                result.setUsers(userList);
                result.setSuccess();
            }
        }catch (Exception e) {

        }

        return result;
    }

}
