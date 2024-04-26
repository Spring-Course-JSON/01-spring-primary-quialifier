package com.spring.annotations.springprimaryquialifier.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ServicioNotificacionEmail implements ServicioNotificacion {

	
	public void enviarMensaje(String mensaje) {
		System.out.println(mensaje + " por Email");
	}

}
