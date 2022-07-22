import java.util.Scanner;

import javax.swing.JOptionPane;

public class IntroduceLaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][], nf,nc;
        nf = Integer.parseInt(JOptionPane.showInputDialog("Filas"));
        nc = Integer.parseInt(JOptionPane.showInputDialog("Columnas"));

        matriz = new int[nf][nc];
        for (int i=0;i<nf;i++){
            for (int j=0; j<nc;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n la matriz es: \n");
        for(int i=0; i<nf;i++){ // filas
            for(int j=0; j<nc;j++){ //columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
