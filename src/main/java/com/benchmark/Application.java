package com.benchmark;

import com.benchmark.algorithm.tree.BinaryTree;

public class Application {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(10);
		binaryTree.insert(2);
		binaryTree.insert(1);
		binaryTree.insert(21);
		binaryTree.insert(9);
		System.out.println(binaryTree.pre());
		System.out.println(binaryTree.mid());
		System.out.println(binaryTree.back());
	}
}
