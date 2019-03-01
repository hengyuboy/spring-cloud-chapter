package com.yuqiyu.chapter.hengboy.springcloud.eureka.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息提供者控制器
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/20
 * Time：2:09 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderController {
    /**
     * 测试返回的请求方法
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "this is eureka service provider";
    }
}
