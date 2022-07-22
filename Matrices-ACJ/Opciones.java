import java.util.Scanner;

public class Opciones {
    Scanner sc=new Scanner (System.in);

    
    public void Principal() {
        System.out.println("-------------ELIJA UNA OPCION-----------------");
    
        String menu = "";
        menu += "Matriz01\n";
        menu += "Matriz02\n";
        menu += "Matriz03\n";
        menu += "Matriz04\n";
        menu += "Matriz05\nMatriz06\nMatriz07\n";
        menu +="Matriz08\nMatriz09\nMatriz10\nMatriz11\nMatriz12\nMatriz13";
        System.out.println(menu);
        int opciones = sc.nextInt();
        do {
            switch (opciones) {
                case 1: new Matriz01ACJ().transformada01();  break;
                case 2: new Matriz01ACJ().transformada02();   break;
                case 3: new Matriz01ACJ().transformada03();  break;
                case 4: new Matriz01ACJ().transformada04(); break;
                case 5: new Matriz01ACJ().transformada05(); break;
                case 6: new Matriz01ACJ().transformada06(); break;
                case 7: new Matriz01ACJ().transformada07(); break;
                case 8: new Matriz01ACJ().transformada08(); break;
                case 9: new Matriz01ACJ().transformada09();break;
                case 10: new Matriz01ACJ().transformada10(); break;
                case 11: new Matriz01ACJ().transformada11(); break;
                case 12: new Matriz01ACJ().transformada12(); break;
                case 13: new Matriz01ACJ().transformada13(); break;
                
                default: System.out.println("Opcion Invalida!"); break;
            }
           
        } while (opciones != 0);
    }

}