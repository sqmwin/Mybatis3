package com.sqm.pojo2;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Country {
    private Integer cid;
    private String cname;

    public Country() {
    }

    public Country(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
