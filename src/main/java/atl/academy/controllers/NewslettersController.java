package atl.academy.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewslettersController {

    @PostMapping("/api/newsletter")
    private String registrar() {
        return "Todo sigue funcionando hasta ahora!";
    }
}
