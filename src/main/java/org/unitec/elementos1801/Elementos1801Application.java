package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner {
@Autowired RepositorioMensajito repoMensa;
@Autowired RepositorioUsuario repoUsu;
@Autowired RepositorioDireccion repoDir;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        
        Usuario u=new Usuario(13829002L,"Erick Macareno","electric.eye09@gmail.com");
        //Usuario
       // repoUsu.save(u);
        //Generamos la direccion que vamos a guardar
        
        Direccion d=new Direccion(new Usuario(13829002L),"Valle de atrato", 57100, "Nezahualcoyotl");
        // repoDir.save(d);
        
        //Aqui haremos el join
        Direccion d2= repoDir.findOne(1L);
        
        System.out.println("Correo: "+d2.getU().getEmail()+" municipio: "+d2.getMunicipio());
        
        //Mensajitosss 
        //repoMensa.save(new Mensajito("Primero","Mi primera vez con hibernate")
        //Mensajito m= repoMensa.findOne(1);
        //System.out.println(m.getTitulo());
        
        //repoMensa.save(new Mensajito("17 de octubre","No temblo"));
      /*  System.out.println("Vamos a buscar a todos");
        for(Mensajito mensa: repoMensa.findAll()){
        
            System.out.println(mensa);
            
        }
        
        System.out.println("Vamos a buscar por id");
            System.out.println(repoMensa.findOne(1));
            
            //Actualizar
            repoMensa.save(new Mensajito(1,"Nuevo Titutlo","Nuevo cuerpo"));
            System.out.println(repoMensa.findOne(1));
            
            //Busqueda Personalizada
            
            for(Mensajito mensa: repoMensa.findByTitulo("Nuevo Titulo")){
                System.out.println(mensa);
            }
        
   */ }
}
