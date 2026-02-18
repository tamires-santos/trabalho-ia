import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaSBSTTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    public void testBranchSenhaNula() {
        assertFalse(validador.validar(null));
    }

    @Test
    public void testBranchSenhaCurta() {
        assertFalse(validador.validar("Ab1"));
    }

    @Test
    public void testBranchSemNumero() {
        assertFalse(validador.validar("SenhaSemNumero"));
    }

    @Test
    public void testBranchSemMaiuscula() {
        assertFalse(validador.validar("senha123"));
    }

    @Test
    public void testBranchCaminhoSucesso() {
        assertTrue(validador.validar("SenhaValida1"));
    }
}
