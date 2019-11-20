package study.chap07_Field_polymorphism;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire : " + (maxRotation-accumulatedRotation) + "");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 교체 + ***");
			return false;
		}
	}
}
