package com.lj.pojo;

public class Book {
    private Integer bid;

    private Integer bisbn;

    private String bname;

    private String bwriter;

    private Integer bnumber;

    private String bsort;

    private String bpub;

    private Double bprice;

    private String bintro;

    private byte[] bpic;

    public Book(Integer bid, Integer bisbn, String bname, String bwriter, Integer bnumber, String bsort, String bpub, Double bprice, String bintro, byte[] bpic) {
        this.bid = bid;
        this.bisbn = bisbn;
        this.bname = bname;
        this.bwriter = bwriter;
        this.bnumber = bnumber;
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

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public String getBintro() {
        return bintro;
    }

    public void setBintro(String bintro) {
        this.bintro = bintro == null ? null : bintro.trim();
    }

    public byte[] getBpic() {
        return bpic;
    }

    public void setBpic(byte[] bpic) {
        this.bpic = bpic;
    }
}