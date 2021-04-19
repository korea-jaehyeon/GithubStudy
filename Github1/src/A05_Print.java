
public class A05_Print {

	public static void main(String[] args) {
		
		/*
		   # 콘솔에 출력하기 위한 여러가지 함수들
		   
		   1. print()
		      - 줄을 자동으로 바꾸지 않는 가장 기본 출력
		      
		   2. println()
		      - 줄을 자동으로 바꿔주며 출력하는 함수
		      - ()에 전달한 데이터 맨 뒤에 '\n'을 추가하여 출력한다
		      - ()에 아무것도 전달하지 않으면 '\n'만 출력한다
		      - ()에 아무것도 전달하지 않으면 '\n'만 출력한다
		   
		 */
		
		
		
		
		/*
		   3. printf()
		      - 서식 문자를 이용할 수 있는 출력 함수
		      - 문자열 +로 이어붙이는 것 보다 서식을 사용하는 경우가 편리할 때도 있다
		      - 출력의 형태를 미리 만들고, 서식 문자 자리에 값을 채워서 사용한다
		      - 줄을 자동으로 바꿔주지 않는다
		 */
		int year = 2021, month = 3, day = 17,
				hour = 11, minute = 9, second = 38, millisec = 1234;
		
		System.out.println(year+ "년" + month + "월" + day + "일 /"
				+ hour + ":" + minute + ":" + second +"." + millisec);
		
		System.out.printf("%d년 %d월 %d일 / %d:%d:%d.%d\n",
				year, month, day, hour, minute, second, millisec);
		
		/*
		   # 서식 문자의 종류
		   
		       %d     : 해당 자리에 전달한 정수를 10진수로 출력해준다. 
		       %x,%X  : 해당 자리에 전달한 정수를 16진수로 출력해준다.
		       %o     : 8진수 정수
		       %s     : 문자열 (string)
		       %c     : 문자 (character)
		       %f     : 실수 (float)
		        
		   # 10진수의 숫자들
		     0 1 2 3 4 5 6 7 8 9 10
		   # 8진수의 숫자들
		     0 1 2 3 4 5 6 7 10   
		   # 16진수의 숫자들
		     0 1 2 3 4 5 6 7 8 9 a b c d e f 10
		 */
		
		// # 서식문자 옵션들
		// ※ 서식문자 자리에는 d만 넣어야 하는 것은 아님
		
		// # %숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다.
		System.out.printf("사과 : %d개\n", 10);
		System.out.printf("사과 : %10d개\n", 10);
		System.out.printf("사과 : %20d개\n", 10);
		
		System.out.printf("[[  %s  ]]\n", "Hello, world!");
		System.out.printf("[[  %25s  ]]\n", "Hello, world!");
		System.out.printf("[[  %50s  ]]\n", "Hello, world!");
		
		// %-숫자 d: 숫자만큼 칸을 확보한 뒤 왼쪽 정렬하여 출력한다
		System.out.printf("사과 : %d개\n", 10);
		System.out.printf("사과 : %-10d개\n", 10);
		System.out.printf("사과 : %-20d개\n", 10);
		
		System.out.printf("%s : 10개\n", "사과");
		System.out.printf("%-7s : 10개\n", "귤");
		System.out.printf("%-10s : 10개\n", "바나나");
		
		// %0숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸에 0을 채워서 출력한다.
		System.out.printf("%d개\n", 5);
		System.out.printf("%02d개\n", 5);
		System.out.printf("%03d개\n", 5);
		System.out.printf("%020f\n", 3.141234);
		
		// %+d : 양수 앞에도 부호를 붙여준다.
		System.out.printf("양수: %d , 음수: %d\n", 5, -5);
		System.out.printf("양수: %+d , 음수: %d\n", 5, -5);
		
		// %.숫자f : 소수 자릿수를 설정한다
		double avg = 123.125555;
		
		System.out.printf("평균점수 : %f\n", avg);
		System.out.printf("평균점수 : %.2f\n", avg);
	}
}
