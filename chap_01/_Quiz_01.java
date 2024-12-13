/*
(실행 결과)
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
 */

package chap_01;

public class _Quiz_01 {

	public static void main(String[] args) {
		 String busNo = "상암08번 버스";
	        int leftTime = 3;
	        float leftDistance = 1.2F;

	        System.out.println(busNo + "\n약 " + leftTime + "분 후 도착\n"+"남은 거리 " + leftDistance + "km");

	}

}

//고칠 점
//1. 변수 맨 앞은 소문자
//2. 굳이 공백 넣을 때 " " 말고 앞에서 띄어도 됨. ex) "약"
//3. 줄바꿈 \n 대신 하나하나 출력문 입력해도 됨