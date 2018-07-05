/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

/**
 *
 * @author Sab
 */
public class Entry {
    
    
    public static void main(String[] args) {
        /* ClassA c = new ClassB();
        c.print("Hello, java!");
        */
        int x = 10;
        ClassA c2 = new ClassA(){
          @Override
          void print (String s){
              System.out.println(s);
          }  
        };
        c2.print(" Guten morgen ");
     /*   
        InterfaceA a = new InterfaceA() {
            @Override
            public void Method2() {
                System.out.println("Hello , interface");
            }
        }; a.Method2();
         */
      InterfaceA a = (s) -> System.out.println(s); // lambda expression
      /*
      args 
      ->
      body 
      */
      a.Method2("ahmed");
     
        
        
    }
}
