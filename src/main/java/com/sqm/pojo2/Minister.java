package com.sqm.pojo2;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Minister {
    private Integer mid;
    private String mname;
    private Country country;

    public Minister() {
    }

    public Minister(Integer mid, String mname, Country country) {
        this.mid = mid;
        this.mname = mname;
        this.country = country;
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
        this.mname = mname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", country=" + country.toString() +
                '}';
    }
}
