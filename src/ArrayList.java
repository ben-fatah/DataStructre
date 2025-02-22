
public class ArrayList<T> implements List<T> {
  private T[] nodes;
  private int current;
  private int size;
  private int maxSize;

  @SuppressWarnings("unchecked")
  public ArrayList(int n) {
    maxSize = n;
    nodes = (T[]) new Object[n];
    current = -1;
    this.size = size;
  }

  public void findFirst() {
    current = 0;
  }

  public void findNext() {
    current++;
  }

  public T retrieve() {
    // requires: list L is not empty. input: none
    // results: current element is copied into e. output: element e
    return nodes[current];
  }

  public void update(T val) {
    nodes[current] = val;
  }

  public void inset(T e) {
    // equires: list L is not full. input: e.
    // results: a new node containing element e is created and inserted after the
    // current
    // element in the list. The new element e is made the current element. If the
    // list is
    // empty e is also made the head element. output: none.

    for (int i = size - 1; i > (current); i--) {
      nodes[i + 1] = nodes[i];
    }
    current++;
    nodes[current] = e;
    size++;
  }

  public void remove() {
    // requires: list L is not empty. input: none
    // results: the current element is removed from the list.
    // If the resulting list is empty current is set to NULL.
    // If successor of the deleted element exists it is made the new current
    // element otherwise first element is made the new current element. output:
    // none.
    for (int i = current + 1; i < size; i++) {
      nodes[i - 1] = nodes[i];
    }
    size--;
    if (size == 0) {
      current = -1;
    } else if (current == size) {
      current = 0;
    }
  }

  public boolean full() {
    return maxSize == size;
  }

  public boolean empty() {
    return size == 0;
  }

  public boolean first() {
    return current == 0;
  }

  public boolean last() {
    return current == size - 1;
  }

}
