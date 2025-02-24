
public class Node <T>{
  //we added previous Node for double linked List class 
	public T data;
	public Node<T> next;
  public Node<T> previous;
public Node () {
	data=null;
	next=null;
  previous=null;
}
public Node<T> getPrevious() {
  return previous;
}
public void setPrevious(Node<T> previous) {
  this.previous = previous;
}
public Node (T val ) {
	data=val;
	next=null;
  previous=null;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public Node<T> getNext() {
	return next;
}
public void setNext(Node<T> next) {
	this.next = next;
}

}
