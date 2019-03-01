package com.yuqiyu.chapter.hengboy.springcloud.eureka.high.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud组件：将服务提供者注册到Eureka集群
 * 入口类
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/10/5
 * Time：2:34 PM
 * 个人博客：http://blog.yuqiyu.com
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaHighProviderApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaHighProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaHighProviderApplication.class, args);
        logger.info("「「「「「服务启动完成.」」」」」");
    }
}
