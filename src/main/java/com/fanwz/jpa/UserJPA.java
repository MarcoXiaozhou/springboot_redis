package com.fanwz.jpa;

import com.fanwz.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fanwz on 2018/5/24.
 */
public interface UserJPA extends JpaRepository<UserEntity,Long> {
}
