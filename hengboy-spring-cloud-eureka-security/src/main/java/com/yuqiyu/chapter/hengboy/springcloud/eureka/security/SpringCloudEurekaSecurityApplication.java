package com.yuqiyu.chapter.hengboy.springcloud.eureka.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringCloud组件：Eureka服务注册中心的安全认证
 * 启动入口类
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/28
 * Time：5:10 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaSecurityApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaSecurityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaSecurityApplication.class, args);
        logger.info("「「「「「服务注册中心启动完成.」」」」」");
    }
}
