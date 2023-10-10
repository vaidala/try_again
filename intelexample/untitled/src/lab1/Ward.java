package lab1;

public class Ward {
		private String surname;
		private int beds;
		private int freeBeds;
		
		public void setName(String surname){
			this.surname = surname;
		}
		public void setBeds(int beds) {
			this.beds = beds;
		}
		public void setFreeBeds(int freeBeds) {
			this.freeBeds = freeBeds;
		}
		
		public Ward() {
			surname=new String();
		}
		public Ward(Ward o) {
			this.surname = o.surname;
			this.beds = o.beds;
			this.freeBeds = o.freeBeds;
		}
		public Ward(String surname, int beds, int freeBeds) {
			this.surname=surname;
			this.beds=beds;
			this.freeBeds=freeBeds;
		}
		public Ward(String surname) {
			this();
			this.surname=surname;
		}
		public Ward(int beds) {
			this();
			this.beds=beds;
			this.freeBeds =beds;
		}

		public String getSurname() {
		return surname;
		}
		public int getBeds() {
		return beds;
		}
		public int getFreeBeds() {
		return freeBeds;
		}
}
