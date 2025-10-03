package ucb.estudo.escolamusica;

public class BateriaExercicio extends InstrumentoMusical {
    private int numeroPecas;

    public BateriaExercicio(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
        System.out.println("Ajustando a tensão das peles dos tambores.");
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + nome + " com " + numeroPecas + " peças!");
        System.out.println("Boom! Tss! Boom! Tss!");
    }
}
