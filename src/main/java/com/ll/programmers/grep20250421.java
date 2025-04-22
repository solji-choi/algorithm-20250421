package com.ll.programmers;

import java.util.HashMap;
import java.util.Map;

// 프로그래머스 코딩테스트 연습 > 해시 > 의상 문제
public class grep20250421 {
	class Solution {
		public int solution(String[][] clothes) {
			int answer = 1;
			Map<String, Integer> map = new HashMap<>();

			for(int i = 0; i < clothes.length; i++) {
				if(map.get(clothes[i][1]) == null) {
					map.put(clothes[i][1], 1);
				} else {
					map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
				}
			}

			for(String key : map.keySet()) {
				answer *= map.get(key) + 1;
			}

			return answer - 1;
		}
	}
}