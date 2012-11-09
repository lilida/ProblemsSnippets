package ProblemsSnippets.Tree;

import java.util.ArrayList;
import java.util.Stack;

public final class BinaryTreeAncestor {
    public static BinaryTreeNode FindFirstCommonAncestor(BinaryTreeNode first, BinaryTreeNode second, BinaryTreeNode root){
        assert(first!=null&&second!=null&&root!=null);
        if (first == second)
            return first;
        ArrayList<BinaryTreeNode> path=new ArrayList<BinaryTreeNode>();
        Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
        s.push(root);
        int foundNode = 0;
        while (!s.isEmpty()){
            BinaryTreeNode n=s.pop();
            path.add(n);
            if (n==first) 
                foundNode =1;
            else if (n== second) 
                foundNode =2;
            if (foundNode>0)
                break;
            
            if(n.right !=null)
                s.push(n.right);

            if (n.left !=null)
                s.push(n.left);
            
        }

        if (foundNode == 0)
            throw new RuntimeException("First and second are not in the tree");
        BinaryTreeNode target = foundNode ==1? second : first;
        for (int index=path.size()-1;index>=0;index--){
            BinaryTreeNode sRoot=path.get(index);
            if (index+1<=path.size()-1){
                if (path.get(index).left ==path.get(index+1))
                    sRoot=path.get(index).right;
                else
                    sRoot=path.get(index).left;
            }
            if (findTarget(sRoot,target))
                return path.get(index);


        }
        String node = foundNode==1 ? "Second" :"First";
        throw new RuntimeException(node +" node is not in the tree");
    }

    public static boolean findTarget(BinaryTreeNode n, BinaryTreeNode t){
        if (n==null)
            return false;
        if (n==t)
            return true;
        else
            return findTarget(n.left,t)||findTarget(n.right,t);
    }


    public static BinaryTreeNode FindFirstCommonAncestorRecursion(BinaryTreeNode first,
                                                                 BinaryTreeNode second,
                                                                 BinaryTreeNode root){

        if (root == null)
             return null;
        if (root == first || root ==second)
            return root;

        BinaryTreeNode leftnode=FindFirstCommonAncestorRecursion(first,second,root.left);
        BinaryTreeNode rightnode =FindFirstCommonAncestorRecursion(first,second,root.right);

        if (leftnode!=null && rightnode !=null)
                return root;

        return leftnode!=null ? leftnode : rightnode;

    }

    }
