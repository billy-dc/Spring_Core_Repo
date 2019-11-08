package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDAO implements DAOBaseI {

	@Override
	public void conectar() {
		System.out.println("Conectando a un servidor de BD SQL: MySQL Server.");
	}

}
