package com.yuqiyu.chapter.hengboy.springcloud.eureka.register.away;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud组件：Eureka服务注册是采用主机名还是IP地址？
 * 启动类入口
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/21
 * Time：4:55 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaRegisterAwayApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaRegisterAwayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaRegisterAwayApplication.class, args);
        logger.info("「「「「「Eureka服务注册方式启动完成.」」」」」");
    }
}
