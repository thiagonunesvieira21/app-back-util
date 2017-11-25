package br.com.util;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@ComponentScan("com.myProject.customLibrary.configuration")
@EnableJpaRepositories("br.com.util.repository")
@EntityScan("br.com.util.entity")
public class SharedConfigurationReference {

}
