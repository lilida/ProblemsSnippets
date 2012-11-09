package ProblemsSnippets.Tree;

import junit.framework.TestCase;

public class BinaryTreeAncestorTest extends TestCase {
    public void testFindFirstCommonAncestor() throws Exception {
        //   Build a Tree
        //       0
        //      / \
        //     1  2
        //    /  / \
        //   3   4  5
        BinaryTreeNode root=new BinaryTreeNode(0);
        root.left=new BinaryTreeNode(1);
        root.right=new BinaryTreeNode(2);
        root.left.left=new BinaryTreeNode(3);
        root.right.left=new BinaryTreeNode(4);
        root.right.right=new BinaryTreeNode(5);

        assertEquals(0,BinaryTreeAncestor.FindFirstCommonAncestor(root.left,root.right,root).value);
        assertEquals(1,BinaryTreeAncestor.FindFirstCommonAncestor(root.left,root.left,root).value);
        assertEquals(1,BinaryTreeAncestor.FindFirstCommonAncestor(root.left,root.left.left,root).value);
        assertEquals(2,BinaryTreeAncestor.FindFirstCommonAncestor(root.right.left,root.right.right,root).value);
        assertEquals(0,BinaryTreeAncestor.FindFirstCommonAncestor(root.left.left,root.right.right,root).value);


        assertEquals(0,BinaryTreeAncestor.FindFirstCommonAncestorRecursion(root.left,root.right,root).value);
        assertEquals(1,BinaryTreeAncestor.FindFirstCommonAncestorRecursion(root.left,root.left,root).value);
        assertEquals(1,BinaryTreeAncestor.FindFirstCommonAncestorRecursion(root.left,root.left.left,root).value);
        assertEquals(2,BinaryTreeAncestor.FindFirstCommonAncestor(root.right.left,root.right.right,root).value);
        assertEquals(0,BinaryTreeAncestor.FindFirstCommonAncestorRecursion(root.left.left,root.right.right,root).value);


    }
}
