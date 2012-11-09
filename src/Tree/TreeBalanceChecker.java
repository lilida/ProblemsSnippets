package ProblemsSnippets.Tree;

public class TreeBalanceChecker {

    public static boolean  isTreeBalance(TreeNode node){
        if (node==null)
            return true;
        int[] maxMinValues=GetMaxMinHeight(node);
        return  Math.abs(maxMinValues[0]-maxMinValues[1])<2;
    }

    private static int[] GetMaxMinHeight(TreeNode node){
        int[] retVals=new int[2];
        if (node.Children == null || node.Children.size()==0){
            retVals[0] = retVals[1]=0;
        }
        else{
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(TreeNode child:node.Children){
                int[] values=GetMaxMinHeight(child);
                max = max>values[0] ? max : values[0];
                min = min<values[1] ? min : values[1];
            }

            retVals[0]=max+1;
            retVals[1]=min+1;
        }

        return retVals;

    }
}
