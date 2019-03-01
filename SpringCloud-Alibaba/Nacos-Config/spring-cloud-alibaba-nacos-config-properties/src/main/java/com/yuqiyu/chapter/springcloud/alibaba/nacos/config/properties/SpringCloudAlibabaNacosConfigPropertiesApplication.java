package com.yuqiyu.chapter.springcloud.alibaba.nacos.config.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Nacos Config Properties方式
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-01 11:20
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 */
@SpringBootApplication
public class SpringCloudAlibabaNacosConfigPropertiesApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(SpringCloudAlibabaNacosConfigPropertiesApplication.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCloudAlibabaNacosConfigPropertiesApplication.class, args);
        while (true) {
            //当动态配置刷新时，会更新到 Enviroment中，因此这里每隔一秒中从Enviroment中获取配置
            String userName = applicationContext.getEnvironment().getProperty("hengboy.name");
            String userAge = applicationContext.getEnvironment().getProperty("hengboy.age");
            logger.info("配置信息，名称：{}，年龄：{}", userName, userAge);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
