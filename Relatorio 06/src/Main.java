//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Cachorro c1 = new Cachorro("Rex","Canis lupus familiaris", 3, "Pastor-Alemão");
    Cachorro c2 = new Cachorro("Bolinha","Canis lupus familiaris", 5, "Buldogue");
    Gato g1 = new Gato("Félix","Felis catus",5, new String[]{"Amarelo","Preto"});

    c1.printInfo();
        System.out.println(" ");
    c2.printInfo();
        System.out.println(" ");
    g1.printInfo();

    }
}