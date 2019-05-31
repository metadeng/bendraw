package com.lvtuben.bendraw.domain;

public class User {
    private Integer sid;
    private String useruame;
    private String password;
    private String phone;
    private String address;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getUseruame() {
        return useruame;
    }

    public void setUseruame(String useruame) {
        this.useruame = useruame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
