package master;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的所有路径 {

	public static void main(String[] args) {
		binaryTreePaths(new TreeNode(2));

	}
	public static List<String> binaryTreePaths(TreeNode tree) {
		List<String> result = new ArrayList<>();
		String str = "";
		iterator(tree, result, str);
		return result;
	}
	public static void iterator(TreeNode teNode,List<String> result,String str) {
		if ( teNode == null )
			return;
		str+=(teNode.val+"->");
		if( teNode.left == null && teNode.right == null ) {
			int length = str.length();
			result.add(str.substring(0, length-2));
		}
		if( teNode.left != null )
			iterator(teNode.left, result, str);
		if( teNode.right != null )
			iterator(teNode.right, result, str);
	}
}
