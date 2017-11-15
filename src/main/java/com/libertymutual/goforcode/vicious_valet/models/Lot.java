package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;


//size, isLotFull,
public class Lot {
	
	private ArrayList<Car> carList; //declared the variable (now it is available)
	private int capacity = 5;
	
	public int size() {
		return carList.size(); //another way to determine the number of cars in the lot, and can use that on the app.html  
		//in the HTML now, could use {{ lot.size }} or {{ lot.carList.size }}
			}
	
	public Lot() { 
		carList = new ArrayList<Car>(); //set it to an initial value and create the object
	}
	
	public void driveCarOnto(Car car) { //Class = Car , car = variable
		//add car to lot if it has capacity		
		if(isLotFull() == false) { //could use isLotFull == false or !isLotFull)
		carList.add(car);
		}
	}
	
	public void removeCarFromLot(int index) { //did not have a method to remove the car from the lot, so needed to add another one in the lot class
		carList.remove(index - 1); //discrepancy between the HTML order and the computer order
	}
	
	
	public boolean isLotFull() {
		if(carList.size() < capacity) {
			return false;
		}else {
		return true;
		}	
		}
	
	public ArrayList<Car> getCarList() {
		return carList;
	}	
}