//package com.practiseDay1;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Scanner;
//
//public class PracticeTest {
//
//	public static int calcMin(int K, int N, List<Integer> Qp, List<Integer> S, List<Integer> P) {
//
//		int result[] = new int[K];
//
//		for (int i = 0; i < K; i++) {
//			int powerRequired = Qp.get(i);
//			System.out.println("powerRequired is " + powerRequired);
//			Map<Integer, Integer> subPowers = new HashMap<Integer, Integer>(K);
//			int subCum = 0;
//			boolean powerSatisfied = false;
//			for (int j = 0; j < N; j++) {
//				if (S.get(j) == i + 1) {
//					int power = P.get(j);
//					subPowers.put(j, power);
//				}
//			}
////			System.out.println("powers array before sorting ");
////			for (int res : subPowers) {
////				System.out.println(res);
////			}
////			Collections.sort(subPowers);
////			Collections.reverse(subPowers);
////			System.out.println("powers array is ");
////			for (int res : subPowers) {
////				System.out.println(res);
////			}
//			List<Entry<Integer, Integer>> list = new ArrayList<>(subPowers.entrySet());
//			list.sort(Entry.comparingByValue(Comparator.reverseOrder()1q	));
//			for (int j = 0; j < subPowers.size(); j++) {
//				subCum = subCum + subPowers.get(j);
//				if (powerRequired <= subCum) {
//					powerSatisfied = true;
//					int temp = result[i] = result[i] + 1;
//					break;
//				}
//			}
//			if (!powerSatisfied) {
//				result[i] = -1;
//				break;
//			}
//
//		}
//		System.out.println("result array is ");
//		for (int res : result) {
//			System.out.println(res);
//		}
//
//		int output = 0;
//		for (int k = 0; k < K; k++) {
//			if (result[k] == -1) {
//				output = -1;
//				break;
//			} else {
//				output = output + result[k];
//			}
//		}
//
//		return output;
//
//	}
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int K = Integer.parseInt(scan.nextLine().trim());
//		int N = Integer.parseInt(scan.nextLine().trim());
//		List<Integer> qp = new ArrayList<>(K);
//		for (int j = 0; j < K; j++) {
//			qp.add(Integer.parseInt(scan.nextLine().trim()));
//		}
//		List<Integer> S = new ArrayList<>(N);
//		for (int j = 0; j < N; j++) {
//			S.add(Integer.parseInt(scan.nextLine().trim()));
//		}
//		List<Integer> P = new ArrayList<>(N);
//		for (int j = 0; j < N; j++) {
//			P.add(Integer.parseInt(scan.nextLine().trim()));
//		}
//
//		int result = PracticeTest.calcMin(K, N, qp, S, P);
//		System.out.println("result is " + result);
//
//	}
//}
