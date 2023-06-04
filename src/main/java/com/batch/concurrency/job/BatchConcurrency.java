package com.batch.concurrency.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.batch.concurrency.job.common",
        "com.batch.concurrency.job.sgpopulationjob"
})
public class BatchConcurrency {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(BatchConcurrency.class, args)));
    }
}