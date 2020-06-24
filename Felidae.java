package Animal;

public class Felidae extends Animal{
	public String meowing;
	
	public  Felidae() {
        System.out.println("this is can meowing");
	}

	public String getMeowing() {
		return meowing;
	}

	public void setMeowing(String meowing) {
		this.meowing = meowing;
        System.out.println("它正在"+meowing);
	}
	
}
