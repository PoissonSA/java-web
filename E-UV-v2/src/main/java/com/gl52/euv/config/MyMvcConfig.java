package com.gl52.euv.config;

import com.gl52.euv.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/EUV").setViewName("login1");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/main.html").setViewName("homePage");
        registry.addViewController("/showProject.html").setViewName("projects");
        registry.addViewController("/showSubject.html").setViewName("subjectCreation");
        registry.addViewController("/groups.html").setViewName("groups");
        registry.addViewController("/groupCreation.html").setViewName("groupCreation");
        registry.addViewController("/getEvaluation.html").setViewName("/evaluation/getEvaluation");
        registry.addViewController("/detail.html").setViewName("/evaluation/detail");
        registry.addViewController("/evaluation/setEvaluation.html").setViewName("/evaluation/setEvaluation");
        registry.addViewController("/evaluation/evaluations.html").setViewName("/evaluation/evaluations");
        registry.addViewController("/evaluation/setResponse.html").setViewName("/evaluation/setResponse");




//        registry.addViewController("/showProject.do").setViewName("projects");

    }
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //做好静态资源映射 不处理静态资源
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/EUV", "/main.html","/User/toLogin.do");
    }
}
