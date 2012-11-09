package ProblemsSnippets.Tree;

import junit.framework.TestCase;

import java.util.ArrayList;

public class TreeBalanceCheckerTest extends TestCase {
    public void testIsTreeBalance() throws Exception {
        assertTrue(TreeBalanceChecker.isTreeBalance((null)));

        TreeNode node = new TreeNode();
        assertTrue(TreeBalanceChecker.isTreeBalance(node));

        node.AddChild(new TreeNode());
        node.AddChild(new TreeNode());

        assertTrue(TreeBalanceChecker.isTreeBalance(node));

        node.Children.get(0).AddChild(new TreeNode());

        assertTrue(TreeBalanceChecker.isTreeBalance(node));

        node.Children.get(0).Children.get(0).AddChild(new TreeNode());

        assertFalse(TreeBalanceChecker.isTreeBalance(node));
    }
}
