package com.fanwz.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by fanwz on 2018/5/24.
 */
@Entity
@Table(name = "test_user_info")
@Data
public class TestUserEntity implements Serializable {

    @Id
    @Column(name = "ui_id")
    @GeneratedValue
    private Integer userId;

    @Column(name = "ui_name")
    private String userName;

    @Column(name = "ui_password")
    private String userPassword;

    @Column(name = "ui_age")
    private Integer userAge;
}
