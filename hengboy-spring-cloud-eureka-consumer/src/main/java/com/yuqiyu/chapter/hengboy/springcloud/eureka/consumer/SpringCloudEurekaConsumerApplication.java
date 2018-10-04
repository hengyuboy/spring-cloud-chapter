package com.yuqiyu.chapter.hengboy.springcloud.eureka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCloud组件：Eureka的服务发现与消费
 * 启动入口类
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/29
 * Time：5:54 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaConsumerApplication {
    /**
     * 实例化RestTemplate对象实例
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerApplication.class, args);
        logger.info("「「「「「服务消费者启动完成」」」」」");
    }
}
