package top.chenbin113.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //是基于Netflix Ribbon实现的一套客户端[consumer] 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

/*
applicationContext.xml == ConfigBean(@Configuration)
<bean id="userService" class=""/>
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
 */
