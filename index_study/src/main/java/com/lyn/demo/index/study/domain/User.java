package com.lyn.demo.index.study.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用户信息
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 2211555506238083813L;

    private Long id;

    private String userNo;

    private String userName;

    private Byte isVip;

    private String nickName;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Byte yn;

}
