package lab1;

public class WriterInfo {
	public static void printInfo(Ward ex) {
		System.out.println("Фамилия врача: " + ex.getSurname());
		System.out.println("Количество мест: " + ex.getBeds());
		System.out.println("Количество свободных коек: " + ex.getFreeBeds()+"\n");
	}
	
}
