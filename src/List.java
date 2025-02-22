
public interface List <T>{
	abstract public void  findFirst() ;
//	requires: list L is not empty.  input: none
//	results: first element set as the current element. output: none.

	abstract public void findNext() ;
//	requires: list L is not empty. Cur is not last.  input: none
//	results: element following the current element is made the current element.

	abstract public T retrieve ();
//	requires: list L is not empty. input: none
//	results: current element is copied into e. output: element e

	abstract public void update(T val) ;
//	requires: list L is not empty. input:  e.
//	results: the element e is copied into the current node.

	abstract public void inset(T e) ;
	
//	equires: list L is not full. input: e.
//	results: a new node containing element e is created and inserted after the current 
//	element in the list. The new element e is made the current element. If the list is 
//	empty e is also made the head element. output: none.

	abstract public void remove() ;
//	requires: list L is not empty. input: none
//	results: the current element is removed from the list. 
//	If the resulting list is empty current is set to NULL. 
//	If successor of the deleted element exists it is made the new current 
//	element otherwise first element is made the new current element. output: none.

	abstract public boolean full() ;
//	input: none. returns: if the number of elements in L has reached 
//	the maximum number allowed then flag is set to true otherwise false. output: flag.

	abstract public boolean empty () ;
//	Method empty (boolean flag).
//	input: none. results: if the number of elements in L is zero, then flag 
//	is set to true otherwise false. Output: flag.

	abstract public boolean first() ;
//	Method first (boolean flag).
//	input: none. requires: L is not empty. Results: if the first element is 
//	the current element then flag is set to true otherwise false. Output: flag

	abstract public boolean last() ;
//	Method last (boolean flag).
//	input: none. requires: L is not empty. Results: if the last element is the current
//	element then flag is set to true otherwise false. Output: flag

}
