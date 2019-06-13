package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreVO[] scArray = new ScoreVO[5];
		
		scArray[0] = new ScoreVO("1",100,90,80);
		scArray[1] = new ScoreVO("2",90,90,80);
		scArray[2] = new ScoreVO("3",80,70,80);
		scArray[3] = new ScoreVO("4",70,90,90);
		scArray[4] = new ScoreVO("5",70,70,90);
		
		for(int i = 0 ; i < scArray.length ; i++) {
			int intTotal = scArray[i].getKor();
			intTotal += scArray[i].getEng();
			intTotal += scArray[i].getMath();
			
			scArray[i].setTotal(intTotal);
			scArray[i].setAverage(intTotal/3);
		}
		for(ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
	}

}
