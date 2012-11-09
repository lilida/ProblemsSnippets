package ProblemsSnippets.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BuildingTower {

    public class Person
    {
        int Height;
        int Weight;

        public Person(int h,int w){
            Height=h;
            Weight=w;
        }
    }



    public class HeightComparor implements Comparator<Person>{
        public int compare(Person p1, Person p2){
            if (p1.Height<p2.Height){
                return -1;
            }
            else if (p1.Height > p2.Height){
                return 1;
            }
            else{
                return p1.Weight < p2.Weight ? -1 : 1;
            }
        }
    }
    public  int findMaxNumberBuilderTower(ArrayList<Person> people){

        assert (people!=null);
        Collections.sort(people,new HeightComparor());
        int seqLength =0;
        int currentSeq = 0;
        int seqValue=-1;

        for (int i=0;i<people.size();i++){
            if (people.get(i).Weight>=seqValue){
                seqLength = Math.max(seqLength,currentSeq)+1;
                seqValue=people.get(i).Weight;
            }
            else{
                if (currentSeq>0){
                    currentSeq=people.get(i-1).Weight< people.get(i).Weight ? currentSeq+1:1;
                }
                else
                    currentSeq=1;
            }
        }
        return Math.max(seqLength,currentSeq);

    }
}
