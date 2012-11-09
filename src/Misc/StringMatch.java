package ProblemsSnippets.Misc;

/**
 *  Given a string and a pattern('.' Matches any single character.'*' Matches zero or more of the preceding element.),
 *  find the first substring matching this pattern.
 */
public class StringMatch {


   public static String matchString(String s, String p)   {
       int[] matchPos = match(s,0,p,0);
       if (matchPos == null)
           return null;
       else
           return s.substring(matchPos[0],matchPos[1]);

   }
    public static int[] match(String s,int startIndex, String p, int pStartIndex){
        if (s == null || p== null)
            return null;

        int start=startIndex;
        int pIndex=pStartIndex;
        int[] pos=new int[2];
        while (start <s.length()){
            int currentStart =start;
            while (pIndex<p.length() && currentStart <s.length()){
                char chs=s.charAt(currentStart);
                char chp=p.charAt(pIndex);

                if (chp == '*'){
                    if (pIndex==p.length()-1){
                        pos[0]=start;
                        pos[1]=s.length();
                        return pos;
                    }
                    else{
                        int[] subResult= match(s,currentStart,p,pIndex+1);
                        if (subResult!=null){
                            pos[0]=start;
                            pos[1]=subResult[1];
                            return pos;
                        }
                        else
                          return null;


                    }


                }
                else if (chs==chp || chp=='.'){
                    currentStart++;
                    pIndex++;
                }
                else{
                    pIndex =pStartIndex;
                    break;
                }
            }

            if (pIndex==p.length() && pIndex!=0) {
               pos[0]=start;
                pos[1]=currentStart;
                return pos;
            }

            start++;
        }

        return null;
    }
}
