package com.lj.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Record {
    private Integer id;

    private Integer bisbn;

    private String rname;

    private Date outdate;

    private Date indate;

    private BigDecimal penalty;

    public Record(Integer id, Integer bisbn, String rname, Date outdate, Date indate, BigDecimal penalty) {
        this.id = id;
        this.bisbn = bisbn;
        this.rname = rname;
        this.outdate = outdate;
        this.indate = indate;
        this.penalty = penalty;
    }

    public Record() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBisbn() {
        return bisbn;
    }

    public void setBisbn(Integer bisbn) {
        this.bisbn = bisbn;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }
}