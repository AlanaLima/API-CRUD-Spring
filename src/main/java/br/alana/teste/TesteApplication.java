package br.alana.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mesmo problema da idcontafk na transacao não persistindo e ficando nula , mas esse funciona melhor
//porque eu coloquei o id conta como fk do user e não ao contrario, mas se pensar que na vdd tb esse vai ser
//many to one, ta sujeito a erros
@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

}
