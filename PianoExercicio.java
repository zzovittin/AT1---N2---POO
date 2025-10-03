package ucb.estudo.escolamusica;

public class PianoExercicio extends InstrumentoMusical {
    private int teclas;

    public PianoExercicio(String nome, String material, int teclas) {
        super(nome, material);
        this.teclas = teclas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
        System.out.println("Ajustando as cordas internas do piano.");
    }

    @Override
    public void tocar() {
        System.out.println("Soando uma bela melodia no " + nome + " com " + teclas + " teclas...");
        System.out.println("Executando uma sonata clássica");
    }
}
