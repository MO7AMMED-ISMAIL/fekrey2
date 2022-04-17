
package section4;

/**
 *
 * @author new
 */
public class multiplication extends Thread{
    
    operation op ;
      multiplication(operation op){
         
         this.op = op;
     }
    @Override
    public void run(){
        op.mul();
    }
}
