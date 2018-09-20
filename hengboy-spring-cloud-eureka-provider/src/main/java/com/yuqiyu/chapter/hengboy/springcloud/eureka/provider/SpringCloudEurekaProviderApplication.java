package com.yuqiyu.chapter.hengboy.springcloud.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud组件：将微服务提供者注册到Eureka服务中心
 * 启动类入口
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/20
 * Time：2:04 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaProviderApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
        logger.info("「「「「「Eureka服务提供者启动完成.」」」」」");
    }
}
