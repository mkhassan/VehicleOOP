
public class Car extends Vehicle {
	private String name;
	private String Color;
	private int numTires;
	
	
	public Car(){
		//System.out.println("A car has been created");
	};
	
	public Car(String name, String Color, int nTires){
		
		this.name = name;
		this.Color = Color;
		this.numTires = nTires;
	}
	
	
	// provide methods to set name and color of vehicle
	
	public void setName(String carName){
		name = carName;
	}
	
	public void setColor(String carColor){
		Color = carColor;
	}
	
	public void setnTires(int nTires) {
		numTires = nTires;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String getName() {
		return name;
	}
	
	public int getnTires() {
		return numTires;
	}
@Override

public String start() {
	return "the "+Color+" "+name+" car is starting";
	
}

@Override
public String accelerate() {
	return "the "+Color+" "+name+" car  is accelerating";
}

@Override
public String speed(int x) {
	return "the "+Color+" "+name+" car is speeding at "+x;
	
}
@Override
public String stop() {
	return "the "+Color+" "+name+" car is stopped";
}

public String emissioncheck() {
	return "the "+Color+" "+name+" has stopped to have its emission checked";
}

public String emissionpassed() {
	return "the "+Color+" "+name+" passes its emission test";	
}


}
