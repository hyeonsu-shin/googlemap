package com.example.googlemap;

public class UserAccount {

    private String idToken;     // Firebase Uid ( 고유 토큰 정보)
    private String emailId;     // 이메일 아이디
    private String password;    // 비밀번호
    private String group;       // 그룹



    public UserAccount() { }

    public String getIdToken() {return idToken;}

    public void setIdToken(String idToken) {this.idToken = idToken;}

    public String getEmailId() {return emailId;}

    public void setEmailId(String emailId) {this.emailId = emailId;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getGroup() {return group;}

    public void setGroup(String group) {this.group = group;}

}
