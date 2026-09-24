package com.gs.ba.suma;

import com.gs.ba.suma.op.Operacion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumaApplication {



	public static void main(String[] args) {
		SpringApplication.run(SumaApplication.class, args);
		Operacion op = new Operacion();
		System.out.println("--------SUMAS---------------");
		System.out.println("La suma de 2 + 8 = "+op.suma());
		System.out.println("----------------------------");
		System.out.println("Suma de 3 + 1003 = "+op.suma2());


	}

}
