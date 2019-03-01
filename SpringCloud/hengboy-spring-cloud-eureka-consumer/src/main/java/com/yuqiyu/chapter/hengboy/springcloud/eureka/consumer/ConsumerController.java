package com.yuqiyu.chapter.hengboy.springcloud.eureka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者控制器
 *
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/9/29
 * Time：5:55 PM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(ConsumerController.class);
    /**
     * 注入服务客户端实例
     */
    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 注入restTemplate模板
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 服务消费者业务逻辑方法
     * 该方法使用restTemplate访问获取返回数据
     *
     * @return
     */
    @RequestMapping(value = "/logic")
    public String home() {
        return "this is home page";
    }

    /**
     * 请求地址
     * 输出服务的基本信息
     */
    @RequestMapping(value = "/index")
    public void index() {
        discoveryClient.getInstances("hengboy-spring-cloud-eureka-consumer")
                .stream()
                .forEach(
                        instance -> {
                            logger.info("服务地址：{}，服务端口号：{}，服务实例编号：{}，服务地址：{}", instance.getHost(), instance.getPort(), instance.getServiceId(), instance.getUri());
                            String response = restTemplate.getForEntity("http://" + instance.getServiceId() + "/consumer/logic", String.class).getBody();
                            logger.info("响应内容：{}", response);
                        }

                );
    }
}
