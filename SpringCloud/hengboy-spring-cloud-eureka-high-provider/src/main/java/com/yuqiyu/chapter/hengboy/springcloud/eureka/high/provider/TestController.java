package com.yuqiyu.chapter.hengboy.springcloud.eureka.high.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/10/5
 * Time：2:46 PM
 * 个人博客：http://blog.yuqiyu.com
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    /**
     * 测试方法
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "this is test index";
    }
}
