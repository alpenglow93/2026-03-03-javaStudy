package com.sist.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP

@Getter
@Setter
//@NoArgsConstructor	// 매개변수 없는 생성자 생성
//@AllArgsConstructor	// 모든 매개변수를 가지는 생성자 생성
//@Data					// 오버라이딩
//@ToString				// toString 재정의 목적
//@EqualsAndHashCode		// equals와 hashcode 재정의 목적

public class CustomerVO {
	
	private String customer_id;
	private String login_id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;

}
