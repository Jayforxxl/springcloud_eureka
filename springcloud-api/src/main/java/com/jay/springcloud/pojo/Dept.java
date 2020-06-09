package com.jay.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description:
 *
 * @author ZhangJieChao
 * @version 1.0
 * @date 2020/6/8 21:42
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//支持链式写法
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }



}
