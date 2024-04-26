package com.spring.annotations.springprimaryquialifier.example;

import org.springframework.stereotype.Service;

@Service
public class ServicioNotificacionSMS implements ServicioNotificacion{
	
	public void enviarMensaje (String mensaje) {
		System.out.println(mensaje + " ha sido enviado por SMS ya que es un mensaje URGENTE!");
	}

}
