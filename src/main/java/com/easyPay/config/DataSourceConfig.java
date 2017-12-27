package com.easyPay.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment env;

    //    public ComboPooledDataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(env.getProperty("jdbc.driverClassName"));
//        dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
//        dataSource.setUser(env.getProperty("jdbc.username"));
//        dataSource.setPassword(env.getProperty("jdbc.password"));
//        dataSource.setMaxPoolSize(20);
//        dataSource.setMinPoolSize(5);
//        dataSource.setInitialPoolSize(10);
//        dataSource.setMaxIdleTime(300);
//        dataSource.setAcquireIncrement(5);
//        dataSource.setIdleConnectionTestPeriod(60);
//
//        return dataSource;
//    }

//    @Bean(name = "dataSource")
//    public DruidDataSource dataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
////            List<String> list = new ArrayList<>();
////            list.add("set");
////            list.add("names");
////            list.add("utf8mb4");
////            druidDataSource.setConnectionInitSqls(list);
//        druidDataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
//        druidDataSource.setUrl(env.getProperty("jdbc.url"));
//        druidDataSource.setUsername(env.getProperty("jdbc.username"));
//        druidDataSource.setPassword(env.getProperty("jdbc.password"));
//        druidDataSource.setMinIdle(1);
//        druidDataSource.setInitialSize(30);
//        druidDataSource.setMaxActive(40);
//        druidDataSource.setMaxWait(6000);
//        druidDataSource.setRemoveAbandonedTimeout(180);
//        druidDataSource.setTestWhileIdle(true);
//        druidDataSource.setTestOnBorrow(true);
//        druidDataSource.setTestOnReturn(false);
//        druidDataSource.setValidationQuery("SELECT 1");
//        druidDataSource.setValidationQueryTimeout(1);
//        druidDataSource.setTimeBetweenEvictionRunsMillis(30000);
//        druidDataSource.setMinEvictableIdleTimeMillis(120000);
//        druidDataSource.setPoolPreparedStatements(true);
//        druidDataSource.setDefaultAutoCommit(true);
//        druidDataSource.setLogAbandoned(true);
//        return druidDataSource;
//    }

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        dataSource.setMaxActive(40);
        dataSource.setInitialSize(30);
        dataSource.setMinIdle(1);
        dataSource.setMaxWait(6000);
        return dataSource;
    }
}

