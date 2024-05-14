package U8.Alineacion;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ArrayList de Futbolistas
        ArrayList<Futbolista> seleccionEspanola = new ArrayList<>(Arrays.asList(
                new Futbolista(1, "Casillas", Arrays.asList("Portero"), "Real Madrid"),
                new Futbolista(15, "Ramos", Arrays.asList("Lateral derecho", "Medio centro"), "Real Madrid"),
                new Futbolista(3, "Pique", Arrays.asList("Central"), "FC Barcelona"),
                new Futbolista(5, "Puyol", Arrays.asList("Central"), "FC Barcelona"),
                new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"), "Villareal"),
                new Futbolista(14, "Xabi Alonso", Arrays.asList("Defensa mediocampo", "Mediocampo"), "Real Madrid"),
                new Futbolista(16, "Busquets", Arrays.asList("Defensa mediocampo"), "FC Barcelona"),
                new Futbolista(8, "Xavi Hernandez", Arrays.asList("Mediocampo"), "FC Barcelona"),
                new Futbolista(18, "Pedrito", Arrays.asList("Extremo izquierdo", "Falso extremo"), "FC Barcelona"),
                new Futbolista(6, "Iniesta", Arrays.asList("Extremo derecho", "Mediocampo"), "FC Barcelona"),
                new Futbolista(7, "Villa", Arrays.asList("Delantero centro"), "FC Barcelona")
        ));

        // Convertir ArrayList a JSON
        Gson gson = new Gson();
        String json = gson.toJson(seleccionEspanola);
        Futbolista[] futbolistasArray = gson.fromJson(json, Futbolista[].class);
        ArrayList<Futbolista> alineacion = new ArrayList<>();
        for (Futbolista futbolista : seleccionEspanola) {
            alineacion.add(futbolista);
        }

        List<String> demarcacionesRamos = null;
        for (Futbolista futbolista : alineacion) {
            if (futbolista.getNombre().equals("Ramos")) {
                demarcacionesRamos = futbolista.getDemarcaciones();
                break;
            }
        }

        System.out.println("Demarcaciones de Ramos:");
        if (demarcacionesRamos != null) {
            for (String demarcacion : demarcacionesRamos) {
                System.out.println(demarcacion);
            }
        } else {
            System.out.println("Ramos no encontrado en la alineación.");
        }
    }
}

