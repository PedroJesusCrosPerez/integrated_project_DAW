package app.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        System.out.println();
        System.out.println();
        System.out.println("Hola esto es una prueba DEBUG");
        System.out.println();
        System.out.println();
    }

}
