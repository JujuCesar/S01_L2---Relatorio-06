
public abstract class Animal {

    protected String nome;
    protected int idade;
    protected String especie;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    void printInfo(){

    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("Especie: " +especie);

    }
}
