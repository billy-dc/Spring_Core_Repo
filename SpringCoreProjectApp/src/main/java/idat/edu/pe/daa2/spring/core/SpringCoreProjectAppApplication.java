package idat.edu.pe.daa2.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.daa2.spring.core.di.automatica.PagoAgencia;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoAgente;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoI;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoInternet;
import idat.edu.pe.daa2.spring.core.ioc.SaludoEspanol;
import idat.edu.pe.daa2.spring.core.ioc.SaludoI;
import idat.edu.pe.daa2.spring.core.ioc.SaludoIngles;
import idat.edu.pe.daa2.spring.core.ioc.SaludoPortugues;

@SpringBootApplication
public class SpringCoreProjectAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreProjectAppApplication.class, args);
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreProjectAppApplication.class, args);
		PagoI servicioPago = ctx.getBean(PagoInternet.class);
		servicioPago.realizarPago();
		
		PagoI servicioPago2 = ctx.getBean(PagoAgencia.class);
		servicioPago2.realizarPago();

		PagoI servicioPago3 = ctx.getBean(PagoAgente.class);
		servicioPago3.realizarPago();

		
		/*String nombre = "Billy Delgado";
		ConfigurableApplicationContext cxt = SpringApplication.run(SpringCoreProjectAppApplication.class, args);

		SaludoI saludo1 = (SaludoEspanol)cxt.getBean("saludoEspanol");
		System.out.println(saludo1.saludar(nombre));
		
		SaludoI saludo2 = (SaludoIngles)cxt.getBean("saludoIngles");
		System.out.println(saludo2.saludar(nombre));
		
		SaludoI saludo3 = (SaludoPortugues)cxt.getBean("saludoBrasilero");
		System.out.println(saludo3.saludar(nombre));*/
	}

}
