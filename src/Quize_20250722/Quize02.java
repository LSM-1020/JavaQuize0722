package Quize_20250722;

public class Quize02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quize02Class sum = new Quize02Class();
		sum.eng = 80;
		sum.kor = 90;
		sum.math = 100;
		
		int total = sum.printScore();
		System.out.println("총점:" + total);
		System.out.println("평균:" + (double) total/3);
		
		
			if (total>=90) {
				System.out.println("우수");
			}else if (total<60) {
				System.out.println("재시험");
			}else {
				System.out.println("보통");
			}
	
		
	}

}
