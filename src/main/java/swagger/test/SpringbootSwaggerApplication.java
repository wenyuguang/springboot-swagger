package swagger.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}

//	@Bean
//    public Module jacksonAfterBurnerModule() {
//        return new AfterburnerModule();
//    }

//    @Bean
//    public HttpMessageConverter<Object> httpSmileJackson2MessageConverter() {
//        return new AbstractJackson2HttpMessageConverter(
//                new ObjectMapper(new SmileFactory()).registerModule(new AfterburnerModule()),
//                new MediaType("application", "x-jackson-smile")) {
//        };
//    }
}
