package com.jay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 *
 * @author ZhangJieChao
 * @version 1.0
 * @date 2020/6/9 22:00
 */
//启动之后，访问 http://localhost:7001/
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 表示是 Eureka服务端的启动类，可以接受别人注册进来~
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
