package com.batch.concurrency.job.sgpopulationjob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "batch.job.parameters.sgpopulationjob")
public class SgPopulationJobConfig {
    private String delimiter;
    private int linesToSkip;
    private String folderPath;
    private String filenamePattern;
    private String[] fieldNames;
}
