package com.benchmark;

import com.benchmark.algorithm.tree.BinaryTree;

public class Application {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(10);
		binaryTree.insert(2);
		binaryTree.insert(1);
		binaryTree.insert(2);
		System.out.println(binaryTree.getSize());
	}
}
