package Test;

import ac.cr.tec.LinkedList.DoubleList;
import ac.cr.tec.Nodes.DoubleNode;
import ac.cr.tec.SortingAlgorithms.DoubleListBubbleSort;
import ac.cr.tec.SortingAlgorithms.DoubleListInsertionSort;
import ac.cr.tec.SortingAlgorithms.DoubleListSelectionSort;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class DoubleListTest {

    @org.junit.Test
    public void addTail() {
        DoubleList<Integer> List;
        ArrayList<Integer> arrayList;
        int flag=1000;
        while(flag>0){
            arrayList=getArrayListRandom(1000);
            List=new DoubleList<>();
            for(int i=0;i<1000;i++){
                List.AddTail(arrayList.get(i));
            }
            for(int i=0;i<1000;i++){
                Assert.assertEquals(arrayList.get(i).intValue(),List.get(i).intValue());
            }
            flag--;
        }

    }

    @org.junit.Test
    public void addHead() {
        DoubleList<Integer> List;
        ArrayList<Integer> arrayList;
        int flag=1000;
        while(flag>0){
            arrayList=getArrayListRandom(1000);
            List=new DoubleList<>();
            for(int i=0;i<1000;i++){
                List.AddHead(arrayList.get(i));
            }
            for(int i=0;i<1000;i++){
                Assert.assertEquals(arrayList.get(999-i).intValue(),List.get(i).intValue());
            }
            flag--;
        }
    }

    @org.junit.Test
    public void deleteTail() {
        int flag=1000;
        int reference;
        DoubleList<Integer> List;
        ArrayList<Integer> arrayList;
        while(flag>0){
            arrayList=getArrayListRandom(1000);
            List=copyArrayList(arrayList);
            reference=arrayList.size()-1;
            while(reference>=0){
                Assert.assertEquals(arrayList.get(reference).intValue(),List.get(reference).intValue());
                arrayList.remove(reference);
                List.DeleteTail();
                reference--;
            }
            flag--;
        }
    }

    @org.junit.Test
    public void deleteHead() {
        int flag=1000;
        DoubleList<Integer> List;
        ArrayList<Integer> arrayList;
        while(flag>0){
            arrayList=getArrayListRandom(1000);
            List=copyArrayList(arrayList);

            while(arrayList.size()>0){
                Assert.assertEquals(arrayList.get(0).intValue(),List.get(0).intValue());
                arrayList.remove(0);
                List.DeleteHead();
            }
            flag--;
        }

    }

    @org.junit.Test
    public void getNode() {
        ArrayList<DoubleNode<Integer>> arrayList;
        DoubleList<Integer> List;
        Random random=new Random();
        int number;
        int flag=1000;
        while(flag>1000){
            arrayList=new ArrayList<>();
            List=new DoubleList<>();
            for(int i=0;i<1000;i++){
                number=random.nextInt();
                List.AddTail(number);
                arrayList.add(new DoubleNode<>(number));
            }
            for(int i=0;i<1000;i++){
                Assert.assertEquals(List.getNode(i),arrayList.get(i));
            }
            flag--;
        }

    }

    @org.junit.Test
    public void get() {
        int flag=1000;
        ArrayList<Integer> arrayList;
        DoubleList<Integer> List;
        while(flag>0){
            arrayList=getArrayListRandom(1000);
            List=copyArrayList(arrayList);
            for(int i=0;i<1000;i++){
                Assert.assertEquals(arrayList.get(i).intValue(),List.get(i).intValue());
            }
            flag--;

        }
    }

    @org.junit.Test
    public void getLen() {
        Random random=new Random();
        int Flag=1000;
        int number;
        DoubleList<Integer> List;
        while(Flag>0){
            List=new DoubleList<>();
            number=random.nextInt(10000);
            for(int i=0;i<number;i++){
                List.AddTail(233);
            }
            Assert.assertEquals(List.getLen(),number);
            Flag--;
        }
    }

    @org.junit.Test
    public void Sort() {
        ArrayList<Integer> arrayList;
        DoubleList<Integer> List;
        int Flag=1000;
        while(Flag>0){
            Flag--;
            arrayList=getArrayListRandom(1000);
            List=copyArrayList(arrayList);
            arrayList.sort(Comparator.naturalOrder());
            List.setSorting(new DoubleListSelectionSort());
            List.Sort();
            for(int i=0;i<1000;i++){
                Assert.assertEquals(arrayList.get(i).intValue(),List.get(i).intValue());
            }
        }
        Flag=300;
        while(Flag>0){
            Flag--;
            arrayList=getArrayListRandom(300);
            List=copyArrayList(arrayList);
            arrayList.sort(Comparator.naturalOrder());
            List.setSorting(new DoubleListBubbleSort());
            List.Sort();
            for(int i=0;i<300;i++){
                Assert.assertEquals(arrayList.get(i).intValue(),List.get(i).intValue());
            }

        }
        Flag=1000;
        while(Flag>0){
            Flag--;
            arrayList=getArrayListRandom(1000);
            List=copyArrayList(arrayList);
            arrayList.sort(Comparator.naturalOrder());
            List.setSorting(new DoubleListInsertionSort());
            List.Sort();
            for(int i=0;i<1000;i++){
                Assert.assertEquals(arrayList.get(i).intValue(),List.get(i).intValue());
            }
        }
    }

    @org.junit.Test
    public void SetGetSorting() {
        DoubleList<Integer> List=new DoubleList<>();
        DoubleListBubbleSort<Integer> sort=new DoubleListBubbleSort<>();
        List.setSorting(sort);
        Assert.assertEquals(sort,List.getSorting());

    }
    public ArrayList<Integer> getArrayListRandom(int len){
        if(len<=0)return null;
        ArrayList<Integer> saved=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<len;i++){
            saved.add(random.nextInt());
        }
        return saved;
    }
    public DoubleList<Integer> getListTail(int len){
        DoubleList<Integer> saved=new DoubleList<>();
        Random random=new Random();
        for(int i=0;i<len;i++){
            saved.AddTail(random.nextInt());
        }
        return saved;

    }
    public DoubleList<Integer> copyArrayList(ArrayList<Integer> arrayList){
        if(arrayList==null || arrayList.size()<1)return null;
        DoubleList<Integer> temp=new DoubleList<>();
        for(int i=0;i<arrayList.size();i++){
            temp.AddTail(arrayList.get(i));
        }
        return temp;
    }

}