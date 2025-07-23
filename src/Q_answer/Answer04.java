package Q_answer;



public class Answer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Answer04Class sum = new Answer04Class();
		sum.runtime = 150;
		sum.genre = "SF";
		sum.title = "슈퍼맨";
		
		System.out.println("긴 영화인가요?" + sum.isLongMovie());
		
		Answer04Class sum2 = new Answer04Class(null, null, 0);
		//기본 생성자가 아닌 지정한 생성자로 객체를 설정하면, 메모리에 객체가 새로 생성되면서
		//생성자에서 지정한 값으로 초기화와 값이 바로 저장됨
		//생성자를 만들지않고 만들면 기본값생성자가 들어감
	}

}
