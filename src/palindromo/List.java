/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author esteb
 */
public class List {
     
    public static char[] invierteArreglo(char[] result,Stack<Character> pila2){
        char [] reversed = result;
        for (int i = 0; i < result.length; i++){
            pila2.push(result[i]);
        }
        for (int i = 0; i < result.length; i++) {
            reversed[i]=pila2.pop();
        }
      
        return reversed;
    }
     public static void showArray(char[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   
    public static void compareString(String n, String r){
        if (n.equals(r)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}

