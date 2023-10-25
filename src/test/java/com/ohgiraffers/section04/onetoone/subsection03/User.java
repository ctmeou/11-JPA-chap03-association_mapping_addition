package com.ohgiraffers.section04.onetoone.subsection03;

import javax.persistence.*;

//계정에 대한 정보 설정
//FK가 UserInfo에 있는 경우
@Entity(name = "user3")
@Table(name = "tbl_user3")
public class User {

    @Id
    private Long userCode;
    private String userId;
    private String userPwd;
    @OneToOne(mappedBy = "user") //진짜 연관 관계가 가지고 있는 필드의 명칭 작성
    private UserInfo userInfo;

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
                //", userInfo=" + userInfo + 가짜 연관 관계인 곳에서 제거해줘야 됨
                '}';
    }

}
