import java.util.Scanner;

public class DecisaoSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        System.out.println("Banco Shift-Java");
        System.out.println("Digite:" +
                "\n1 - Acessar a conta" +
                "\n2 - Ver saldo" +
                "\n3 - Depositar" +
                "\n4 - Sacar" +
                "\n5 - Sair");
        opcao = leitor.nextInt();
        switch (opcao){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 5:
                break;
            default:
                System.out.println("Opção inválida");
        }
    /*
        if(opcao == 1){
            System.out.println("Acessar");
        }
        else if(opcao == 2){
            System.out.println("saldo");
        } else if (opcao == 3) {
            System.out.println("depositar");
        } else if (opcao == 4) {
            System.out.println("sacar");
        }else {
            System.out.println("sair");
        }
    */

    }
}
