/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_sumatorias;

import java.util.Scanner;
/**
 *
 * @author hugob
 */
public class Calculo_Sumatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        int n,constanteITres,constanteIDos,constanteI,constante;
        int cResult,iResult,iDosResult,iTresResult;
        Scanner lector = new Scanner(System.in);
        // Entrada de Datos
        System.out.println("ingrese el valor de n: ");
        n = lector.nextInt();
        System.out.println("Ingrese el valor de la constante de i∧3");
        constanteITres=lector.nextInt();
        System.out.println("Ingrese el valor de la constante de i∧2");
        constanteIDos=lector.nextInt();
        System.out.println("Ingrese el valor de la constante de i");
        constanteI=lector.nextInt();
        System.out.println("Ingrese el valor de la constante unica");
        constante=lector.nextInt();
        // Guardado de Resultados de modulos
        cResult=sumatoriaC(n,constante);
        iResult=sumatoriaI(n,constanteI);
        iDosResult=sumatoriaIDos(n,constanteIDos);
        iTresResult=sumatoriaITres(n,constanteITres);
        //resultado
        System.out.println("el resultado de la sumatoria es: " + resultado(cResult,iResult,iDosResult,iTresResult));
    }
    public static int sumatoriaC(int number, int cosnstante){
        int sumatoria = (number * cosnstante);//n * c
        return sumatoria;
    }
    public static int sumatoriaI(int number, int contstante){
        int sumatoria = ((number * (number+1))/2);// n(n+1)/2
        int sumatoriaCI=sumatoria*contstante;
        return sumatoriaCI;
    }
    public static int sumatoriaIDos(int number,int constante){
        int sumatoria = ((number * (number+1) * ((2 * number)+1))/6); //n(n+1)(2n+1)/6
        int sumatoriaCIDos=sumatoria*constante;
        return sumatoriaCIDos;
    }
    public static int sumatoriaITres(int number,int constante){
        int sumatoria = ((number * (number+1))/2);// n(n+1)/2
        int cuadrado= (int)(Math.pow(sumatoria, 2));// (n(n+1)/2) al cuadrado
        int sumatoriaCItres=cuadrado*constante;
        return sumatoriaCItres;
    }
    public static int resultado(int i,int i2, int i3, int c){
        int resultado=i+i2+i3+c;
        return resultado;
    }
}
