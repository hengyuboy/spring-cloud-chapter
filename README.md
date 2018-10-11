SpringCloud企业级核心技术，对应简书《Spring Cloud 核心技术》专题配套源码

### 微信公众号在下方

## 学习目录推荐
* SpringBoot配套源码地址：[访问码云查看源码](https://gitee.com/hengboy/spring-boot-chapter)、[访问GitHub查看源码](https://github.com/hengyuboy/spring-boot-chapter)
* SpringBoot相关系列文章请访问：[目录：SpringBoot学习目录](http://www.jianshu.com/p/9a08417e4e84)
* QueryDSL相关系列文章请访问：[QueryDSL通用查询框架学习目录](http://www.jianshu.com/p/99a5ec5c3bd5)
* SpringDataJPA相关系列文章请访问：[目录：SpringDataJPA学习目录](http://www.jianshu.com/p/615ed9c1fe84)

## 开源信息
这段时间一直在编写开源的相关框架，致力于公司使用的框架升级以及开源计划，将公司使用到的`工具`以及`插件`进行升级重构并且开源。
- 代码生成器（Code-Builder）
`code-builder`代码生成器根据你提供的模板文件（目前支持`freemarker`）自动生成实体类，可以很大很有效的提高开发效率。
`Gitee地址`：[https://gitee.com/hengboy/code-builder](https://gitee.com/hengboy/code-builder)
`Github地址`：[https://github.com/hengyuboy/code-builder](https://github.com/hengyuboy/code-builder)
- 持久化框架（MyBatis-Enhance）
`mybatis-enhance`是一个对`mybatis`框架的增强封装，提供一系列的内部方法来完成单表数据的操作，多表数据提供`DSL`方式进行操作。
`Gitee地址`：[https://gitee.com/hengboy/mybatis-enhance](https://gitee.com/hengboy/mybatis-enhance)
`Github地址`：[https://github.com/hengyuboy/mybatis-enhance](https://github.com/hengyuboy/mybatis-enhance)
- 自动分页插件
`MyBatis-Pageable`是一款自动化分页的插件，基于`MyBatis`内部的插件`Interceptor`拦截器编写完成，拦截`Executor.query`的两个重载方法计算出分页的信息以及根据配置的数据库`Dialect`自动执行不同的查询语句完成总数量的统计。
`Gitee地址`：[https://gitee.com/hengboy/mybatis-pageable](https://gitee.com/hengboy/mybatis-pageable)

## 简书整套文档以及源码解析

|专题编号|专题名称|专题描述|
|---|---|---|
|001		| [Spring Boot 核心技术](http://www.jianshu.com/c/3f69deddbed3)			|讲解SpringBoot一些企业级层面的核心组件|
|002		| [Spring Cloud 核心技术](http://www.jianshu.com/c/1faac22666e7)		|对Spring Cloud核心技术全面讲解|
|003		| [QueryDSL 核心技术](http://www.jianshu.com/c/ab4789177827)			|全面讲解QueryDSL核心技术以及基于SpringBoot整合SpringDataJPA|
|004		| [SpringDataJPA 核心技术](http://www.jianshu.com/c/f1b269bb2fd6)		|全面讲解SpringDataJPA核心技术|

## 【Spring Cloud 核心技术】

### SpringCloud Eureka
|章节		| 文章名称（Eureka组件）|源码项目名称|
|---|---|---|
|1         | [初识SpringCloud微服务解决方案](http://blog.yuqiyu.com/spring-cloud-look.html)|-|
|2         | [SpringCloud组件：搭建Eureka服务注册中心](http://blog.yuqiyu.com/spring-cloud-eureka.html)|hengboy-spring-cloud-eureka|
|3         | [SpringCloud组件：将微服务提供者注册到Eureka服务中心](http://blog.yuqiyu.com/spring-cloud-eureka-provider.html)|hengboy-spring-cloud-eureka-provider|
|4         |[SpringCloud组件：Eureka服务注册是采用主机名还是IP地址？](http://blog.yuqiyu.com/spring-cloud-eureka-register-away.html)|hengboy-spring-cloud-eureka-register-away|
|5         |[SpringCloud组件 & 源码剖析：Eureka服务注册方式流程全面分析](http://blog.yuqiyu.com/spring-cloud-eureka-register-away-code.html)|-|
|6         |[SpringCloud组件：Eureka服务注册中心的失效剔除与自我保护机制](http://blog.yuqiyu.com/spring-cloud-eureka-preservation.html)|-|
|7         |[SpringCloud组件：你的Eureka服务注册中心安全吗？](http://blog.yuqiyu.com/spring-cloud-eureka-security.html)|hengboy-spring-cloud-eureka-security|
|8         |[SpringCloud组件：Eureka的服务发现与消费](http://blog.yuqiyu.com/spring-cloud-eureka-consumer.html)|hengboy-spring-cloud-eureka-consumer|
|9         |[SpringCloud组件：Eureka高可用集群部署](http://blog.yuqiyu.com/spring-cloud-eureka-high.html)|hengboy-spring-cloud-eureka-high|
|10        |[SpringCloud组件：Eureka服务注册中心内置的REST节点列表](http://blog.yuqiyu.com/spring-cloud-eureka-rest.html)|-|
|-|待续....|-|

### SpringCloud Ribbon
|章节		| 文章名称（Ribbon组件）  |源码项目名称|
|---|---|---|
|01         | SpringCloud组件：HTTP请求杀手之RestTemplate|hengboy-spring-cloud-eureka|
|02         |SpringCloud组件：Ribbon服务间访问的负载均衡实现|hengboy-spring-cloud-eureka-provider|
|03         |SpringCloud组件：Ribbon负载均衡权重策略|hengboy-spring-cloud-eureka-consumer|
|04         |SpringCloud组件：Ribbon配置优化以及重试机制|hengboy-spring-cloud-eureka-high|
|-|待续....|-|

### SpringCloud Gateway
|章节|文章名称（Gateway统一网关）|源码项目名称|
|---|---|---|
|01|SpringCloud组件：Gateway作用以及工作流程|-|
|02|SpringCloud组件：Gateway断言时间段设置|hengboy-spring-cloud-predicate|
|03|SpringCloud组件：Gateway配置RateLimiter|hengboy-spring-cloud-rate-limiter|
|04|SpringCloud组件：Gateway全局跨域cors配置|hengboy-spring-cloud-cors|
|-|待续....|-|

### SpringCloud Feign
|章节|文章名称（Feign）|源码项目名称|
|---|---|---|
|01|SpringCloud组件：创建你的第一个Feign客户端|hengboy-spring-cloud-feign-client|
|02|SpringCloud组件：Feign整合Hystrix实现熔断机制|hengboy-spring-cloud-feign-hystrix|
|03|SpringCloud组件：Feign配置@Primary解决多个实现问题|hengboy-spring-cloud-feign-primary|
|04|SpringCloud组件：Feign日志配置|hengboy-spring-cloud-feign-logger|
|-|待续....|-|
### SpringCloud OAuth2
|章节|文章名称（OAuth2）|源码项目名称|
|---|---|---|
|01|SpringCloud组件：OAuth2 & SpringSecurity统一认证中心 - 认证配置|hengboy-spring-cloud-oauth2-provider|
|02|SpringCloud组件：OAuth2 & SpringSecurity统一认证中心 - 安全配置|hengboy-spring-cloud-oauth2-provider|
|03|SpringCloud组件：OAuth2 & SpringSecurity统一认证中心 - 用户信息|hengboy-spring-cloud-oauth2-provider|
|04|SpringCloud组件：业务逻辑微服务访问统一认证进行中心鉴权|hengboy-spring-cloud-oauth2-consumer|
|-|待续....|-|

### SpringCloud Swagger2
|章节|文章名称（Swagger2）|源码项目名称|
|---|---|---|
|01|SpringCloud组件：Swagger2基本配置|hengboy-spring-cloud-swagger|
|02|SpringCloud组件：Swagger2返回Model配置|hengboy-spring-cloud-swagger-model|
|03|SpringCloud组件：Swagger2在OAuth2下怎么Try It？|hengboy-spring-cloud-swagger-oauth2|
|04|SpringCloud组件：Swagger2 & Zuul配置分布式文档|hengboy-spring-cloud-swagger-zuul|
|-|待续....|-|

### SpringCloud Zuul
|章节|文章名称（Zuul）|源码项目名称|
|---|---|---|
|01|SpringCloud组件：Zuul可以用来做什么？|-|
|02|SpringCloud组件：Zuul与Nginx的爱恨情仇|-|
|03|SpringCloud组件：根据服务名称进行路由配置的两种方式|hengboy-spring-cloud-zuul|
|04|SpringCloud组件：Zuul的动态路由配置|hengboy-spring-cloud-zuul-route|
|05|SpringCloud组件：Zuul下不同版本服务的路由配置|hengboy-spring-cloud-zuul-route-version|
|06|SpringCloud组件：Zuul下的敏感头信息处理|hengboy-spring-cloud-zuul-header|
|07|SpringCloud组件：Zuul下的文件上传|hengboy-spring-cloud-zuul-upload|
|08|SpringCloud组件：Zuul自定义过滤器以及配置|hengboy-spring-cloud-zuul-filter|
|09|SpringCloud组件：Zuul请求超时解决方案|hengboy-spring-cloud-zuul-timeout|
|-|待续....|-|



> 对`SpringBoot`以及`SpringCloud`感兴趣的同学可以关注我的公众号，
公众号内回复`加群`可以获取技术交流群号，面对面跟`恒宇少年`交流技术，少年也会尽可能的为大家解决问题。

![恒宇少年](https://upload-images.jianshu.io/upload_images/4461954-d2f05efda75fd3c9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

