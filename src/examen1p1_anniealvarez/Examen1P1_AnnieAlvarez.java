/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_anniealvarez;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author anniealvarez
 */
public class Examen1P1_AnnieAlvarez {
static Scanner lectura = new Scanner(System.in);
static Random r = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menu = true;
        
        while(menu==true){
            System.out.println("1. Divisores primos");
            System.out.println("2. Contorno de piramide");
            System.out.println("3. Vecinos");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opcion que desee");
            int opcion = lectura.nextInt();
            
            switch(opcion){
                case 1: {
                    System.out.println("1. Divisores primos");
                    System.out.println("Ingresar un numero entero");
                    int n = lectura.nextInt();
                    
                    if(n>=1){
                      String prim = Primos(n);
                      System.out.println("Los numeros primos que dividen el numero "+n+" son: "+prim);
                    }
                }//fin case 1
                break;
                
                case 2: {
                    System.out.println("2. Contorno de piramide");
                    System.out.println("Ingrese un numero impar");
                    int N = lectura.nextInt();
                    if(N%2!=0){
                        Contorno(N);
                    }
                }//fin case 2
                break;
                
                case 3: {
                    System.out.println("3. Vecinos");
                    System.out.println("Ingrese una cadena: ");
                    lectura.nextLine();
                    String cadena = lectura.nextLine().toLowerCase();
                    
                    boolean d = false;
                    for(int i = 0; i < cadena.length(); i++){
            
                        if(cadena.charAt(i)>=97 && cadena.charAt(i)<=122 && cadena.charAt(i)==32){
                            d = false;
                            String veci = Vecinos(cadena);
                            System.out.println("La cadena resultante: "+veci);
                        }else{
                            d = true;
                        }
                    }
                }//fin case 3
                break;
                
                case 4: {
                    System.out.println("4. Salir");
                    menu = false;
                }//fin case 4
                break;
                default:
                    System.out.println("Esa opcion no existe");
              
            }//fin switch
                   
        }//fin while
    }//fin main
    
    
    public static String Primos(int n){
        int m = 1;
        
        int divi = 0;
        String resp = "";
        while(m==1){
            System.out.println("Ingrese numero a evaluar: ");
            int num = lectura.nextInt();
            if((n/num)!= 0){
                 divi = num;
                System.out.print("["+divi+"]");
            }
        }
        return resp;
    }//fin metedo string
    
    
    
    public static void Contorno(int N){
        for(int i = 0; i<N;i++){
           for(int j = 0; j<N; j++){
               if( i==0 ||  j==N-1 || i==N-1 || j==0 ){
               System.out.print("*");
              
               }else{
                   System.out.print("+");
               }
           }
           System.out.println();
        }
    }//fin void
    
    
    public static String Vecinos(String cadena){
        int num = 0 + r.nextInt(1);
        String nueva = "";
        if(num==0){
            for(int i = 0; i<cadena.length(); i++){
                int letra = (int) cadena.charAt(i);
                int res = letra -1;
                char resul = (char)res;
                
                System.out.print(resul);
            }
        }else{
            for(int i = 0; i<cadena.length(); i++){
                int letra = (int) cadena.charAt(i);
                int suma = letra + 1;
                char resul = (char)suma;
                
                System.out.print(resul);
            }
        }
        return nueva;
    }//fin metodo string
    
  
    
}//FIN :(