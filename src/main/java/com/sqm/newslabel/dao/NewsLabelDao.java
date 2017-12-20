package com.sqm.newslabel.dao;

import com.sqm.newslabel.pojo.NewsLabel1;
import com.sqm.newslabel.pojo.NewsLabel2;

import java.util.List;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public interface NewsLabelDao {
    //给出父栏目id,查询所有子孙栏目
    List<NewsLabel1> selectChildrenByParentId(int pid);

    //给出栏目id,查询此id的栏目及所有此栏目的子孙栏目
    List<NewsLabel1> selectNewsLabelById(int id);

    //根据pid查询所有父栏目,递归查询
    List<NewsLabel2> selectParentByParentId(int pid);
}
