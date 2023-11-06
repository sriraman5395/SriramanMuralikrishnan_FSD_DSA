package com.greatlearning.lab3part2.main;

import com.greatlearning.lab3part2.implementation.BSTPairSum;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(70);

		int targetSum = 130;
		System.out.println("Sum = " + targetSum);
		boolean result = BSTPairSum.hasPairWithSum(root, targetSum);
		if (!result) {
			System.out.println("nodes are not found");
		}
	}
}