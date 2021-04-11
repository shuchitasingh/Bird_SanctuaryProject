package bird;
	
import java.util.ArrayList;
import java.util.List;

public class BirdSancutaryManager {
	
	List<Bird> birdList = new ArrayList();
	
	public void add(Bird bird) {
	     birdList.add(bird);
	     bird.incrementCount();
	}
	public void remove(Bird bird) {
		birdList.remove(bird);
		bird.decrementCount();
		
	}
	public void printEatingBirds() {
    		for (Bird bird: birdList) {
    			bird.eat();
    		}
	}
    
	public void printFlayableBirds() {
        	for (Bird bird: birdList) {
        		if(bird instanceof Flyable) {
        			((Flyable)bird).fly();
        	}
    }
}
   
	public void printSwimableBirds() {
            for (Bird bird: birdList) {
            	if(bird instanceof Swimable) {
            		((Swimable)bird).swim();
            	}
            }
            	   	
            

	}
 
}
