package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDbDAO implements DAOBaseI {
	
	@Override
	public void conectar() {
		System.out.println("Conectando a un servidor de BD No SQL: MongoDB.");
	}

}
