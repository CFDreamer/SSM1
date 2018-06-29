package com.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entiey.Student;

@Repository
public interface StudentMapper {
	/**
	 * 添加一个学生对象
	 * @param s
	 */
  public int  insert(Student s);
  /**
   * 删除一个学生对象
   */
  public void delete(Integer id) ;
  
  /**
   * 根据id查询一个学生的对象
   */
  public Student selectById(Integer id);
  /**
   * 查询所有学生信息
   */
  public List<Student> selectAll();
  
  /**
   * 混合参数更新学生信息
   */
  
  //public int udate(@Param("id") Integer id,@Param("student") Student s);
}
