package ProblemsSnippets.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class BinaryTreeSerialization {

    public String serialize(BinaryTreeNode node){
        StringBuilder builder=new StringBuilder();
        serializeHelper(node,builder);

        return builder.toString();
    }

    private void serializeHelper(BinaryTreeNode node , StringBuilder strbuilder){
        if (node==null)
            strbuilder.append("# ");
        else{
            strbuilder.append(node.value);
            strbuilder.append(" ");
            serializeHelper(node.left,strbuilder);
            serializeHelper(node.right, strbuilder);

        }


    }
    public BinaryTreeNode deserialize(String str){
        String[] tokens=str.split(" ");
        if (tokens[0].equals("#"))
            return null;


        return deserializeHelper(Arrays.asList(tokens).iterator());
    }

    private BinaryTreeNode deserializeHelper(Iterator<String> iter) {
         if (!iter.hasNext())
             return null;
         String val = iter.next();
         if (val.equals("#") || val.equals(""))
             return null;

         BinaryTreeNode node=new BinaryTreeNode(Integer.parseInt(val));
         node.left=deserializeHelper(iter);
         node.right=deserializeHelper(iter);

         return node;
    }


}
