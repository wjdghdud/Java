package sub3;

// 내용 : 인터페이스의 중요한 역할과 연관되어 다루어지는 내용.

/* note

Java program은 수많은 객체들로 이루어져 있으며 그 객체들간에는 상호관계를 이루는 결합으로 이어져 있다.
이때 각 결합은 강하게 결합되어 있으면 올바르지 못하며 약하게 결합되어 있는 게 이상적이다. 객체는 그 자체만으로
강한 응집력(캡슐화)을 갖고 있다. 하지만 객체들간의 결합은 느슨하게 결합되어 있는 게 좋으며, 그 약한 결합은 interface를 통해 가능하다.

sub3 요약 : 케이블로 소켓을 연결하여 벌브의 동작(전구). 그러니까 중간연결다리(interface가 소켓)
*/

public class InterfaceTest3 {
	public static void main(String[] args) {
		
		// 인터페이스의 역할 : 객체간의 결합도를 낮추는 역할.
		
		Bulb bulb = new Bulb();
//		Cable cable = new Cable(bulb); // 소켓달린 케이블에 전구를 끼우는 것을 표현. 하지만 이것은 너무 강한 결합입니다.
		Socket cable = new Cable(bulb); // 이게 다형성을 적용하여 약한 결합임을 표현한다.
		
		
		cable.switchOn();
		cable.switchOff();
		
	}
}
