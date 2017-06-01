
public class CarApp {

	public static void main(String[] args) {
	 
		//Vehicle v = new Vehicle();
		//print(v.start());
		//print(v.stop());
		
		Car a = new Car("porsche", "red", 4);
		
		Car b = new Car();
		
		b.setName("jetta");
		b.setColor("Brown");
		b.setnTires(4);
		
		
		print(a.start());
		print(b.start());
		print(a.accelerate());
		print(b.accelerate());
		print(b.emissioncheck());
		print(b.emissionpassed());
		print(a.speed(50));
		print(a.stop());
		
		
		
System.out.println("the "+b.getColor()+" "+b.getName()+" just passed the "+a.getColor()+" "+a.getName()+"");
		
		
		

	}
	
	private static void print(String s) {
		System.out.println(s);
	}
	
	
	
	

}
