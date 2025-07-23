package Q_answer;

public class Answer02Class {

	int kor;
	int eng;
	int math;
	
	public void printScore() { //class에서 지정해주기 때문에 반환할 필요없음 따라서 void
		int total = this.kor + this.eng + this.math; // this 필드명 명시하여 지정해줌, 가독성 좋음
		double avg = total/3.0;
		
		System.out.println("총점:" + total);
		System.out.println("총점:" + avg);
		
		if (avg>=90) {
			System.out.println("우수");
		}else if (avg<60) {
			System.out.println("재시험");
		}else {
			System.out.println("보통");
		}

	}
}
