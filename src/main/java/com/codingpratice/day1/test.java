package com.codingpratice.day1;

public class test {
		 public static void main(String[] args) {
		        String my_string = "abc";  // 예시로 문자열을 추가
		        String answer = "";
		        int n = 3;

		        for (int i = 0; i < my_string.length(); i++) {
		            for (int j = 0; j < n; j++) {
		                answer += my_string.charAt(i);
		            }
		        }

		        System.out.println(answer); // 결과 출력
		    }
		}