/**
 * 
 */
package jrestapi.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Abdul
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("jrestapi.web.controller")
public class RestApplicationConfig{
	
}
