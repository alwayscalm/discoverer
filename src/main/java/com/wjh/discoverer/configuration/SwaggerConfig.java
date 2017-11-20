package com.wjh.discoverer.configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import io.swagger.models.Contact;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/20
 * @since 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Predicate<String> apiPaths() {
        return Predicates.or(
                PathSelectors.regex("/.*")
        );
    }

    @Bean
    public Docket newsApi() {
        Parameter merId = new ParameterBuilder()
                .name("")
                .description("")
                .modelRef(new ModelRef(""))
                .parameterType("")
                .defaultValue("")
                .required(true)
                .build();
        Parameter secret = new ParameterBuilder()
                .name("")
                .description("")
                .modelRef(new ModelRef(""))
                .parameterType("")
                .defaultValue("")
                .required(true)
                .build();
        Parameter sign = new ParameterBuilder()
                .name("")
                .description("")
                .modelRef(new ModelRef(""))
                .parameterType("")
                .defaultValue(StringUtils.EMPTY)
                .required(false)
                .build();

        List<Parameter> headers = Arrays.asList(merId, secret, sign);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("morganStanley")
                .globalOperationParameters(headers)
                .apiInfo(apiInfo())
                .select()
                .paths(apiPaths())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("")
                .description("资源接口文档")
//                .contact(new Contact("一直很低调","","1223271200@qq.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0")
                .build();
    }
}
