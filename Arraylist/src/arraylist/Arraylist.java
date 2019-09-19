/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list= new ArrayList<String>();
       list.add("Alice");
       list.add("Was");
       list.add("Beginning");
       list.add("to");
       list.add("gett");
       list.add("tired");
       list.set(4,"get");
       list.add(5,"very");
    
           System.out.print(""+ list);
           
    
       
    }
    
}
