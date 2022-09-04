import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cao n1 = new Cao();
        Cao n2 = new Cao();
        Cao n3 = new Cao();

        Scanner ler = new Scanner(System.in);

        n1.set_nome("Doberman");
        n1.set_altura(45);
        n1.set_peso(71);
        n1.set_região("Alemanha");
        n1.set_Temperamento("Agressivo com Desconhecidos");

        n2.set_nome("Pug");
        n2.set_altura(30);
        n2.set_peso(8);
        n2.set_região("China");
        n2.set_Temperamento("Amoroso com Desconhecidos e pacifico");

        
        n3.set_nome("Akita ou Akita Inu");
        n3.set_altura(71);
        n3.set_peso(59);
        n3.set_região("Japão");
        n3.set_Temperamento("Amoroso com Desconhecidos e pacifico");



        System.out.println("\nQual opção você deseja escolher?:" + "\n 1 = Primeia Opção " + "\n 2 = Segunda Opção"
                + "\n 3 = Terceira Opção");
        var reposta = ler.nextInt();
        switch (reposta) {
            case 1:
                System.out.println("\n A raça do seu cachorro: " + n1.get_nome() + "\n A altura do cachorro: "
                        + n1.get_altura() + "\n O peso desse cachorro:  " + n1.get_peso()
                        + "\n O local de Origem desse Cachorro: " + n1.get_região()
                        + "\n O Temperamento desse cachorro: " + n1.get_Temperamento() + ". ");
                break;
            case 2:
                System.out.println("\n A raça do seu cachorro: " + n2.get_nome() + "\n A altura do cachorro: "
                        + n2.get_altura() + "\n O peso desse cachorro:  " + n2.get_peso()
                        + "\n O local de Origem desse Cachorro: " + n2.get_região()
                        + "\n O Temperamento desse cachorro: " + n2.get_Temperamento() + ". ");
                break;
            case 3:
            System.out.println("\n A raça do seu cachorro: " + n3.get_nome() + "\n A altura do cachorro: "
            + n3.get_altura() + "\n O peso desse cachorro:  " + n3.get_peso()
            + "\n O local de Origem desse Cachorro: " + n3.get_região()
            + "\n O Temperamento desse cachorro: " + n3.get_Temperamento() + ". ");

                break;

            default:
                System.out.println("Error Numero escolhido Invalido!!!!");
                break;
        }

    }
}
