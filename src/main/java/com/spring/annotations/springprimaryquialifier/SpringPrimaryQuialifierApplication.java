package com.spring.annotations.springprimaryquialifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.annotations.springprimaryquialifier.example.ProcesoDePedido;
import com.spring.annotations.springprimaryquialifier.example.ServicioAlertasUrgentes;

@SpringBootApplication
public class SpringPrimaryQuialifierApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext app = SpringApplication.run(SpringPrimaryQuialifierApplication.class, args);
		//ConfigurableApplicationContext app2 = SpringApplication.run(SpringPrimaryQuialifierApplication.class, args);
		
		ProcesoDePedido pdp = app.getBean(ProcesoDePedido.class);
		
		pdp.procesarPedido("TV de 55 pulgadas");
		
		
		ServicioAlertasUrgentes sau = app.getBean(ServicioAlertasUrgentes.class);
		sau.enviarAlertaUrgente("NO hay existencias del TV de 55 pulgadas");
		
		
		
	}
	

}
