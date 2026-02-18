import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    public void testSenhaValida() {
        assertTrue(validador.validar("Senha123"));
    }

    @Test
    public void testSenhaCurta() {
        assertFalse(validador.validar("Ab1"));
    }

    @Test
    public void testSenhaSemNumero() {
        assertFalse(validador.validar("SenhaSemNum"));
    }

    @Test
    public void testSenhaSemMaiuscula() {
        assertFalse(validador.validar("senha123"));
    }

    @Test
    public void testSenhaNula() {
        assertFalse(validador.validar(null));
    }
}