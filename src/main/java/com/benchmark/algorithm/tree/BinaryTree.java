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

	public String pre(){
		if(null == this.root){
			return null;
		}
		StringBuilder stringBuilder = new StringBuilder("[ ").append(this.root.getData());
		this.preErgodic(stringBuilder, this.root.left);
		this.preErgodic(stringBuilder, this.root.right);
		stringBuilder.append(" ]");
		return stringBuilder.toString();
	}

	private void preErgodic(StringBuilder stringBuilder, Node node){
		if(null == node){
			return;
		}
		stringBuilder.append(" ").append(node.getData());
		this.preErgodic(stringBuilder, node.getLeft());
		this.preErgodic(stringBuilder, node.getRight());
	}


	public String mid(){
		if(null == this.root){
			return null;
		}

		StringBuilder stringBuilder = new StringBuilder("[");
		this.midErgodic(stringBuilder, this.root.getLeft());
		stringBuilder.append(" ").append(this.root.getData());
		this.midErgodic(stringBuilder, this.root.getRight());
		stringBuilder.append(" ]");
		return stringBuilder.toString();
	}

	private void midErgodic(StringBuilder stringBuilder, Node node){
		if(null == node){
			return;
		}
		midErgodic(stringBuilder, node.getLeft());
		stringBuilder.append(" ").append(node.getData());
		midErgodic(stringBuilder, node.getRight());
	}

	public String back(){
		if(null == this.root){
			return null;
		}

		StringBuilder stringBuilder = new StringBuilder("[");
		this.backErgodic(stringBuilder, this.root.getLeft());
		this.backErgodic(stringBuilder, this.root.getRight());
		stringBuilder.append(" ").append(this.root.getData()).append(" ]");
		return stringBuilder.toString();
	}

	private void backErgodic(StringBuilder stringBuilder, Node node){
		if(null == node){
			return;
		}

		backErgodic(stringBuilder, node.getLeft());
		backErgodic(stringBuilder, node.getRight());
		stringBuilder.append(" ").append(node.getData());
	}
}
