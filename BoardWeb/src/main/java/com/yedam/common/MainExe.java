package com.yedam.common;

import com.yedam.member.service.MemberService;
import com.yedam.member.serviceImpl.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;

public class MainExe {
	public static void main(String[] args) {
		MemberService svc = new MemberServiceImpl();
		MemberVO vo = svc.login("user2", "2222");

		if (vo != null) {
			System.out.println(vo);
			System.out.println("환영합니다!" + vo.getName() + "님. 권한은 " + vo.getResponsibility());
		} else {
			System.out.println("id,pw 확인");
		}
	}
}
