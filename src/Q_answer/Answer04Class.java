package Q_answer;

public class Answer04Class {

	String title;
	String genre;
	int runtime;
	
	public Answer04Class() { //기본 생성자 (생략됨)	
	}
	public Answer04Class(String title, String genre, int runtime) {// 새로운 생성자를 추가함
		this.title = title;
		this.genre = genre;
		this.runtime = runtime;
	}//this를 쓰면 본인 class안에있는 필드명을 지칭
	 //메소드 이름이 같아도 메개변수가 다르면 다른메소드로 인식됨
	
	
	
	public boolean isLongMovie() {
		return runtime >= 120;
	}
}
