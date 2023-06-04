package com.batch.concurrency.job.common;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.JdbcTransactionManager;

import javax.sql.DataSource;
@Configuration
@EnableBatchProcessing(transactionManagerRef = "batchTransactionManager")
public class CommonJobConfiguration {
    @Bean
    public JdbcTransactionManager batchTransactionManager(DataSource dataSource) {
        return new JdbcTransactionManager(dataSource);
    }
}
