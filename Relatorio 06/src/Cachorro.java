public class Cachorro extends Animal{
    public Cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    private String raca;

    public Cachorro(String nome, String especie, int idade, String raca) {
        super(nome, especie, idade);
        this.raca = raca;
    }

    @Override
    public void printInfo(){

        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Especie: " +especie);
        System.out.println("Raça: " +raca);

    }
}
