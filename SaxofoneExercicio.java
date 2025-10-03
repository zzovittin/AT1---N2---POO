package ucb.estudo.escolamusica;

public class SaxofoneExercicio extends InstrumentoMusical {
    private String tipo;

    public SaxofoneExercicio(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + nome + " com " + tipo + "...");
        System.out.println("Melodia envolvente de saxofone");
    }
}
