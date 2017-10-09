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
public class Nodo <T> {
     T data;
    Nodo next;
    
    Nodo(T d){
        this.data = d;
        this.next = null;
    }
     Nodo (){
        next = null;
    }
    public void print(){
        System.out.println(data+"->");
    }
    public void printS(){
        System.out.println(data);
        System.out.println("↓");
    }
}

