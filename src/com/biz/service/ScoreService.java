package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public interface ScoreService  {
	
	
	public boolean inputScore(int number) throws NumberFormatException;
		
	
	public void makeTotal();
	
	public void makeRank();
	
	
	public void viewScore(); 
	
	
	
	
}
