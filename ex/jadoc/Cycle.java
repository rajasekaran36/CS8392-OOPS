public class Cycle{
	
	public String brand;
	public int mfid;
	public String color;
	
	public Cycle(String brand, int mfid, String color){
	
		this.brand = brand;
		this.mfid = mfid;
		this.color = color;
	
	}
	
	public String getBrand(){
		return this.brand;
	
	}
	
	public void displayCycle(){
		System.out.println("Cycle Details");
		System.out.println("-------------");
		System.out.println("Brand:"+this.brand);
		System.out.println("Mfid:"+this.mfid);
		System.out.println("Color:"+this.color);
	
	}
}
