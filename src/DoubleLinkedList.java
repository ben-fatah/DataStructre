public class DoubleLinkedList<T> implements List<T> {
  Node<T> head;
  Node<T> current;

  public DoubleLinkedList() {
    head = current = null;
  }

  @Override
  public void findFirst() {
    current = head;

  }

  @Override
  public void findNext() {
    current = current.next;

  }

  public void findPrevious() {
    current = current.previous;

  }

  @Override
  public T retrieve() {
    return current.data;

  }

  @Override
  public void update(T val) {
    current.data = val;
  }

  @Override
  public void inset(T e) {
Node <T> tmp=new Node<T>(e);
    if (empty()) {
      head = current = tmp;
    } else {
tmp.next=current.next;
tmp.previous=current;
if (current.next!=null){
  current.next.previous=tmp;
    }
    current.next=tmp;
    current=tmp;
    }
  }

  @Override
  public void remove() {
    if (current == head) {
      head = head.next;
    } else {
      current.previous.next = current.next;
      if (current.next != null) {
        current.next.previous = current.previous;
      }
    }
    if (current.next==null){
current=head;
    }
    else{
      current=current.next;
    }
  }

  @Override
  public boolean full() {
    return false;
  }

  @Override
  public boolean empty() {
    return head == null;

  }

  @Override
  public boolean first() {

    return current.previous == null;
  }

  @Override
  public boolean last() {
    return current.next == null;
  }

}
