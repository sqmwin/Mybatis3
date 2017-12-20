package com.sqm.newslabel.pojo;

/**
 * <p>
 *     多对一方式查询,子查询父
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class NewsLabel2 {
    private Integer id;
    private String name;
    private NewsLabel2 parent;

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

    public NewsLabel2 getParent() {
        return parent;
    }

    public void setParent(NewsLabel2 parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "NewsLabel2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent=" + parent +
                '}';
    }
}
