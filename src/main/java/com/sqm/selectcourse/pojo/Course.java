package com.sqm.selectcourse.pojo;

import java.io.Serializable;
import java.util.Set;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Course implements Serializable {
    private Integer cid;
    private String cname;
    private Set<Student> students;

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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
