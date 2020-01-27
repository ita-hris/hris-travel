package com.itechart.hris.hristravel.config;

import java.util.List;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${dozer.file.path}")
    private String dozerFilePath;

    @Bean
    public Mapper dozerBeanMapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(List.of(dozerFilePath));
        return mapper;
    }
}
