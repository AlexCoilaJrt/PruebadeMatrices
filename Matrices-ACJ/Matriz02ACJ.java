import java.util.Scanner;

public class Matriz02ACJ {
    
  Scanner sc=new Scanner(System.in);
  public void imprimirMatrices(String[] m) {    

 }
 public static void main(String[] args) {
    System.out.println("Ingrese numero: ");
  } 

  public void transformada() {
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension =sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    String[][] matriz = new String[dimension][dimension];
    for (int f = 0; f < matriz.length; f++) {
        for (int c = 0; c <= f; c++) {
            matriz[f][c] = String.valueOf(valor);
            valor++;
        }
    }
    
    
}
 
}

