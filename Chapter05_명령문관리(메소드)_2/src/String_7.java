/*
 * 	trim() : 좌우의 공백 제거 (가운데는 안 함)
 * 		=> 유효성 검사
 * 	valueOf() : 모든 데이터형을 문자열로 변경
 * 		valueOf(100) => "100"
 * 			윈도우에 출력하려면 무조건 문자열로 변경해야함
 * 	format() : 형식을 변경 (printf와 동일)
 * 
 */

import javax.swing.*;
public class String_7 extends JFrame {

	JTextField tf = new JTextField();
	public String_7()
	{
		add("North", tf);
		tf.setText(String.valueOf(10));	// 10을 그대로 넣으면 들어가지 않기 때문에 valueOf() 로 문자열로 변환하여 넣어준다
		// 클래스이름으로 접근 -> static 메소드 (메모리에 저장하지 않고 사용)
		setSize(300, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new String_7();
		
	}

}
