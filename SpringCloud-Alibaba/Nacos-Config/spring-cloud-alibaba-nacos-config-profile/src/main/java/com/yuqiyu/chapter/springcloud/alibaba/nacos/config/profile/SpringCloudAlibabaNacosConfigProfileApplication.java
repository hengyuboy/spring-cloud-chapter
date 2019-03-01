package com.yuqiyu.chapter.springcloud.alibaba.nacos.config.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringCloud Nacos Config 多环境
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-01 15:16
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 */
@SpringBootApplication
public class SpringCloudAlibabaNacosConfigProfileApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudAlibabaNacosConfigProfileApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaNacosConfigProfileApplication.class, args);
    }

}
