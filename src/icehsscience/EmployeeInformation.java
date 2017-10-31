package icehsscience;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name="홍길동";
		String enter="2002";
		int year=2017;
		int parseEnter=Integer.parseInt(enter);
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + enter);
		System.out.println(year- parseEnter);
	}

}
