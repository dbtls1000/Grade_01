package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.StudentVO;

public class StudentService {
	List<StudentVO> stdList;
	Scanner scan;
	
	public StudentService() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}
	
	// 키보드에서 학생정보를 입력받아서 stdList에 추가
	public boolean inputStudent(int number) throws NumberFormatException{
		
		System.out.print("학번 (종료:EX) >");
		String strNumber = scan.nextLine();
		if(strNumber.equals("EX")) return false;
		
		System.out.print("이름(영문) >");
		String strName = scan.nextLine();
		
		System.out.print("학년 >");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);
		
		System.out.print("주소(영문) >");
		String strAddr = scan.nextLine();
		
		System.out.print("전화번호 >");
		String strTel= scan.nextLine();
		
		StudentVO vo = new StudentVO();
		vo.setNumber(strNumber);
		vo.setName(strName);
		vo.setGrade(intGrade);
		vo.setAddr(strAddr);
		vo.setTel(strTel);
		
		stdList.add(vo);
		return true;
	}
	
	// stdList에 담긴 학생정보를 콘솔에 보이기
	public void viewStudent() {
		System.out.println("=====================");
		System.out.println("학번\t이름\t학년\t주소\t전화번호");
		System.out.println("---------------------");
		for(StudentVO vo : stdList) {
			System.out.print(vo.getNumber()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getGrade()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getTel()+"\n");
		}
		System.out.println("=====================");
	}
	
}
