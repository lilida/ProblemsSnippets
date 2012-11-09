package ProblemsSnippets.Tree;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreeSumSearchTest extends TestCase {

    public void testGetPath(){
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

        ArrayList<LinkedList<BinaryTreeNode>> paths=BinaryTreeSumSearch.getPath(root, 0);
        assertEquals(paths.size(),1);

        paths=BinaryTreeSumSearch.getPath(root, 2);
        assertEquals(paths.size(),2);

        paths=BinaryTreeSumSearch.getPath(root, 4);
        assertEquals(paths.size(),3);

    }
}
