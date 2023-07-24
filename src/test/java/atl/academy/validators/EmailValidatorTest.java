package atl.academy.validators;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class EmailValidatorTest {

    @Test
    public void elEmailContieneArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("dsljdlksjdlkasdj");
        assertFalse(resultado);
    }

    @Test
    public void elEmailContienePunto() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas@moy");
        assertFalse(resultado);
    }

    @Test
    public void elEmailTerminaEnArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas.moy@");
        assertFalse(resultado);
    }

    @Test
    public void elEmailContieneEspacios() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("lucas moy@atl.com");
        assertFalse(resultado);
    }
}
