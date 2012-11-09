package ProblemsSnippets.Sorting;

import junit.framework.TestCase;

import java.util.ArrayList;

public class BuildingTowerTest extends TestCase {

    BuildingTower bt=new BuildingTower();

    public void testFindMaxNumberBuildTower()  throws Exception {
        ArrayList<BuildingTower.Person> testCases=new ArrayList<BuildingTower.Person>();
        testCases.add(bt.new Person(1,100));
        assertEquals(bt.findMaxNumberBuilderTower(testCases),1);

        testCases.add(bt.new Person(10,110));

        assertEquals(bt.findMaxNumberBuilderTower(testCases),2);
        testCases.add(bt.new Person(2,90));

        assertEquals(bt.findMaxNumberBuilderTower(testCases),2);

        testCases.add(bt.new Person(3,91));

        assertEquals(bt.findMaxNumberBuilderTower(testCases),3);


    }

}
