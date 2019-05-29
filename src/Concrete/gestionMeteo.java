/**
 * 
 */
package Concrete;

import java.util.ArrayList;

import Abstract.AbstractSubject;
import Abstract.IObserver;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class gestionMeteo implements AbstractSubject{

	private ArrayList<IObserver> observers;
	
	private float temperature;
	private float himidite;
	private float pression;
	
	/**
	 * 
	 */
	public gestionMeteo() {
		super();
		 observers = new ArrayList<>();
	}

	@Override
	public void register(IObserver obs) {
		// TODO Auto-generated method stub
		observers.add(obs);
		
	}

	@Override
	public void unregister(IObserver obs) {
		// TODO Auto-generated method stub
		 int index = observers.indexOf(obs);
  	     observers.remove(index); 
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(IObserver observer : getObservers()){
	   		  observer.update(temperature,himidite,pression);
	   		}
	}
	/**
	 * @return the observers
	 */
	public ArrayList<IObserver> getObservers() {
		return observers;
	}

	/**
	 * @param observers the observers to set
	 */
	public void setObservers(ArrayList<IObserver> observers) {
		this.observers = observers;
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the himidite
	 */
	public float getHimidite() {
		return himidite;
	}

	/**
	 * @param himidite the himidite to set
	 */
	public void setHimidite(float himidite) {
		this.himidite = himidite;
	}

	/**
	 * @return the pression
	 */
	public float getPression() {
		return pression;
	}

	/**
	 * @param pression the pression to set
	 */
	public void setPression(float pression) {
		this.pression = pression;
	}
	public void mesure() {
		notifyObserver();
	}
	public void setMesure(float temp, float humidite, float pression) {
		this.temperature=temp;
		this.himidite= humidite;
		this.pression= pression;
		mesure();
		
	}
	

}
