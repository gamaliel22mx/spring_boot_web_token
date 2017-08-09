package mx.com.agmc.web.token;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import mx.com.agmc.web.token.configuration.JwtFilter;

@SpringBootApplication
public class WebTokenApp implements CommandLineRunner{
	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/secure/*");

		return registrationBean;
	}
	
	public static void main(String[] args) {
        SpringApplication webTokenApp = new SpringApplication(WebTokenApp.class);
        webTokenApp.run(args);
    }

	@Override
	public void run(String... args) throws Exception {
	}
}