package com.greatlearning.lab3part2.implementation;

import java.util.HashSet;

import com.greatlearning.lab3part2.main.TreeNode;

public class BSTPairSum {
	public static boolean findPairWithSum(TreeNode root, int targetSum, HashSet<Integer> set) {
		if (root == null) {
			return false;
		}

		int totalsum = targetSum - root.val;
		if (set.contains(totalsum)) {
			System.out.println("Pair is (" + root.val + ", " + totalsum + ")");
			return true;
		}

		set.add(root.val);

		// Search in both left and right subtrees
		boolean foundLeft = findPairWithSum(root.left, targetSum, set);
		boolean foundRight = findPairWithSum(root.right, targetSum, set);

		return foundLeft || foundRight;
	}

	public static boolean hasPairWithSum(TreeNode root, int targetSum) {
		HashSet<Integer> set = new HashSet<>();
		return findPairWithSum(root, targetSum, set);
	}

}
