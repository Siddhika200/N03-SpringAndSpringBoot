package org.tnsif.autowiredexample;

public class Land {
   Farmer f;

public void setF(Farmer f) {
	this.f = f;
}
public void accept()
{
	f.water();
}
}
