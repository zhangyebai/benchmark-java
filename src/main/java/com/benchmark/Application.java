package com.benchmark;

import com.benchmark.algorithm.tree.BinaryTree;

public class Application {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(10);
		binaryTree.insert(2);
		binaryTree.insert(31);
		binaryTree.insert(21);
		binaryTree.insert(9);
		binaryTree.insert(20);
		binaryTree.insert(1);
		System.out.println(binaryTree.getSize());
		binaryTree.delete(21);
		System.out.println(binaryTree.getSize());
		System.out.println(binaryTree.mid());

		binaryTree.delete(5);
		System.out.println(binaryTree.getSize());
		System.out.println(binaryTree.mid());

		/**System.out.println(binaryTree.pre());
		System.out.println(binaryTree.mid());
		System.out.println(binaryTree.back());
		System.out.println(binaryTree.getSize());
		System.out.println(binaryTree.find(33));
		System.out.println(binaryTree.find(21));
		binaryTree.delete(7);
		System.out.println(binaryTree.back());*/
	}
}
