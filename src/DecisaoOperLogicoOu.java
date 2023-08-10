import java.util.Scanner;

public class DecisaoOperLogicoOu {
    public static void main(String[] args) {
        /* Faça um programa que receba o total de compras de um usuário e um cupom.
          Se o total de compras exceder 1000
	      ou se o cupom for igual a DESCONTO20, aplicar um desconto de 20% na compra.*/

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        double valorCompra, valorFinal = 0;
        String cupom;
        System.out.println("Digite o valor total de compras do cliente: ");
        valorCompra = leitor.nextDouble();
        System.out.println("Digite o cupom de desconto, se houver: ");
        cupom = leitorTexto.nextLine();
        if(valorCompra > 1000 || cupom.equalsIgnoreCase("DESCONTO20"))
        {
            valorFinal = valorCompra - valorCompra * 0.2;
        }
        else {
            valorFinal = valorCompra;
        }
        System.out.println("Total da compra: " + valorCompra
                +"\nCupom de desconto: " + cupom + "\nValor total da compra: R$" + valorFinal);
    }
}
