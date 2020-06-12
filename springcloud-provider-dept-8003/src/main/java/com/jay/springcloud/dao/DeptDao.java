package com.jay.springcloud.dao;

import com.jay.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author ZhangJieChao
 * @version 1.0
 * @date 2020/6/8 23:01
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
