package com.biz.controller;

import com.biz.service.ScoreService_01;
import com.biz.service.ScoreService_02;

public class ScoreExec_10 {
	public static void main(String[] args) {
		
		ScoreService_02 ss = new ScoreService_02();
		
		for (int i = 0 ; i <100 ; i++) {
			if(!ss.inputScore(i));
		}
		
		ss.calcTotal();
		ss.processRank();
		ss.viewScore();
		
		
		
		
		
		
		
	}
}
