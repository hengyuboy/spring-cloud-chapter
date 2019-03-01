package com.yuqiyu.chapter.hengboy.springcloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringCloud组件：搭建Eureka服务注册中心
 * 启动类入口
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/18
 * Time：5:46 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
        logger.info("【【【Spring Cloud Eureka Server 启动完成.】】】");
    }
}
