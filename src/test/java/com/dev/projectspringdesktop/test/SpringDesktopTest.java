/**
 * 
 */
package com.dev.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author pablo
 * Clase de prueba unitaria que permite realizar pruebas con el framework Spring.
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disquera = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disquera);
		
		System.out.println("Contexto cargado");
		System.out.println(disquera);
		
		
		
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
