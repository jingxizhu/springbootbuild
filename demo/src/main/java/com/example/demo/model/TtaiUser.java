package com.example.demo.model;

import java.util.Date;

public class TtaiUser {
    private Long id;

    private String userAccount;

    private String userPwd;

    private String userNickname;

    private String userEmail;

    private Integer delSign;

    private Date createTxStamp;

    private Date lastupTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getDelSign() {
        return delSign;
    }

    public void setDelSign(Integer delSign) {
        this.delSign = delSign;
    }

    public Date getCreateTxStamp() {
        return createTxStamp;
    }

    public void setCreateTxStamp(Date createTxStamp) {
        this.createTxStamp = createTxStamp;
    }

    public Date getLastupTxStamp() {
        return lastupTxStamp;
    }

    public void setLastupTxStamp(Date lastupTxStamp) {
        this.lastupTxStamp = lastupTxStamp;
    }
}