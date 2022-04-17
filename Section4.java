/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section4;

/**
 *
 * @author new
 */
public class Section4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // first way
        operation op = new operation();
         summtion sum = new summtion(op);
         subtraction sub = new subtraction(op);
         multiplication mul = new multiplication(op);
         
         sum.start();
         sub.start();
         mul.start();
       //second way
         
         addition add =new addition();
         Subtract sub2 =new Subtract();
         Thread t = new Thread(add);
         Thread t2 = new Thread(sub2);
         t.start();
         t2.start();
    }
    
}
