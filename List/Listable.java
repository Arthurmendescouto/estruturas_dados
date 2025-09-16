package List;

public interface Listable {
    void insert(Object data,int LogicIndex);
    void append(Object data);
    Object select(int LogicIndex);
    Object[] selectAll();
    void update(Object data, int LogicalIndex);
    Object delete(int LogicalIndex);
    void clear();
    boolean isEmpty();
    boolean isFull();
    String print();
}
