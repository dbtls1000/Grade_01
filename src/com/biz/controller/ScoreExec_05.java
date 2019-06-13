
package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_05 {
	public static void main(String[] args) {
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			int intTotal = intKor+intEng+intMath;
			int intAvg = intTotal/3;
			
			scList.add(new ScoreVO(""+(i+1),intKor,intEng,intMath,intTotal,intAvg));
			
		}
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		System.out.println("-----------------------------------------------");
		//석차구하기
		//1.기준값(total)을중심으로 내림차순 정렬 수행
		int scLen = scList.size();
		for(int i = 0 ; i<scLen ; i++) {
			for(int j = i+1 ; j<scLen;j++ ) {
				
				ScoreVO s1 = scList.get(i);
				ScoreVO s2 = scList.get(j);
				if(s1.getTotal() < s2.getTotal()) {
					ScoreVO _score = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, _score);
				}
				
			}
				
		}
		// rank필드ㅔ 값을 순서대로 대입
		for(int i = 0; i< scLen ; i++) {
			scList.get(i).setRank(i+1);
		}
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
	}
}
