/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Palindromo extends List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Stack <Character> pila2 = new Stack<>();
        String var;
        Scanner compare = new Scanner(System.in);
        System.out.println("Introduce una frase o palabra");
        var = compare.nextLine();
        
        char[] result = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        
        char [] reversed = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        
        invierteArreglo(reversed,pila2);
        String rev = String.valueOf(reversed);
        String res = String.valueOf(result);
        compareString(rev,res);
    }
    }
    

