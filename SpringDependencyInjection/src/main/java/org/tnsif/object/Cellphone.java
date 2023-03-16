package org.tnsif.object;

public class Cellphone {

	
		Charger charger;
        //DI using setter 
		public void setCharger(Charger charger) {
			this.charger = charger;
		}
		
		//injecting the object of charger class
		public void accept()
		{
			charger.power();
		}
		
		
		

	

}
