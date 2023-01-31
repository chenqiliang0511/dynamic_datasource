package com.chen.learn.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 类的注释
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/01/30  12:09
 */
@Configuration
public class MybatisConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDatasource(){
        return DruidDataSourceBuilder.create().build();
    }
}
