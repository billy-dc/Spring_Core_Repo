package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class OracleDAO implements DAOBaseI {

	@Override
	public void conectar() {
		System.out.println("Conectando a un servidor de BD SQL: OracleServer.");
	}

}
