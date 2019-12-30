package com.jyh.dao.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyh.dao.po.data.user.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
