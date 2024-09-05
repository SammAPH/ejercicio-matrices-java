package ejerciciomatrices;

import java.util.Scanner;

public class EjercicioMatrices {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //variables para dimensiones de matriz
        int numeroColumnas = 0, numeroFilas = 0;
        
        //pedir al usuario las dimensiones de la matriz
        System.out.print("Digite la cantidad de filas que desea agregar: ");
        numeroFilas = entrada.nextInt();
        System.out.print("Digite la cantidad de columnas que desea agregar: ");
        numeroColumnas = entrada.nextInt();
        
        //declaración de matriz y vector de resultado sumas
        int matriz[][];
        int[] sumasResultado = new int[1];
        
        //dibujar matriz
        matriz = new int[numeroFilas][numeroColumnas];
        
        //cargar info en la matriz
        for(int i=0; i<numeroFilas; i++){
            for(int j=0; j<numeroColumnas; j++){
                System.out.print("Ingrese el número para la posición ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.print("");
        }
        
        //suma de filas
        System.out.println("\nSuma de filas:");
        for(int i=0; i<numeroFilas; i++){
            for(int j=0; j<numeroColumnas; j++){
                sumasResultado[0] += matriz[i][j];
            }
            System.out.println("--Resultado fila "+(i+1)+" = "+sumasResultado[0]);
            sumasResultado[0] = 0;
        }
        
        //suma columnas
        System.out.println("Suma de columnas:");
        for(int j=0; j<numeroColumnas; j++){
            for(int i=0; i<numeroFilas; i++){
                sumasResultado[0] += matriz[i][j];
            }
            System.out.println("--Resultado columna "+(j+1)+" = "+sumasResultado[0]);
            sumasResultado[0] = 0;
        }
    }
    
}
//Developed by Samm&