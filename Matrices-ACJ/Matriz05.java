public class Matriz05 {
    public static void main(String[] args) {
        int n=5;
        String [][] matriz=new String [n] [n];
        int a=0;
        int b=n-1;
        int valor=0;
        for (int j=0;j<matriz.length;j++){
        for (int i = a; i <=b; i++) { 
            matriz[a][i]=valor++ +"  ";  
        }
        for (int i = a+1; i <=b; i++) {
            matriz[i][b]=valor++ +" ";
        }
        for (int i = b-1; i >= a; i--) {
            matriz[b][i]=valor++ +" ";
        }
        for (int i = b-1; i >= a+1; i--) {
            matriz[i][a]=valor++ +" ";
        }
        a++; b--;

    }   
    for (int f = 0; f < matriz.length; f++) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[f][i]);
        }
        System.out.println();
    } 
}
} 