package ac.cr.tec.LinkedList;

import ac.cr.tec.Nodes.DoubleNode;
import ac.cr.tec.SortingAlgorithms.DoubleSorting;

public class DoubleList<T extends Comparable> implements List<T> {
    private DoubleNode<T> Head;
    private DoubleNode<T> Tail;
   private DoubleSorting sorting;
    private int len;
    public DoubleList(){
        this.len=0;
        this.Head=null;
        this.Tail=null;
        this.sorting=null;
    }
    public void AddTail( T info){
        if(info!=null) {
            DoubleNode<T> temp=new DoubleNode<>(info);
            if(Tail==null)Head=Tail=temp;
            else{
                Tail.setFront(temp);
                temp.setBack(Tail);
            }
            Tail=temp;
            len++;
        }
    }
    public void AddHead(T info){
        if(info!=null){
            DoubleNode<T> temp=new DoubleNode<>(info);
            if(Head==null)Tail=Head=temp;
            else{
                temp.setFront(Head);
                Head.setBack(temp);
            }
            Head=temp;
            len++;
        }
    }
    public T DeleteTail(){
        if(Tail==null)return null;
        T temp=Tail.getStorage();
        if(Tail==Head)Head=Tail=null;
        else{
            Tail=Tail.getBack();
            Tail.setFront(null);
        }
        len--;
       return temp;
    }
    public T DeleteHead(){
        if(Head==null)return null;
        T temp= Head.getStorage();
        if(Tail==Head)Tail=Head=null;
        else{
            Head=Head.getFront();
            Head.setBack(null);
        }
        len--;
        return temp;
    }
    public DoubleNode<T> getNode(int pos){
        if(Head==null || pos>=len)return null;
        DoubleNode<T> temp=Head;
        for(int i=0;i<pos;i++){
            temp=temp.getFront();
        }
        return temp;

    }
    public T get(int pos){
        if(len>0)return getNode(pos).getStorage();
        return null;
    }

    public int getLen() {
        return len;
    }


    public void Sort(){
        if(sorting!=null){
            sorting.Sort();
        }
    }
    public void setSorting(DoubleSorting sorting){
        if(sorting==null)return;
        this.sorting=sorting;
        sorting.setList(this);
    }
    public DoubleSorting getSorting(){
        return sorting;
    }

}
