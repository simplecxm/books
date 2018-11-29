package com.lj.pojo;

public class Reader {
    private Integer rid;

    private String rname;

    private String rpwd;

    private Integer rage;

    private String rsex;

    public Reader(Integer rid, String rname, String rpwd, Integer rage, String rsex) {
        this.rid = rid;
        this.rname = rname;
        this.rpwd = rpwd;
        this.rage = rage;
        this.rsex = rsex;
    }

    public Reader() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRpwd() {
        return rpwd;
    }

    public void setRpwd(String rpwd) {
        this.rpwd = rpwd == null ? null : rpwd.trim();
    }

    public Integer getRage() {
        return rage;
    }

    public void setRage(Integer rage) {
        this.rage = rage;
    }

    public String getRsex() {
        return rsex;
    }

    public void setRsex(String rsex) {
        this.rsex = rsex == null ? null : rsex.trim();
    }
}