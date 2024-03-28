package application;

import model.entities.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Jogador> jogadores = new ArrayList<Jogador>();


        System.out.println("###### JOGO DA VELHA #######");
        System.out.println();

        System.out.print("Informe o nome do primeiro jogador: ");
        String nomePrimiero = scan.nextLine();
        System.out.print("Informe a letra do primeiro jogador - (x ou o) :");
        char escolhaPrimeiro = scan.next().charAt(0);
        System.out.print("Informe o nome do segundo jogador: ");
        scan.nextLine();
        String nomeSegundo = scan.nextLine();
        System.out.print("Informe a letra do segundo jogador - (x ou o) :");
        char escolhaSegundo = scan.next().charAt(0);

        Jogador primeiroJogador = new Jogador(nomePrimiero,escolhaPrimeiro);
        Jogador segundoJogador = new Jogador(nomeSegundo,escolhaSegundo);

        System.out.println();
        System.out.println(primeiroJogador);
        System.out.println(segundoJogador);

        //jogadores.add(primeiroJogador);
        //jogadores.add(segundoJogador);

        System.out.println();

        primeiroJogador.escolhaJogador(primeiroJogador.getLetra());
        segundoJogador.escolhaJogador(segundoJogador.getLetra());

        System.out.println();

        System.out.println("### Começando o jogo ###");




















    }
}
