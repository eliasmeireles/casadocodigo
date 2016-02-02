package br.com.caelum.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.caelum.loja.controllers.HomeController;
import br.com.caelum.loja.daos.ProdutoDao;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, ProdutoDao.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		 resolver.setPrefix("WEB-INF/views/");
         resolver.setSuffix(".jsp");

         return resolver;
	}

}
