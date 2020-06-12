package com.jay.springcloud.service;

import com.jay.springcloud.pojo.Dept;

import java.util.List;

/**
 * Description:
 *
 * @author ZhangJieChao
 * @version 1.0
 * @date 2020/6/8 23:16
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
