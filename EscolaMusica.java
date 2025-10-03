package ucb.estudo.escolamusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaMusica {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("Iniciar a Orquestra");
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new ViolaoExercicio("Violão Clássico", "Madeira", 6);
        banda[1] = new PianoExercicio("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new BateriaExercicio("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new SaxofoneExercicio("Saxofone", "Latão", "Alto");

        EscolaMusica em = new EscolaMusica();
        em.apresentar(banda);
    }

    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("=== A ORQUESTRA VAI COMEÇAR! ===\n");

        System.out.println("--- Afinação dos Instrumentos ---");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }
        System.out.println();

        System.out.println("--- Instrumentos começaram a tocar ---");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
    }
}
