import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class semana {
    private List<String> diasSemana;

    public semana() {
        this.diasSemana = new ArrayList<>();
    }
public void crearListaDias() {
    diasSemana.add("Lunes");
    diasSemana.add("Martes");
    diasSemana.add("Miércoles");
    diasSemana.add("Jueves");
    diasSemana.add("Viernes");
    diasSemana.add("Sábado");
    diasSemana.add("Domingo");
    }   

public List<String> obtenerDiasSemana() {
    return diasSemana;
}
public int obtenerLargoLista() {
    return diasSemana.size();
}
public boolean eliminarDia(String dia) {
    return diasSemana.remove(dia);
}
public String obtenerDiaPorIndice(int indice) {
    if (indice >= 0 && indice < diasSemana.size()) {
        return diasSemana.get(indice);
    }
    return null;
}
public boolean existeDia(String dia) {
    return diasSemana.contains(dia);
}
public void ordenarDiasAlfabeticamente() {
    Collections.sort(diasSemana);
}
public void vaciarLista() {
    diasSemana.clear();
}
}