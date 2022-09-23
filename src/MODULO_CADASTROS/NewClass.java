/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODULO_CADASTROS;

/**
 *
 * @author Alann
 */
public class NewClass {
    
    public static void soma (String n1,String n2, int id1, int id2){
        n1=n1+n2;
        id1=id1+id2;
    }
    public static void main(String[]args){
        String n1,n2;
        int id1,id2;
        n1 = new String("joao");
        n2 = new String("Silva");
        id1 = 10;
        id2 = 20;
        soma(n1,n2,id1,id2);
        System.out.println("Nome:"+n1+" idade:"+id1);
                
    }
    
}
