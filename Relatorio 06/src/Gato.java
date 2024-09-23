import java.util.Arrays;

public class Gato extends Animal{
    public Gato(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    protected String cores[];

    public Gato(String nome, String especie, int idade, String[] cores) {
        super(nome, especie, idade);
        this.cores = cores;
    }

    @Override
    public void printInfo(){

        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Especie: " +especie);
        System.out.println("Cores: " + Arrays.toString(cores));

    }
}
