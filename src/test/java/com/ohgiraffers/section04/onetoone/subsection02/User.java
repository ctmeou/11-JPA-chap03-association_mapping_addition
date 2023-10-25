package com.ohgiraffers.section04.onetoone.subsection02;

import javax.persistence.*;

//계정에 대한 정보 설정
//양방향 연관 관계 : user가 userInfo를 참조하고 userInfo도 user를 참조
@Entity(name = "user2")
@Table(name = "tbl_user2")
public class User {

    @Id
    private Long userCode;
    private String userId;
    private String userPwd;
    //User가 FK를 가지고 있다는 가정하에 mapping
    @OneToOne
    @JoinColumn(name = "userInfoCode")
    private UserInfo userInfo; //userInfo를 참조

    public User() {
    }

    public User(Long userCode, String userId, String userPwd, UserInfo userInfo) {
        this.userCode = userCode;
        this.userId = userId;
        this.userPwd = userPwd;
        this.userInfo = userInfo;
    }

    public Long getUserCode() {
        return userCode;
    }

    public void setUserCode(Long userCode) {
        this.userCode = userCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userCode=" + userCode +
                ", userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }

}
