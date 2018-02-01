package com.situ.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.ssm.entity.Student;

public interface StudentDao {
	List<Student> findAll();

	List<Student> findByName(@Param("tableName")String string, @Param("name")String string2);

	List<Student> findAll(String string);

	Student findById(Integer id);

	void deleteById(Integer id);

	void updateById(@Param("id")Integer id, @Param("student")Student student);
}

