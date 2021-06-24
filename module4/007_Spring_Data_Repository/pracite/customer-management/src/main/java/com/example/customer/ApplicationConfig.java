package com.example.customer;

import com.example.customer.formatter.ProvinceFormatter;
import com.example.customer.service.ProvinceService;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class ApplicationConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(new ProvinceFormatter(applicationContext.getBean(ProvinceService.class)));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
