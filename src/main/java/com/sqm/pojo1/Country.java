package com.sqm.pojo1;

import java.util.Set;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Country {
    private Integer cid;
    private String cname;
    private Set<Minister> ministers;

    public Country() {
    }

    public Country(Integer cid, String cname, Set<Minister> ministers) {
        this.cid = cid;
        this.cname = cname;
        this.ministers = ministers;
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

    public Set<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(Set<Minister> ministers) {
        this.ministers = ministers;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ministers=" + ministers +
                '}';
    }
}
