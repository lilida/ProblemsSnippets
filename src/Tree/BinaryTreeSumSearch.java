package ProblemsSnippets.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreeSumSearch {

    public static ArrayList<LinkedList<BinaryTreeNode>> getPath(BinaryTreeNode node,int sum){
        ArrayList<LinkedList<BinaryTreeNode>> list=new ArrayList<LinkedList<BinaryTreeNode>>();
        if (node == null)
            return list;

        if (node.value==sum){
            LinkedList<BinaryTreeNode> nodeList=new LinkedList<BinaryTreeNode>();
            nodeList.add(node);
            list.add(nodeList);
        }

        for(LinkedList<BinaryTreeNode> path : BinaryTreeSumSearch.getPath(node.left,sum)){
            list.add(path);
        }

        for(LinkedList<BinaryTreeNode> path : BinaryTreeSumSearch.getPath(node.right,sum)){
            list.add(path);
        }

        for(LinkedList<BinaryTreeNode> path : BinaryTreeSumSearch.getPath(node.left,sum-node.value)){
            if (path.get(0)==node.left){
                path.add(0,node);
                list.add(path);

            }

        }

        for(LinkedList<BinaryTreeNode> path : BinaryTreeSumSearch.getPath(node.right,sum-node.value)){
            if (path.get(0)==node.right){
                path.add(0,node);
                list.add(path);
            }

        }

        return list;

    }
}
