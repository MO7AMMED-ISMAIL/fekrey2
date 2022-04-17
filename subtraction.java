
package section4;

/**
 *
 * @author new
 */
public class subtraction extends Thread{
    operation op;
    subtraction(operation op){
        this.op =op;
    }

    @Override
    public void run(){
        op.sub();
    }
}
