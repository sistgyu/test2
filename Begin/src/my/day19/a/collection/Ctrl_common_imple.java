package my.day19.a.collection;

import java.util.Scanner;

public class Ctrl_common_imple implements Ctrl_common {

	// == 시작화면(메인 메뉴)를 보여주는 메소드 생성하기 == //
	@Override
	public void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
                + "1.구직자 회원가입   2.구인회사 회원가입   3.구직자 로그인   4.구인회사 로그인\n"
                + "5.프로그램 종료\n");  
		System.out.print("▷ 메뉴 번호 선택 : ");
	}// end of main_menu()---------------------
}
