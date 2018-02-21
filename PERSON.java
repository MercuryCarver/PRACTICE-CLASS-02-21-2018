
public class PERSON {
		// TODO Auto-generated method stub

		String name;
		int age;
		
		public PERSON(String name2, int age2) {
			name = name2;
			age = age2;
	}
		public boolean isAdult() {
			if(age>18) {
				return true;
			}else {
				return false;
			}
		}
	}
	

