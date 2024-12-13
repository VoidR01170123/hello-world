package chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		/*String name;
		name = "中野さん"; -> 두 줄로 나누어서 변수 선언 및 초기화*/ 
		
		String name = "中野さん"; //한 줄로 변수 선언 및 초기화
		int hour = 15;
		
		System.out.println(name + "、 本日、配送致します。" + hour + "時お伺いの予定です。");
		System.out.println(name + "、宅配がお届致しました。");
		
		double score = 90.5;
		char grade = 'A'; // 문자는 작은따옴표, 문자열은 큰따옴표!!
		name = "안성준님"; //값의 업데이트 가능
		System.out.println(name + "의 평균 점수는" + score + "입니다.");
		System.out.println("학점은" + grade + "입니다." );
	
		boolean pass = true;
		System.out.println("이번 시험은 합격입니까?" + pass);
		
		double d = 3.14123456789;// 결과값을 보면 double이 더 자세한 값을 얻는다.
		float f = 3.14123456789f;// F를 붙여주는 이유는, 이 변수값이 float 변수f에 대입 전에 임시 저장이 되는데,
		//그 형태가 기본적으로 double 형태이기때문에, f를 붙여줘서 float으로 임시저장하는거임. 안그러면 overflow 
		System.out.println(d);
		System.out.println(f);
		
		// int i = 100000000000; // int 자료형의 표현가능 범위는 대략 -21억에서 21억 사이.
        //int 자료형은 4byte, 즉 32bit이므로, 2의 31승 계산하면 대충 21억.
        //System.out.println(i);

        long l = 100000000000L; // L을 안적으면 int형 자료로 인식하고 int형으로 임시저장.
                                // 따라서, L을 적어줘야 int보다 범위값이 더 큰 long에 저장 가능
        l = 1_000_000_000_000L; // 0을 3개씩 underscore로 구분해도 됨.
        System.out.println(l);

	}

}
