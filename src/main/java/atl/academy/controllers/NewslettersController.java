package atl.academy.controllers;

/*
Notaciones:
@Autowired -> Carga automaticamente el valor de «repository»
 */

import atl.academy.entities.Suscriptor;
import atl.academy.repositories.EmailRepository;
import atl.academy.services.EmailService;
import atl.academy.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/newsletter")
public class NewslettersController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/")
    private String registrar(@RequestBody Suscriptor suscriptor) {

        String email = suscriptor.getEmail();

        EmailValidator emailValidator = new EmailValidator();

        if (!emailValidator.esValido(email)) {
            return "El email no es válido";
        }

        // Guardar el email en la base de datos
        emailService.guardarEmail(suscriptor);
        return "Email guardado correctamente";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> eliminar(@PathVariable Long id) {

        Map<String, String> map = new HashMap<String, String>();

        if (id == 9) {
            map.put("Error", "No se puede eliminar porque no existe el email");
            return ResponseEntity.badRequest().body(map);
        } else {
            emailService.eliminarEmail(id);
            map.put("Success", "Email borrado correctamente");
            return ResponseEntity.ok(map);
        }
    }
}
