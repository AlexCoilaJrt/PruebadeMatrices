public class Matriz04 {
public static void llenarmatrizcaracol(int mat[][],int n,int m)
{
    int fil,col,aux,cont,k;  //Ejercicio numero 21#
    cont=0;                   
    for(k=0;k<m;k++)
    {
    col=k;
            for(fil=k;fil<=(m-1-k);fil++)
            {
            mat[fil][col]=cont;
            cont++;
            }
    fil=m-1-k;
            for(col=k+1;col<=n-1-k;col++) 
            {
            mat[fil][col]=cont;
            cont++;
            }
    col=n-1-k;
            for(fil=m-2-k;fil>=k;fil--)
            {
            mat[fil][col]=cont;
            cont++;
            }
    fil=k;
            for(col=n-2-k;col>=k+1;col--)
            {
            mat[fil][col]=cont;
            cont++;
            }
    }
    return;
}
public static void mostrarmatriz(int mat[][],int n,int m)
    {             
        for(int fil=0;fil<m;fil++)
        {
            System.out.println("");
            for(int col=0;col<n;col++)
            {
            System.out.print("\t"+mat[fil][col]);
            }
        }        
        return;
    } 
    public static void main(String args[]){
        int mat[][];                              
        int n,m;                                   
        mat=new int[1000][1000];        
        n=5;                                       
        m=5;
        llenarmatrizcaracol(mat,n,m);         
        mostrarmatriz(mat,n,m);          
}   
}
