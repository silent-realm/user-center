package com.fate.usercenter;
import com.fate.core.framework.web.FateRequestMapperHandlerMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = {"com.fate"})
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

    @Bean
    public FateRequestMapperHandlerMapping fateRequestMapperHandlerMapping(){
        FateRequestMapperHandlerMapping fateRequestMapperHandlerMapping = new FateRequestMapperHandlerMapping();
        fateRequestMapperHandlerMapping.setOrder(1);
        return fateRequestMapperHandlerMapping;
    }
}
