package com.sqm.selectcourse.pojo;

import java.io.Serializable;
import java.util.Set;

/**
 * <p>
 *     双向关联类中的toString中只有一个能输出对方,不能双向均可输出对方,否则输出时会递归,程序报错
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Student implements Serializable{
    private Integer sid;
    private String sname;
    private Set<Course> courses;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", courses=" + courses +
                '}';
    }
}
