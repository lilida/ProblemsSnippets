package ProblemsSnippets.Tree;

import junit.framework.TestCase;

public class BinaryTreeSerializationTest extends TestCase {
    public void testSerialize() throws Exception {

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

        BinaryTreeSerialization solution =new BinaryTreeSerialization();
        String s= solution.serialize(root);
        BinaryTreeNode deserializeData=solution.deserialize(s);

        assertEquals(0,deserializeData.value);
        assertEquals(1,deserializeData.left.value);
        assertEquals(3,deserializeData.left.left.value);
        assertEquals(2,deserializeData.right.value);
        assertEquals(4,deserializeData.right.left.value);
        assertEquals(5,deserializeData.right.right.value);
    }
}
