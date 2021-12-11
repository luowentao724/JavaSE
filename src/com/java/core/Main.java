package com.java.core;

public class Main {

    public static void main(String[] args) {
	   Main m = new Main();
       m.changeParam();
       m.changeParam(2,2,3);
    }

    public void changeParam(int ...nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

}
