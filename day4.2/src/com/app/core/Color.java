package com.app.core;

public enum Color {   //java.lang.Enum is super class
	WHITE(10000), SILVER(20000), BLACK(15000), BLUE(35000), RED(50000);
	//0,1,2,3,4 ordinal positions
	
	//state : Color cost
	private double colorCost;

	private Color(double colorCost) {   //no one can create instance of enum outside 
		 								//the class thats why private
		//super(name,ordinal position);
		this.colorCost = colorCost;
	}
	//getter

	public double getColorCost() {
		return colorCost;
	}
	
	@Override
	public String toString()   //can override tostring() in enum
	{
		return name()+"@"+colorCost;
	}
	
}
