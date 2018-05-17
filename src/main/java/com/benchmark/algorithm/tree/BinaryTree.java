package com.benchmark.algorithm.tree;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class BinaryTree {

	private Node root;
	private int size = 0;

	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter
	@Accessors(chain = true)
	@ToString
	public static final class Node{
		private Node left;
		private Node right;
		private int data;
	}

	public void insert(int value){
		Node node = new Node().setData(value);
		if(null == root){
			this.root = node;
			size ++;
			return;
		}
		Node index = this.root;
		for(;;){
			Node parent = index;
			///  turn left
			if(parent.getData() > value){
				index = parent.getLeft();
				if (null == index){
					parent.left = new Node().setData(value);
					size++;
					break;
				}
			}
			/// turn left
			else if (parent.getData() < value){
				index = parent.getRight();
				if(null == index){
					parent.setRight(new Node().setData(value));
					size ++;
					break;
				}
			}else{
				return;
			}
		}

	}
}
