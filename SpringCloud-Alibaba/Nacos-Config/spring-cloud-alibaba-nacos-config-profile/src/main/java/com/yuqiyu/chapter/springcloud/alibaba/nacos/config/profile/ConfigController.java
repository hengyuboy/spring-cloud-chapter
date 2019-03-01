package com.yuqiyu.chapter.springcloud.alibaba.nacos.config.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置控制器
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-01 15:16
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
     * data-id = hengboy-spring-cloud-config-profile.yaml
     * 会被
     * data-id = hengboy-spring-cloud-config-profile-dev.yaml
     * 所覆盖
     */
    @Value(value = "${hengboy.name:}")
    private String name;

    @RequestMapping(value = "/get")
    public String getConfig() {
        return this.name;
    }
}
