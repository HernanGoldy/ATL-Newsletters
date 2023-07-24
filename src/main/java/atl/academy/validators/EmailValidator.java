package atl.academy.validators;

public class EmailValidator {

    public boolean esValido(String email) {

        // Chequear que el email contenga "@"
        if (!email.contains("@")) {
            return false;
        }
        // Chequear que el email contenga "."
        if (!email.contains(".")) {
            return false;
        }
        // Chequear que el email no termine con "@"
        if (email.endsWith("@")) {
            return false;
        }
        // Chequear que el email no contenga espacios
        if (email.contains(" ")) {
            return false;
        }
        return true;
    }
}
