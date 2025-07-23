package Q_answer;


public class Answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Answer01Class sum = new Answer01Class();
		sum.name = "사과";
		sum.price = 20;
		sum.quantity = 10;
		
		int total = sum.getTotalPrice();
		System.out.println("총 가격 :" + total);
		
		
	}

}
