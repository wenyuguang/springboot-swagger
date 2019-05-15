package swagger.test;

import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import swagger.test.autoconfig.Swagger2Config;

//@EnableSwagger2
//@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig extends Swagger2Config{

}
