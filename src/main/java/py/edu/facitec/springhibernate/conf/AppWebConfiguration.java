package py.edu.facitec.springhibernate.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.springhibernate.controller.HomeController;
import py.edu.facitec.springhibernate.dao.ClienteDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, ClienteDAO.class})
public class AppWebConfiguration {
	
@Bean	
public InternalResourceViewResolver internalResourceViewResolver(){
	
InternalResourceViewResolver resolver=new InternalResourceViewResolver();
resolver.setPrefix("/WEB-INF/views/");
resolver.setSuffix(".jsp");
return resolver;

	}
	
	

}