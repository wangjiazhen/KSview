package org.ks;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;


/**
 * @author : Aaron
 *payLogin
 * create at:  2020-04-08  14:22
 *
 * description: application
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableTransactionManagement
@EnableDiscoveryClient
//@EnableFeignClients(
//        clients = {DataDicClient.class, SmsClient.class, CheckBigDataClient.class
//              })
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }
  @LoadBalanced
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }


}

