/*

※ 지시자 = '.'



※ 각 class간의 연동 = new 선언으로 가능한거야



※ 메모리구조적인 시점에서의 고찰

stack 영역에서
ClassTess class에서 봤을 때 kb, sh가 있을거임.
여기에서 kb와 sh는 new Account를 대입함으로써 새로운
heap 영역에 있었던 Account class를
가리키게 되었다. 그 다음 객체 초기화에서,
kb/sh.bank 와 같은 형식으로 cpp에서의 '->'처럼 지시자, '.'을 사용하여 
Class Account의 멤버변수(bank, id, name, money)를 가리킨다.
마찬가지로 메서드(=함수)를 따로 작성하지는 않았으나, Class Account의 함수를 지시자를 통하여
호출하는 것이 가능하다.

즉 stack 영역에서는 ClassTest class에 kb, sh가 있고
heap 영역에서는 Account가 있는 것이다.

기본타입 변수(stack 영역에 저장) : int, boolean 등의 것
참조타입 변수(heap 영역에 저장) : String(이거 사실 참조타입임), Account(만들었던 것) 등의 것.

참조변수 : 객체를 만들 때 쓰는거야 그러니까. Account(형) 변수 = new Account( ~ )잖아. 객체형 변수 = 객체. 그니까 그 변수가 객체라고.

stack 영역의 변수는 program이 종료되면 알아서 제거된다.
하지만 heap 영역의 변수는 그렇지 않다 그래서 g.c(garbage collector)를 사용한다.









 */