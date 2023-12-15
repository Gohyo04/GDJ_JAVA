package com.gohyo.study4.util.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	// 로또 번호 생성
	// 1 ~ 45, 6개
	Random random = new Random();
	
	public int[] ex0() {
		int cnt = 1;
		int[] arr = new int[6];
		arr[0] = random.nextInt(45)+1;
		while(cnt < 6){
			int n = random.nextInt(45)+1;
			for(int i=0;i<arr.length;i++){
				if(arr[i] != n) {
					arr[cnt] = n;
				}
			}
			cnt++;
		}
		return arr;
	}
	
	public ArrayList<Integer> ex1() {
		// ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;arr.size()<6;i++) {
			int n = random.nextInt(45)+1;
			if(!arr.contains(n)){
				arr.add(n);
			}			
		}
		Collections.sort(arr);
		return arr;
	}
	
	public HashSet<Integer> ex2() {
		// HashSet
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;hs.size()<6;i++) {
			int n = random.nextInt(45)+1;
			hs.add(n);
		}
		return hs;
	}
}

