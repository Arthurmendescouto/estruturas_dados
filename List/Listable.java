package List;

public interface Listable {
    void insert(int LogicIndex, Object data);
    void append(Object data);
    Object select(int LogicIndex);
    Object[] selectAll();
    void update( int index, Object item);
    Object delete(int LogicalIndex);
    void clear();
    boolean isEmpty();
    boolean isFull();
    String print();
}
