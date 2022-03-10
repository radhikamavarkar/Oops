package com.xworkz.Crudoperation.Examples;

public class MobileDTO { 
	private	 String brandName;
	private	 String modelName;
	private	float price;
	private	String color;
	private	 byte ram;
	private	float ratings;
	private	 int storage;
								
	public MobileDTO () {
		
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	} 
	
	@Override  
	public String toString() { 
		return brandName+" "+modelName+""+price+""+ color+""+ram+""+ratings+""+storage;	
	} 
	
}
