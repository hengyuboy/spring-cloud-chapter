package com.yuqiyu.chapter.springcloud.alibaba.nacos.config.yaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置内容测试
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-01 11:41
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 */
@RestController
@RequestMapping(value = "/config")
@RefreshScope
public class ConfigController {
    /**
     * 读取hengboy.name配置信息
     */
    @Value(value = "${hengboy.name:}")
    private String userName;
    /**
     * 读取hengboy.age配置信息
     */
    @Value(value = "${hengboy.age:}")
    private String userAge;

    /**
     * 获取配置内容
     *
     * @return
     */
    @RequestMapping(value = "/get")
    public String getConfig() {
        return userName + ":" + userAge;
    }

}
