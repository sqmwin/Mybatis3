package com.sqm.selectcourse.dao;

import com.sqm.selectcourse.pojo.Student;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public interface StudentDao {
    //通过sid获取学生对象及他选的课程
    Student selectStudentBySid(int sid);
}
