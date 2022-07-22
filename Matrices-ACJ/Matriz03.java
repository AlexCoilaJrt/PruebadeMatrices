import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = sc.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = sc.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor++;
                }
            }
    
        }
    }

}
