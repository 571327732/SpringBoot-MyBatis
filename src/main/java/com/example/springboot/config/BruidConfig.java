/*
package com.example.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BruidConfig {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druid(){
        return new DruidDataSource();
    }
    //配置Druid监控
    //1.配置一个后台管理的Servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams=new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123123");
        initParams.put("allow","");//默认就是所有访问

        bean.setInitParameters(initParams);
        return bean;
    }

    //配置一个监控的Filter
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new WebStatFilter());

        Map<String,String>initParams=new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");
        filter.setInitParameters(initParams);
        filter.setUrlPatterns(Arrays.asList("/*"));
        return filter;
    }
}
*/
