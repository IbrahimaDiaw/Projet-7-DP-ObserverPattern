/**
 * 
 */
package Concrete;

import Abstract.IObserver;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class StatsTemps implements IObserver{
	private float maxTemp = 0.0f;
	 private float minTemp = 200;
	 private float somme= 0.0f;
	 private int nombre;
	 private gestionMeteo meteo;
    
	/**
	 * @param meteo
	 */
	public StatsTemps(gestionMeteo meteo) {
		super();
		this.meteo = meteo;
		this.meteo.register(this);
	}



	@Override
	public void update(float temp, float humidite, float pression) {
		// TODO Auto-generated method stub
		somme += temp;
		  nombre++;

		  if (temp > maxTemp) {
		   maxTemp = temp;
		  }
		 
		  if (temp < minTemp) {
		   minTemp = temp;
		  }

		  service();
	}
	public void service() {
		  System.out.println("la temperature moyenne " + (somme / nombre));
		  System.out.println("la temperature maximale " + maxTemp);
		  System.out.println("la temperature minimale " + minTemp);
		  

		
		 }
		
   
}
