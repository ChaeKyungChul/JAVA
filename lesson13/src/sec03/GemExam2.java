package sec03;

public class GemExam2 {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();
		OfficeAgency officeAgecy = new OfficeAgency();
		
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		Office office = new Office();
		office.work();

	}

}
                                                                                                            