package com.gohyo.study3.members;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
//		member.age = 20;
		member.setName("winter");
		
		System.out.println(member.getName());
		
		member.setWeight(33.3);
		System.out.println(member.getWeight());
	}
}
