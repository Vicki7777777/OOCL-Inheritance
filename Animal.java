package Animal;

public class Animal {
	public int age;
	public int weight;
	public String running;
	public String eating;
	
	public Animal() {
        System.out.println("this is an animal");
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public String getRunning() {
		return running;
	}
	public void setRunning(String running) {
		this.running = running;
	}
	public String getEating() {
		return eating;
	}
	public void setEating(String eating) {
		this.eating = eating;
	}

}
