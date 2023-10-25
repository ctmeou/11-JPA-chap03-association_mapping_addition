package com.ohgiraffers.section04.onetoone.subsection03;

import javax.persistence.*;

//FK가 UserInfo에 있는 경우
@Entity(name = "user_info3")
@Table(name = "tbl_user_info3")
public class UserInfo {

    @Id
    private Long userCode; //User와 동일하게 작성
    private String nickname;
    private String phone;
    @OneToOne
    @JoinColumn(name = "userCode") //userInfo가 주인이기 때문에
    private User user;

    public UserInfo() {
    }

    public UserInfo(Long userCode, String nickname, String phone, User user) {
        this.userCode = userCode;
        this.nickname = nickname;
        this.phone = phone;
        this.user = user;
    }

    public Long getUserCode() {
        return userCode;
    }

    public void setUserCode(Long userCode) {
        this.userCode = userCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userCode=" + userCode +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                '}';
    }

}
