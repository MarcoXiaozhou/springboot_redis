package com.fanwz.service;

import com.fanwz.entity.TestUserEntity;
import com.fanwz.entity.UserEntity;
import com.fanwz.jpa.UserJPA;
import com.fanwz.jpa.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fanwz on 2018/5/24.
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(UserService.class);
    /**
     * 用户持久化接口注入
     */
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserJPA userJPA;

    @Cacheable
    public List<UserEntity> list()
    {
        return userJPA.findAll();
    }
    /**
     * 查询全部用户
     *
     * @return
     */
    @Cacheable(cacheNames = "user.service.all")
    public List<TestUserEntity> findAll() {
        return userRepository.findAll();
    }

}
