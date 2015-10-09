package com.iluwatar.servant;

import java.util.ArrayList;

public class Servant {
	public String name;
	
	public Servant(String name){
		this.name = name;
	}

	public void feed(IRoyalty r){
		r.getFed();
	}
	
	public void giveWine(IRoyalty r){
		r.getDrink();
	}
	
	public void GiveCompliments(IRoyalty r){
		r.receiveCompliments();
	}
	
	public boolean checkIfYouWillBeHanged(ArrayList<IRoyalty> tableGuests){
		boolean anotherDay = true;
		for( IRoyalty r : tableGuests )
			if( !r.getMood() ) anotherDay = false;
			
		return anotherDay;
	}
}
