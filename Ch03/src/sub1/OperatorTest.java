package sub1;

// 내용 : 연산자

public class OperatorTest {

	public static void main(String[] args) {
		
		// 산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3, num4 = 4; // 이렇게 선언해도 됨
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2; // 몫 구하기.
		int rs5 = num4 % num3; // 나머지 구하기.
		int rs6 = num4 % num2;
		int rs7 = 11 % 4;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		System.out.println("rs6 : "+rs6);
		System.out.println("rs7 : "+rs7);
		System.out.println();
		
		
		// 증감, 감소 연산자
		int n1 = 1;
		int n2 = 2;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println();
		
		n1 ++; // +1
		n2 --; // -1
		
		System.out.println("n1` : "+n1);
		System.out.println("n2` : "+n2);
		System.out.println();
		
		n1 ++;
		n2 --;
		
		System.out.println("n1`` : "+n1);
		System.out.println("n2`` : "+n2);
		System.out.println();
		
		
		// 복합대입연산자
		int no1 = 1;
		int no2 = 3;
		int no3 = 3;
		int no4 = 9;
		
		no1 += 1; // 좌변에서 우변의 것을 더함. no1 = no1 + 1;
		no2 -= 2; // 좌변에서 우변의 것을 뺌. no2 = no2 - 2;
		no3 *= 3; // 좌변에서 우변의 것을 곱함. no3 = no3 * 3;
		no4 /= 4; // 좌변에서 우변의 것을 나누고 몫을 얻음. no4 = no4 / 4;
			// 즉 우변의 변수를 대입하여 +, -, *, /의 연산을 좌변의 것과 한다. 순서 : 좌변 -> 연산(+, -, *, /) -> 우변 = 좌변의 결과 값.
		
		System.out.println("no1 : "+no1);
		System.out.println("no2 : "+no2);
		System.out.println("no3 : "+no3);
		System.out.println("no4 : "+no4);
		System.out.println();
		
		
		// 비교연산자
		int var1 = 1, var2 = 2;
		
		boolean res1 = (var1 > var2); // var1이 var2보다 크다. 맞니 틀리니?
		boolean res2 = (var1 < var2); // var1이 var2보다 작다. 맞니 틀리니?
		boolean res3 = (var1 >= var2); // var1이 var2보다 크거나 같다. 맞니 틀리니?
		boolean res4 = (var1 <= var2); // var1이 var2보다 작거나 같다. 맞니 틀리니?
		boolean res5 = (var1 == var2); // var1과 var2은 서로 같다. 맞니 틀리니?
		boolean res6 = (var1 != var2); // var1과 var2은 서로 다르다. 맞니 틀리니?
		
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
		System.out.println();
		
		
		// 논리연산자. 비교식 두 개 이상을 하나의 식으로 만듦.
		boolean r1 = (var1 > 0) && (var2 > 1); // &&(and. 그리고). var1은 0보다 크다. 그리고 var2는 1보다 크다. 맞니 틀리니?
		boolean r2 = (var1 > 0) && (var2 > 2); // &&(and. 그리고). var1은 0보다 크다. 그리고 var2는 2보다 크다. 맞니 틀리니?
		// 둘 중 하나라도 false일 시, 출력값 = false. 즉 &&는 둘 다 true여야 true 출력
		
		boolean r3 = (var1 > 0) || (var2 > 1); // ||(or. 또는). var1은 0보다 크다. 또는 var2는 1보다 크다. 맞니 틀리니?
		boolean r4 = (var1 > 0) || (var2 > 2); // ||(or. 또는). var1은 0보다 크다. 또는 var2는 2보다 크다. 맞니 틀리니?
		boolean r5 = (var1 > 1) || (var2 > 2); // ||(or. 또는). var1은 1보다 크다. 또는 var2는 2보다 크다. 맞니 틀리니?
		// 둘 중 하나라도 true일 시, 출력값 = true. 즉 ||는 하나라도 true라면 true 출력
		
		boolean r6 = !(var1 > var2); // var1은 var2보다 크지 않다. 맞니 틀리니?
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4); // 요약 : && = 둘 다 true, true 출력.
		System.out.println("r5 : "+r5);	//		|| = 하나라도 true, true 출력
		System.out.println("r6 : "+r6);
		
	}
}
