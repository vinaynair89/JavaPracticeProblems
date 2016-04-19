package tests;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class FormExp {
	public static void addOperators(int[] nums, int target) {
		HashMap<Integer, Integer> nos = new HashMap<>();
		for (int no : nums) {
		if (nos.containsKey(no))
		nos.put(no, nos.get(no) + 1);
		else
		nos.put(no, 1);
		}
		helper(nos, 0, target, "");
		}
		static String res="";
		public static boolean helper(HashMap<Integer, Integer> rem, int cur, int target, String str) {
		if (rem.size() == 0) {
		if (cur == target) {
		res=str;
		return true;
		} else
		return false;
		}
		HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>(rem);
		Iterator it = rem.entrySet().iterator();
		while (it.hasNext()) {
		Map.Entry pair = (Map.Entry) it.next();
		int no = (int) pair.getKey();
		if (temp.get(no) != 1)
		temp.put(no, temp.get(no) - 1);
		else
		temp.remove(no);

		if (helper(temp, cur + no, target, " ( " + str + " + " + no + " ) "))
		return true;
		if (helper(temp, cur - no, target, " ( " + str + " - " + no + " ) "))
		return true;
		if (cur != 0 && cur%no==0 && helper(temp, cur / no, target, " ( " + str + " / " + no + " ) "))
		return true;
		if (str!="" && helper(temp, cur * no, target, " ( " + str + " * " + no + " ) "))
		return true;

		if (temp.containsKey(no))
		temp.put(no, temp.get(no) + 1);
		else
		temp.put(no, 1);
		}
		return false;
		}

		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			String[] vals = s.nextLine().split(" ");
			if (vals.length > 1) {
			int target = Integer.parseInt(vals[0]);
			int[] nos = new int[vals.length - 1];
			for (int i = 1; i < vals.length; i++) {
				nos[i - 1] = Integer.parseInt(vals[i]);
			}
			
			addOperators(nos, target);
			System.out.println(res==""?"none":res);
			}
		}
		


}
