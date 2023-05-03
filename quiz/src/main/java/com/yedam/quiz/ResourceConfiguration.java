package com.example.demo;

import java.util.concurrent.TimeUnit;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ResourceConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	
        registry.addResourceHandler("/img/**")
        .addResourceLocations("file:///d:/upload_img/")      
        
        // 접근 파일 캐싱 시간 
	.setCacheControl(CacheControl.maxAge(1, TimeUnit.MINUTES));
    }
}