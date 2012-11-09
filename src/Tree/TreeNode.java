package ProblemsSnippets.Tree;

import java.util.ArrayList;

public class TreeNode {
    public TreeNode Parent;
    public ArrayList<TreeNode> Children;
    public int Value;

    public void AddChild(TreeNode node){
        if (node == null)
            return;
        node.Parent = this;
        if (this.Children==null){
            this.Children=new ArrayList<TreeNode>();
        }
        this.Children.add(node);
    }

}
