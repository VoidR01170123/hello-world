package chap_01;

public class _04_Comment {

	public static void main(String[] args) {

		System.out.println("(10分前) まもなく結婚式が行われる予定ですのでご着席お願いします。"); // ctrl+alt+↑(↓) 하면 문장복사
        //System.out.println("(5分前) まもなく結婚式が行われる予定ですのでご着席お願いします。"); 주석처리는 //
        System.out.println("只今結婚式が始まります。");

        int size = 120;
        size = size + 10;//주석을 통해서 설명 적기 가능
        System.out.println("靴のサイズ" + size + "で見せて貰えますか。");

        /*int a = 10;
        int b = 20;
        System.out.println(a + b);*/
        // 여러 줄을 주석으로 변환할 떄는 /*로 시작, */로 닫기. or 범위에 대해 ctrl+shift+/
        // 한 줄 주석 단축키는 ctrl+/
	}

}
