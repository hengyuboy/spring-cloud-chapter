package com.yuqiyu.chapter.hengboy.springcloud.eureka.high;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringCloud组件：Eureka高可用集群部署
 * 入口类
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/21
 * Time：3:54 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaHighApplication {

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaHighApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaHighApplication.class, args);
        logger.info("「「「「「Eureka服务注册中心启动完成」」」」」");
    }
}
