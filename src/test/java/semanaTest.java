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
    @Test
    public void testObtenerLargoLista() {
        assertThat(gestor.obtenerLargoLista(), is(7));
    }
    @Test
    public void testEliminarDia() {
        assertThat(gestor.eliminarDia("Lunes"), is(true));
        assertThat(gestor.obtenerLargoLista(), is(6));
        assertThat(gestor.obtenerDiasSemana(), not(hasItem("Lunes")));
    }
    @Test
    public void testObtenerDiaPorIndice() {
        assertThat(gestor.obtenerDiaPorIndice(0), is("Lunes"));
        assertThat(gestor.obtenerDiaPorIndice(6), is("Domingo"));
        assertNull(gestor.obtenerDiaPorIndice(7)); 
    }
    @Test
    public void testExisteDia() {
        assertThat(gestor.existeDia("Martes"), is(true));
        assertThat(gestor.existeDia("Feriado"), is(false));
    }

}
