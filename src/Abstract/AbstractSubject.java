/**
 * 
 */
package Abstract;


/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public interface AbstractSubject {
    
       public void register(IObserver obs);
       public void unregister(IObserver obs); 
       public void notifyObserver();
	
}
