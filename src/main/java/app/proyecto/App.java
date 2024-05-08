package app.proyecto;

import app.proyecto.entity.Person;
import app.proyecto.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        TODO DESCOMENTAR PARA UTILIZAR DOCKER
//        SpringApplication.run(App.class, args);

        System.out.println();
        System.out.println();
        Person u1 = new Person(1L, "pedro@gmail.com", "pedro", "Pedro", "Cros");
        Person u2 = new Person(2L, "diego@gmail.com", "diego", "Diego", "García");
        Person u3 = new Person(3L, "geffrey@gmail.com", "geffrey", "Geffrey", "Zambrano");

        System.out.println(u1.equals(u2) ? "true" : "false");
        System.out.println();
        if (u1.equals(u2)) {
            System.out.println("TRUE");
            System.out.format("Son iguales %s == %s", u1.getEmail(), u2.getEmail());
        } else {
            System.out.println("FALSE");
            System.out.format("NO son iguales %s == %s", u1.getEmail(), u2.getEmail());
        }
        System.out.println();
        System.out.println("Hola esto es una prueba DEBUG");
        System.out.println();
        System.out.println();
    }

}
