/**
 * 
 */
package Main;

import Concrete.StatsTemps;
import Concrete.gestionMeteo;
import Concrete.previsionMeteo;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class StationMeteo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       gestionMeteo meteo = new gestionMeteo();
       StatsTemps stats = new StatsTemps(meteo);
       previsionMeteo prevision= new previsionMeteo(meteo);
	   
       meteo.setMesure(75, 55, 20.4f);
       meteo.setMesure(82, 70, 29.2f);
       meteo.setMesure(78, 90, 29.2f);
	
	}

}
