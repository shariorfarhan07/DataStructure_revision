package linkedlist;

public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node n=head;
    
    for(int i =1;i<a.length;i++){
     n.next=new Node(a[i],null);
     n=n.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    for(Node i=head;i!=null;i=i.next){
    count++;
    }
    return count; 
  }
  
  /* prints the elements in the list */
  public void printList(){
 
    for(Node i=head;i!=null;i=i.next){
   System.out.print(i.element+", ");
    }
   System.out.println();  
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    if(countNode()<idx){
      System.out.println("Wrong index");
      return null;
    }
    Node n=head;
    for(int i=0;i<idx;i++)
      n=n.next;
    return n; 
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
   
    return nodeAt( idx).element; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
   if(countNode()<=idx) return null;
    Object old =get( idx);
   // System.out.println(old+" by farhan");
    nodeAt( idx).element=elem;
    return old; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    Node n=head;
    int count =0;
    while(n!=null){
      if((n.element).equals(elem)){ return count;}
      count++;
      n=n.next;
    }
    return -1;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    Node n=head;
    while(n!=null){
      if(n.element.equals(elem)){
      return true ;
      }
      n=n.next;
    }
    return false; 
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node n=this.head;
    Node head=new Node(n.element,null);
    Node newN=head;
    for(Node i=n.next;i!=null;i=i.next){
    newN.next=new Node(i.element,null);
    newN=newN.next;
    }
    return head; 
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
   int i = countNode()-1;
   Node h=new Node(get(i),null);
   Node n=h;
   for(int ii=i-1;ii>=0;ii--){
   n.next=new Node(get(ii),null);
   n=n.next;
   }
    return h; 
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if(idx>countNode()){
    System.out.println("Wrong index");
    }
    else if(idx==0){
      Node n=new Node(elem,head);
      head=n;
    }else{
     Node n=nodeAt(idx-1);
     Node n1=nodeAt(idx);
     n.next=new Node(elem,n1);
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    Object a=null;
    if(countNode()<index){
    System.out.println("Wrong index");
    }else{
    a=get(index);
    if(index==0){
    head=nodeAt(1);
    }else{
     nodeAt(index-1).next =nodeAt(index).next;
    }
    } 
    return a ;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
   Node n=head;
   head=nodeAt(1);
   n.next=null;
   nodeAt(countNode()-1).next=n;
    
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
   Node n=  nodeAt(countNode()-1);
   nodeAt(countNode()-2).next=null;
   n.next= nodeAt(0);
   head=n;
  }
  
}