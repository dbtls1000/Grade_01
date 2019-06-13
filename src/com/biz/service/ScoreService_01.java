package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreService_01 {
	
	private List<ScoreVO> scoreList;
	private Scanner scan;
	public ScoreService_01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	/*
	 * throws
	 * 혹시 method가 실행되는 과정에서
	 * Exception이 발생할 확률이 단 1%라도 존재하면
	 * 발생된 Exception을 throw 하여
	 * 호출한 곳에서 Exception을 처리하도록 하는 키워드
	 */
	public boolean inputScore(int number) throws NumberFormatException {
		
		number++;
		System.out.print(number + "번 학생 국어점수(종료:EX) >");
		String strKor = scan.nextLine();
		if(strKor.equals("EX")) return false;
		int intKor = Integer.valueOf(strKor);
		System.out.print(number + "번 학생 영어점수 >");
		String strEng = scan.nextLine();
		int intEng = Integer.valueOf(strEng);
		System.out.print(number + "번 학생 수학점수 >");
		String strMath = scan.nextLine();
		int intMath = Integer.valueOf(strMath);
		
		ScoreVO vo = new ScoreVO(""+number,intKor,intEng,intMath);
		scoreList.add(vo);
		System.out.println(vo.toString());
		return true;
	}
	
	public void makeTotal() {
		int listLen = scoreList.size();
		for(int i = 0 ; i < listLen ; i++) {
			ScoreVO vo = scoreList.get(i);
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
	}
	
	public void makeRank() {
		int listLen = scoreList.size();
		for(int i = 0 ; i < listLen ; i++) {
			for(int j = i + 1; j < listLen ; j++) {
				ScoreVO vo = scoreList.get(i);
				ScoreVO s1 = scoreList.get(i);
				ScoreVO s2 = scoreList.get(j);
				if( s1.getTotal() < s2.getTotal()) {
					ScoreVO _score = s1;
					scoreList.set(i, s1);
					scoreList.set(j, _score);
				}
			}
		}
		for(int i = 0 ; i <listLen ; i++) {
			scoreList.get(i).setRank(i+1);
		}
	}
	
	
	public void viewScore() {
		System.out.println("빅데이터반 성적표");
		System.out.println("==================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("----------------------------------");
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getNumber()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getTotal()+"\t");
			System.out.print(vo.getAverage()+"\t");
			System.out.print(vo.getRank()+"\n");
			
		}
		System.out.println("==================================");
		
		
	}
	
	
	
	
}
