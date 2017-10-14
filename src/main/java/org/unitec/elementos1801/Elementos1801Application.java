package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner {
@Autowired RepositorioMensajito repoMensa;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        //repoMensa.save(new Mensajito("Primero","Mi primera vez con hibernate"));
        Mensajito m= repoMensa.findOne(1);
        System.out.println(m.getTitulo());
        
    }
}
