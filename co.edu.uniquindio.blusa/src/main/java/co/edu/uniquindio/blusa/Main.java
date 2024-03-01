package co.edu.uniquindio.blusa;

import co.edu.uniquindio.blusa.model.Blusa;

public class Main {
    public static void main(String[] args) {
        crearBlusa();

    }

    private static void crearBlusa() {
        Blusa blusa1 = Blusa.builder()
                .referencia("crop111")
                .talla("xs")
                .color("Rosa")
                .tipoBlusa("Crop top")
                .build();

        Blusa blusa2 = Blusa.builder()
                .referencia("body222")
                .talla("m")
                .color("negro")
                .tipoBlusa("Body")
                .diseno("Flor")
                .altoDiseno(10)
                .anchoDiseno(5)
                .build();

        Blusa blusa3 = Blusa.builder()
                .referencia("mangal333")
                .talla("l")
                .color("verde")
                .tipoBlusa("Marga larga")
                .tipoAdorno("Cadena")
                .cantidadAdorno(1)
                .build();
    }
}