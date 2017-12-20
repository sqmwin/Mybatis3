package com.sqm.newslabel.pojo;

import java.util.Set;

/**
 * <p>
 * 电视栏目实体类,以一对多方式处理将当前类当作一方,所有子栏目当作多方,父查询子
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class NewsLabel1 {
    private Integer id;
    private String name;
    //关联属性,指定子栏目,即多方
    private Set<NewsLabel1> children;

    //getter and setter
    //toString()

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<NewsLabel1> getChildren() {
        return children;
    }

    public void setChildren(Set<NewsLabel1> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "NewsLaber1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
