package com.cognizant.difference.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.cognizant.difference.springdata")
@EntityScan(basePackages = "com.cognizant.difference.model")
@EnableTransactionManagement
public class SpringDataConfig {
}
