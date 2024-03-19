package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("###### JOGO DA VELHA #######");
        System.out.println();

        System.out.println("Escolha entre x ou o");
        char escolha = scan.next().charAt(0);


        if(escolha == 'x' ){
            System.out.println("Parabéns você é: x");
        } else if(escolha == 'o'){
            System.out.println("Parabéns você é: o ");
        }
    }
}
