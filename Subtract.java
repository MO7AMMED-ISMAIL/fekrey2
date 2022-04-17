
package section4;

/**
 *
 * @author new
 */
public class Subtract implements Runnable{
    
    @Override
    public void run(){
        int x = 100;
        for (int i = 0; i < 10; i++) {
            x -= i;
        }
        System.out.println("thread substract Value: "+x);
    }
    
}
