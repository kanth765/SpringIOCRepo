package com.ciq.dao;

public class VarImpl implements varArgsDemo {

	public int add(int[] a) {
		int sum = 0;
		for (int arr : a) {
			sum = sum + arr;
		}
		return sum;
	}

	public static void main(String[] args) {
		VarImpl impl = new VarImpl();
		int[] arr = { 10, 20 };
		int[] arr2 = { 10, 20, 30 };
		int[] arr3 = { 10, 20, 30, 40 };
		int res = impl.add(arr);
		System.out.println(res);
		int res2=impl.add(arr2);
		System.out.println(res2);
		int res3= impl.add(arr3);
		System.out.println(res3);
	}

}
