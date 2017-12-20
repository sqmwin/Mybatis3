package com.sqm.selectcourse.dao;

import com.sqm.selectcourse.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public interface StudentDao {
    //通过sid获取学生对象及他选的课程
    Student selectStudentBySid(int sid);
    Student selectStudentBySid2(int sid);

    void insertStudent(Student student);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    @Insert("INSERT INTO student(sname) VALUES (#{sname})")
    void insertStudentByAnnotation(Student student);

    @Insert("INSERT INTO student(sname) VALUES (#{sname})")
    @SelectKey(statement = "SELECT @@IDENTITY",keyProperty = "sid",resultType = int.class,before = false)
    void insertStudentCatchSid(Student student);

    @Delete("DELETE FROM student WHERE sid=#{sid}")
    void deleteStudentBySidByAnnotation(int sid);

    @Update("UPDATE student SET sname=#{sname} WHERE sid=#{sid}")
    void updateStudentByAnnotation(Student student);

    @Select("SELECT * FROM student")
    List<Student> selectStudents();

    @Select("SELECT * FROM student WHERE sid=#{sid}")
    Student selectStudentBySidByAnnotation(int sid);

    @Select("SELECT * FROM student WHERE sid=#{student.id}")
    Student selectStudentByMap(Map<String, Object> map);

    @Select("SELECT * FROM student WHERE name LIKE CONCAT('%',#{sname},'%')")
    List<Student> selectStudentsBySName(String sname);
}
