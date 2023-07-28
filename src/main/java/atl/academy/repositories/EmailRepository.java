package atl.academy.repositories;

/*
En esta clase vamos a gestionar toda la coneccion con la tabla de «suscriptor»
Notaciones:
@Repository -> Le indica a Spring Boot que la clase va a ser de tipo «repository»
@PersistenceContext -> Carga el objeto automaticamente al compilar la app
@Transactional -> Agrupa todas las consultas SQL que vayamos intentando ejecutar en una sola transaccionalidad

createNativeQuery() nos indica que está ejecutando SQL nativo -> se llama a tablas
createQuery() no se ejecuta SQL, sino HQL (Hibernate Query Language) -> se llama a objetos
 */
/**
 * TODO: Es importante generar la consulta SQL desde el phpmyadmin y pegarla luego en nuestro codigo para evitar errores de sintaxis.
 */

import atl.academy.entities.Suscriptor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmailRepository extends JpaRepository<Suscriptor, Long> {

    /*@PersistenceContext
    EntityManager baseDeDatos;

    // Guardamos un nuevo email en la tabla «suscriptor»
    @Transactional
    public void guardarEmail(String email) {

        // Con esto ejecutamos el codigo sql directamente
        // String consultaSQL = "INSERT INTO suscriptor (email) VALUES ('" + email + "')";
        // baseDeDatos.createNativeQuery(consultaSQL).executeUpdate();

        Suscriptor suscriptorAux = new Suscriptor(email);

        String consulta = "INSERT INTO suscriptor (email) VALUES (:paramEmail)";
        baseDeDatos.merge(suscriptorAux);

    }*/
}
