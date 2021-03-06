package com.panxiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * <p>
 * Created by PanXiang on 2017-06-26.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);

        /**
         * 关闭springboot启动Banner
         */
        // SpringApplication newRun= new SpringApplication(Application.class);
        // newRun.setBannerMode(Banner.Mode.OFF);
        // newRun.run(args);
    }
}