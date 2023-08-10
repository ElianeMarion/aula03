import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        /*Ler os números referente a placa de um carro xxx-9999
         * exibir usando o switch o dia do rodizio de veículos.
         * 1 e 2 - segunda-feira
         * 3 e 4 - terça
         * 5 e 6 - quarta
         * 7 e 8 - quinta
         * 9 e 0 - sexta */

        Scanner leitor = new Scanner(System.in);
        int placa, finalPlaca;

        System.out.println("Digite os números da placa do seu automóvel:");
        placa = leitor.nextInt();
        finalPlaca = placa % 10;
        switch (finalPlaca){
            case 1:
            case 2:
                System.out.println("Seu rodízio é de Segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Seu rodízio é de Terça-feira");
                break;
            case 5:
            case 6: System.out.println("Seu rodízio é de Quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("Seu rodízio é de Quinta-feira");
                break;
            case 9:
            case 0:System.out.println("Seu rodízio é de Sexta-feira");
        }
    }
}
