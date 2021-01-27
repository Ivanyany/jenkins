package com.ivan.jenkins.service.impl;

import com.ivan.jenkins.entity.User;
import com.ivan.jenkins.mapper.UserMapper;
import com.ivan.jenkins.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Ivan
 * @since 2021-01-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
