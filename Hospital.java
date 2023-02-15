package lab6;

public class Hospital {

	public static void main(String[] args) {
		HospitalEmployee vito = new HospitalEmployee("Vito", 123);
		Administrator jason = new Administrator("Jason", 404, "HR");
		
		System.out.println(vito);
		System.out.println(jason);
		System.out.println();
		
	    vito.work();
	    jason.administrate();
	}

}
