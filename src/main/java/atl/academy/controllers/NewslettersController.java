package atl.academy.controllers;

import atl.academy.entities.Suscriptor;
import atl.academy.validators.EmailValidator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @PostMapping("/api/newsletter")
    private String registrar(@RequestBody Suscriptor suscriptor) {

        EmailValidator emailValidator = new EmailValidator();

        if (!emailValidator.esValido(suscriptor.getEmail())) {
            return "El email no es válido";
        }
        return "Email: " + suscriptor.getEmail();
    }
}
