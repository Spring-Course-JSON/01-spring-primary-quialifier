package com.spring.annotations.springprimaryquialifier.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServicioAlertasUrgentes {
	
	@Autowired
	@Qualifier("servicioNotificacionSMS")
	ServicioNotificacion servicioNotificacion;
	
	public void enviarAlertaUrgente(String mensaje) {
		servicioNotificacion.enviarMensaje(mensaje);
	}

}
