package lab1;

public class lab1main {
	public static void main(String[] args) {
		Ward w1 = new Ward();
		Ward w2 = new Ward("Иванов",50,20);
		Ward w3 = new Ward("Михайлова");
		Ward w4 = new Ward(50);
		WriterInfo.printInfo(w1);
		WriterInfo.printInfo(w2);
		WriterInfo.printInfo(w3);
		WriterInfo.printInfo(w4);
		System.out.println("Hello World!");
	}
}
