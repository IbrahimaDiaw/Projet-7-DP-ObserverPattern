/**
 * 
 */
package Concrete;

import Abstract.IObserver;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class previsionMeteo implements IObserver{
	 private float pressionAct =29.92f;
	 private float pressionD;
	 private gestionMeteo meteo;
	 
	 
	/**
	 * @param meteo
	 */
	public previsionMeteo(gestionMeteo meteo) {
		super();
		this.meteo = meteo;
		meteo.register(this);
	}


	/**
	 * @return the pressionAct
	 */
	public float getPressionAct() {
		return pressionAct;
	}


	/**
	 * @param pressionAct the pressionAct to set
	 */
	public void setPressionAct(float pressionAct) {
		this.pressionAct = pressionAct;
	}


	/**
	 * @return the pressionD
	 */
	public float getPressionD() {
		return pressionD;
	}


	/**
	 * @param pressionD the pressionD to set
	 */
	public void setPressionD(float pressionD) {
		this.pressionD = pressionD;
	}


	/**
	 * @return the meteo
	 */
	public gestionMeteo getMeteo() {
		return meteo;
	}


	/**
	 * @param meteo the meteo to set
	 */
	public void setMeteo(gestionMeteo meteo) {
		this.meteo = meteo;
	}


	@Override
	public void update(float temp, float humidite, float pression) {
		// TODO Auto-generated method stub
		pressionD = pressionAct;
		pressionAct = pression;
		service();
	}
	
	public void service() {
		if(pressionAct > pressionD) {
		  System.out.println(" la previon : le temps s'ameliore");
		}
		else if(pressionAct==pressionD) {
			System.out.println(" la previon : le temps n'est plus de meme");
		}
		else if(pressionAct < pressionD) {
			System.out.println(" la previon : Attention au temps froid ou pluvieux");
		}
	}
	 
}
