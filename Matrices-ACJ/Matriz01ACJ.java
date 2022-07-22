import java.util.Scanner;

public class Matriz01ACJ {

Scanner sc=new Scanner(System.in); 
public void imprimirMatrices(String[][] m) {
    for (int f = 0; f < m.length; f++) {
        for (int c = 0; c < m[0].length; c++) {
            if (m[f][c]==null) {
                System.out.print("\t");
                
            }else{
                System.out.print(m[f][c]+"\t");
            
        }
        System.out.println("");
        
    }
}  
}
public void transformada01() {
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
    imprimirMatrices(matriz);
}

public void transformada02() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];  
    for (int f = 0; f < matriz.length; f++) {
        for (int c = 0; c <= (matriz.length - 1) - f; c++) {
            matriz[f][c] = String.valueOf(valor);
            valor++;
        }
    }
    imprimirMatrices(matriz);
}

public void transformada03() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int f = 0; f < matriz.length; f++) {
        for (int c = f; c < matriz[f].length; c++) {
            matriz[f][c] = String.valueOf(valor); 
            valor++;        
        }          
    }
    imprimirMatrices(matriz);
}

public void transformada04() {
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    String[][] matriz = new String[dimension][dimension];
    for (int f = 0; f < matriz.length; f++) {
        for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
            matriz[f][c] = String.valueOf(valor);
            valor++;
        }
    }
    imprimirMatrices(matriz);
}

public void transformada05() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int c = 0; c < matriz.length; c++) {
        for (int f = 0; f <= (matriz.length - 1) - c; f++) {
            matriz[f][c] = String.valueOf(valor);
            valor++;
        }
    }
    imprimirMatrices(matriz);
}

public void transformada06() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int f = (matriz[0].length - 1); f >= 0; f--) {
        for (int c = matriz[f].length-1; c >= f; c--) {
            matriz[c][f] = String.valueOf(valor); 
            valor++;        
        }          
    }
    imprimirMatrices(matriz);
}
public void transformada07() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int c = 0; c < matriz.length; c++) {
        if (c % 2 == 0) {
            for (int f = 0; f < matriz.length; f++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        } else {
            for (int f = matriz.length - 1; f >= 0; f--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }

    }
    imprimirMatrices(matriz);
}

public void transformada08() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];  
    for (int c = 0; c < matriz[0].length; c++) {
        if (c % 2 == 0) {
            for (int f = matriz.length - 1; f >= 0; f--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        } else {
            for (int f = 0; f < matriz.length; f ++   ) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }

    }
    imprimirMatrices(matriz);
}

public void transformada09() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int c = matriz.length - 1; c >= 0; c--) {
        if (c % 2 == 0) {
            for (int f = 0; f < matriz.length; f++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        } else {
            for (int f = matriz.length - 1; f >= 0; f--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }

    }
    imprimirMatrices(matriz);
}

public void transformada10() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int c = matriz.length - 1; c >= 0; c--) {
        if (c % 2 == 0) {
            for (int f = matriz.length - 1; f >= 0; f--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        } else {
            for (int f = 0; f < matriz.length; f++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }

    }
    imprimirMatrices(matriz);
}

public void transformada11() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    matriz = new String[dimension][dimension];
    for (int f = 0; f < matriz.length; f++) {
        if (f % 2 == 0) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        } else {
            for (int c = matriz.length - 1; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }

    }
    imprimirMatrices(matriz);
}

public void transformada12() {
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
    imprimirMatrices(matriz);
}

public void transformada13() {
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = sc.nextInt();
    System.out.println("Ingrese valor inicial:");
    int valor = sc.nextInt();
    String[][] matriz = new String[dimension][dimension];
    for (int f = matriz.length - 1; f >= 0; f--) {
        if (f % 2 == 0) {
            for (int c = (matriz.length - 1); c >= 0; c--) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        } else {
            for (int c = 0; c <= matriz.length-1; c++) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        }
    }
    imprimirMatrices(matriz);
}




}


