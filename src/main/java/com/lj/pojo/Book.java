package com.lj.pojo;

public class Book {
    private Integer bid;

    private Integer bisbn;

    private String bname;

    private String bwriter;

    private Integer bnumber;

    private Integer boutnumber;

    private String bsort;

    private String bpub;

    private Long bprice;

    private String bintro;

    private String bpic;

    public Book(Integer bid, Integer bisbn, String bname, String bwriter, Integer bnumber, Integer boutnumber, String bsort, String bpub, Long bprice, String bintro, String bpic) {
        this.bid = bid;
        this.bisbn = bisbn;
        this.bname = bname;
        this.bwriter = bwriter;
        this.bnumber = bnumber;
        this.boutnumber = boutnumber;
        this.bsort = bsort;
        this.bpub = bpub;
        this.bprice = bprice;
        this.bintro = bintro;
        this.bpic = bpic;
    }

    public Book() {
        super();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getBisbn() {
        return bisbn;
    }

    public void setBisbn(Integer bisbn) {
        this.bisbn = bisbn;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter == null ? null : bwriter.trim();
    }

    public Integer getBnumber() {
        return bnumber;
    }

    public void setBnumber(Integer bnumber) {
        this.bnumber = bnumber;
    }

    public Integer getBoutnumber() {
        return boutnumber;
    }

    public void setBoutnumber(Integer boutnumber) {
        this.boutnumber = boutnumber;
    }

    public String getBsort() {
        return bsort;
    }

    public void setBsort(String bsort) {
        this.bsort = bsort == null ? null : bsort.trim();
    }

    public String getBpub() {
        return bpub;
    }

    public void setBpub(String bpub) {
        this.bpub = bpub == null ? null : bpub.trim();
    }

    public Long getBprice() {
        return bprice;
    }

    public void setBprice(Long bprice) {
        this.bprice = bprice;
    }

    public String getBintro() {
        return bintro;
    }

    public void setBintro(String bintro) {
        this.bintro = bintro == null ? null : bintro.trim();
    }

    public String getBpic() {
        return bpic;
    }

    public void setBpic(String bpic) {
        this.bpic = bpic == null ? null : bpic.trim();
    }
}