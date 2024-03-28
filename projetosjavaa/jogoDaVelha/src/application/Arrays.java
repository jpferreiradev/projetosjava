package application;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int n = scan.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        int m = scan.nextInt();

        int[] d = new int[n];
        int[] s = new int[m];

        for (int i = 0; i < d.length; i++) {
            System.out.println(" " + i);
        }

        System.out.println();

        for (int j = 0; j < s.length; j++) {
            System.out.println(" " + j);
        }

        System.out.println("Escolha os numeros da linha:");

        for(int i = 0; i < d.length;i++){
            d[i] = scan.nextInt();
        }

        System.out.println("Escolha os numero das colunas");
        for(int i = 0; i < s.length;i++){
            s[i] = scan.nextInt();
        }
    }

}







/*
  Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] mat = new int[n][n]; // Declaração de uma matriz bidimensional

        for(int i = 0; i < mat.length;i++){ // Pecorre as linhas
            for(int j = 0; j < mat[i].length;j++){ // Pecorre as colunas
                mat[i][j] = scan.nextInt();
            }
        }
        System.out.println("Main diagonal");
        for(int i = 0; i < mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[i].length;j++){
                if(mat[i][j] < 0){
                    //cont = cont + mat[i][j];
                    cont++;
                }
            }
        }
        System.out.println("Nagative numbers: " + cont);
 */








