package model.entities;

public class Jogador {

    private String nome;
    private char letra;



    public Jogador() {


    }

    public Jogador(String nome, char letra) {
        this.nome = nome;
        this.letra = letra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


    public void escolhaJogador(char letra) {

        if (letra == 'x') {
            System.out.println("Parabéns " + getNome() + ",você é o jogador : x");
        } else if (letra == 'o') {
            System.out.println("Parabéns " + getNome() + " você é o jogador: o");
        } else{
            System.out.println("É preciso escolher uma letra para continuar o jogo.");
        }
    }


    public void comercarJogo() {



    }

    @Override
    public String toString() {
        return String.format("Jogadores: " + "\n") +
                String.format("Nome: " + nome + "\n") +
                String.format("Letra: " + letra);


    }
}
