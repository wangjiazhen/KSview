package org.ks.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author : Aaron
 *
 * create at:  2020-05-23  18:47
 *
 * description: SwaggerConfig
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {
  /**
   * 创建API
   */
  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        // 详细定制
        .apiInfo(apiInfo("2.0.0"))
        .select()
        // 指定当前包路径
        .apis(RequestHandlerSelectors.basePackage("org.ks.sys"))
        // 扫描所有
        .paths(PathSelectors.any())
        .build();
  }

  /**
   * 添加摘要信息
   */
  private ApiInfo apiInfo(String version) {
    // 用ApiInfoBuilder进行定制
    return new ApiInfoBuilder()
        .title("view接口文档")
        .version(version)
        .build();
  }

}

