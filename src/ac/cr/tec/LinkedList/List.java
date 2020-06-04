package ac.cr.tec.LinkedList;

public interface List<T extends Comparable> {
    public void AddTail( T info);
    public void AddHead(T info);
    public T DeleteTail();
    public T DeleteHead();
    public int getLen();
}
