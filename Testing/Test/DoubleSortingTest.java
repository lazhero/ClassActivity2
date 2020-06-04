package Test;

import ac.cr.tec.LinkedList.DoubleList;
import ac.cr.tec.SortingAlgorithms.DoubleListBubbleSort;
import ac.cr.tec.SortingAlgorithms.DoubleListInsertionSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleSortingTest {

    @Test
    public void setList() {
        //Unicamente demostrativo
        new DoubleListInsertionSort<>().setList(new DoubleList<>());
        assertEquals(1,1);
    }

    @Test
    public void swap() {
        DoubleList<Integer> List=new DoubleList<>();
        List.AddTail(10);
        List.AddTail(25);
        DoubleListBubbleSort<Integer> sort=new DoubleListBubbleSort<>();
        List.setSorting(sort);
        sort.swap(List.getNode(0),List.getNode(1));
        assertEquals(25,List.get(0).intValue());
    }
}