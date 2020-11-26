package pl.mikolaj.personalfinance;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/403").setViewName("403");
        registry.addViewController("/error").setViewName("404");
//        registry.addViewController("/admin").setViewName("admin/index");
        registry.addViewController("/login").setViewName("admin/login");
    }
}














