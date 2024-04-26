package com.spring.annotations.springprimaryquialifier.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProcesoDePedido {
	
	@Autowired
	ServicioNotificacion servicioNotificacion;
	
	public void procesarPedido(String nombrePedido) {
		servicioNotificacion.enviarMensaje(nombrePedido + " ha sido recibido correctamente.");
	}

}
