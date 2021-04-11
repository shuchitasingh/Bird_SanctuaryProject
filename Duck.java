package bird;

public class Duck extends Bird implements Flyable, Swimable{
        public static int count;
        
	public void swim() {
		System.out.println("Duck can  swim");
	}
	
	public void eat() {
		System.out.println("Duck can eat");
	}
	
	public void fly() {
		System.out.println("Duck can  fly");
	}

	
	public int getCount() {
		return count;
	}

	
	public int incrementCount() {
		  return count += 1;
		
	}
	public int decrementCount() {
		  return count -= 1;
	
    }
}
