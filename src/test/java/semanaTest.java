import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNull;


public class semanaTest {
    private semana gestor;
    @BeforeEach
    public void setUp() {
        gestor = new semana();
        gestor.crearListaDias();
    }
    @Test
    public void testCrearListaDias() {
        List<String> dias = gestor.obtenerDiasSemana();
        assertThat(dias, hasSize(7));
        assertThat(dias, containsInAnyOrder("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }  
    @Test
    public void testObtenerDiasSemana() {
        List<String> dias = gestor.obtenerDiasSemana();
        assertThat(dias, is(not(empty())));
        assertThat(dias, hasSize(7));
    }
}
