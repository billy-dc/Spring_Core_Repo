package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoInternet implements PagoI {

	@Autowired
	public ComunicacionI comunicacion;
	
	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		comunicacion.enviar();
	}

}
