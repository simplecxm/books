package com.lj.pojo;

public class Manager {
    private Integer mid;

    private String mname;

    private String mpwd;

    public Manager(Integer mid, String mname, String mpwd) {
        this.mid = mid;
        this.mname = mname;
        this.mpwd = mpwd;
    }

    public Manager() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd == null ? null : mpwd.trim();
    }
}