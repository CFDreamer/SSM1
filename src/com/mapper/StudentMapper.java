package com.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entiey.Student;

@Repository
public interface StudentMapper {
	/**
	 * ���һ��ѧ������
	 * @param s
	 */
  public int  insert(Student s);
  /**
   * ɾ��һ��ѧ������
   */
  public void delete(Integer id) ;
  
  /**
   * ����id��ѯһ��ѧ���Ķ���
   */
  public Student selectById(Integer id);
  /**
   * ��ѯ����ѧ����Ϣ
   */
  public List<Student> selectAll();
  
  /**
   * ��ϲ�������ѧ����Ϣ
   */
  
  //public int udate(@Param("id") Integer id,@Param("student") Student s);
}
