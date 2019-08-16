package org.xujiale.dubbodemo.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private String userAccount;
    private String userNickname;

    public User(String userAccount, String userNickname) {
        this.userAccount = userAccount;
        this.userNickname = userNickname;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userAccount='" + userAccount + '\'' +
                ", userNickname='" + userNickname + '\'' +
                '}';
    }
}
