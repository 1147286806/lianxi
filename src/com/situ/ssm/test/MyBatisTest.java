package com.situ.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
//加载Spring的核心配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatisTest {
 @Autowired
 private StudentDao studentDao;
 
 @Test
 public void test1() {
    List<Student> list = studentDao.findByName("student", "张三");
    for (Student student : list) {
       System.out.println(student);
    }
 }
 
 @Test
 public void test2() {
    List<Student> list = studentDao.findAll("id");
    for (Student student : list) {
       System.out.println(student);
    }
 }
}
