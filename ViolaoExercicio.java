package ucb.estudo.escolamusica;

public class ViolaoExercicio extends InstrumentoMusical {
    private int cordas;

    public ViolaoExercicio(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
        System.out.println("Ajustando a tensão das " + cordas + " cordas.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves no " + nome + " com " + cordas + " cordas...");
        System.out.println("Dedilhando uma melodia romântica no violão");
    }
}
