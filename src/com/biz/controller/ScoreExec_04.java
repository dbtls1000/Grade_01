package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		
		scList.add(new ScoreVO("1",90,80,70));
		scList.add(new ScoreVO("2",100,80,90));
		scList.add(new ScoreVO("3",90,90,60));
		scList.add(new ScoreVO("4",80,80,90));
		scList.add(new ScoreVO("5",70,100,70));
		scList.add(new ScoreVO("6",80,80,90));
		
		int scLen = scList.size();
		for(int i = 0 ; i< scLen ; i++) {
			//scList의 i 위치에 담긴 주소 복사
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
		}
		
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
		
	}

}
