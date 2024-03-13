package sec03;

public class OfficeAgency implements Rentable<Office> {

	@Override
	public Office rent() {		
		return new Office();
	}

}


