class SLL<T>
{
    class SLLNode
    {
        T value;
        SLLNode next;
        
        SLLNode(T value)
        {
            this.value = value;
            this.next = null;
        }
    }
    SLLNode head;
    SLLNode tail;
    int length;
    void add(T data)
    {
        if(head == null)
        {
            SLLNode N1 = new SLLNode(data);
            head = N1;
            N1.next = null;
            length++;
            return;
        }
        
        SLLNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        SLLNode N1 = new SLLNode(data);
        current.next = N1;
        length++;

    }
    void printList()
    {
        SLLNode current = head;
        if(head == null)
        {
        System.out.println("The list is empty");
        
         return;
        }

        while(current != null)
        {
            System.out.println(current.value);
            current = current.next;
        }


    }
    int listLength()
    {
        SLLNode current = head;
        int count = 0;
        while(current != null)
        {
            current = current.next;
            count++;
        }
        length = count;
        return count;
    }
    void deleteAt(int where)
    {   
        SLLNode current = head;
        if(where == 1 && head!= null)
        {
            
            head = head.next;
           
            length --;
            return;
        }
        
        if(head == null)
        {
            System.out.println("The List is already empty");
            return;
        }
        if(where <= 0 || where > listLength())
        {
            System.out.println("Enter valid position to delete");
            return;
        }

        for( int i = 1; i < where-1 && current!=null ; i++)
        {
            current = current.next;
        }
        if(current != null && current.next != null) current.next = current.next.next;
       
        length--;
       
    }
    T getHead()
    {
        if(head == null)
        {
            System.out.println("There is no head");
            return null;
        }
        else
        return head.value;
    }
    T getTail()
    {
        if(listLength() == 0)
        {
            System.out.println("There is no tail");
            return null;

        }
        SLLNode current = head;
        while(current.next != null)
        {
            current = current .next;
        }
        tail = current;
        return tail.value;
    }
    void insertAt(T what , int where)
    {
        SLLNode current = head;
        SLLNode N1 = new SLLNode(what);
        if(head == null)
        {
            head = N1;
            length++;
            return;
        }
        if(where == 1 )
        {
           SLLNode N2 =new SLLNode (what);
           N2.next = head;
           head = N2;
           length++;
           return;

        }
        if(where == listLength()+1)
        {
            add(what);
            
            return;
        }
        if(where <= 0 || where > listLength())
        {
            System.out.println("Enter valid position");
            return;
        }
        for(int i = 1; i< where -1 && current != null ;i++)
        {
            current = current.next;
        }
        N1.next = current.next;
        current.next = N1;
        length++;

    }
    void insertAtFirst(T what)
    {
        if(head == null)
        {
            SLLNode N1 = new SLLNode(what);
            head = N1;
            tail = N1;
            length++;
            return; 

        }
    
        SLLNode N1 = new SLLNode(what);
        N1.next = head;
        head = N1;
        length++;
    }
    void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("The list is already empty");
            return;
        }
        head = head.next;
        length--;
    }
    void deleteLast()
    {
        SLLNode current = head;
        if(head == null)
        {
            System.out.println(" The list is Already empty");
            return;
        }
        if(head.next == null)
        {
            head = head.next;
            tail = null;
            length--;
            return;

        }
        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next= null;
        length--;

    }
    void replace(T what , int where)
    {
        SLLNode current = head;
        if(head == null)
        {
            System.out.println("Can't because list is empty");
            return;
        }
        if(where > listLength() || where <= 0)
        {
            System.out.println("Enter valid position");
            return;
        }
        for(int i =1; i < where && current != null; i++)
        {
            current = current .next;
        }
        if(current != null)
        current.value = what;
        
    }
    void search(T what)
    {   if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        int[] arr = new int[length+ 1];

        int j = 0;
        SLLNode current = head;
        int count = 0;
        for(int i =1; i <= length+1 && current != null; i++)
        {
            if(current.value == what)
            {
                arr[j] = i;
                j++;
               count++;
            }
            current = current.next;
        }
        if(count == 0)
        {
            System.out.println(what+" is not present in the List");
        }
    
        for(int i =0; i< arr.length ;i++)
        {
           if(arr[i]!=0)
           {
                System.out.println(what+" is on "+arr[i]+" position");
            
           }
        }
    
    }
    void found(T what)
    {
        SLLNode current = head;
        boolean found = false;
        for(int i =1 ; i <= length && current != null; i++)
        {
            if(current.value.equals( what))
             found = true;
            

        }
        if(found)
        {
            System.out.println("the element is in the list");

        }
        else
        {
            System.out.println("No found");
        }
    }
}
class DLL<E>
{
    class DLLNode
    {
        E value;
        DLLNode next;
        DLLNode prev;

        DLLNode(E value)
        {
            this.next = null;
            this.prev = null;
            this.value = value;
        }

    }
    DLLNode head;
    DLLNode tail;
    int length;
    void isDLL()
    {
        DLLNode current = head;
        boolean found = true;
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null)
        {
            System.out.println("there is only 1 node");
            return;
        }
       while(current.next != null)
        {
        
            if(current.next.prev != current)
           { 
            found = false;
            break;
           }
            current = current .next;
        }
        if(found)
         {
            System.out.println("The list is DLL");
           
         }
         else
         {
            System.out.println("Non DLL list");
         }
        
    }
    void addAtLast(E data)
    {
        DLLNode current = head;
        if(head == null)
        {
            DLLNode N1 = new DLLNode(data);
            head = N1;
            tail = N1;
            length++;
            return;
            
        }
        
        while(current.next != null)
        {
            current = current .next;
        }
        DLLNode N1 = new DLLNode(data);
        current.next = N1;
        N1.prev = current;
        tail = N1;
        N1.next = null;
        length++;

    }
    void printList()
    {
        DLLNode current = head;
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        while(current != null)
        {
            System.out.println(current.value);
            current = current.next;
        }
    }
    int listLength()
    {
        return length;
    }
   void insertAt(E what, int where) {
    DLLNode newNode = new DLLNode(what);

    if (where <= 0 || where > length + 1) {
        System.out.println("Invalid position. Use 1 to " + (length + 1));
        return;
    }

    if (head == null) {
        head = newNode;
        tail = newNode;
        length++;
        return;
    }

    if (where == 1) {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
        return;
    }

    if (where == length + 1) {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
        return;
    }

    DLLNode current = head;
    for (int i = 1; i < where - 1; i++) {
        current = current.next;
    }

    newNode.next = current.next;
    newNode.prev = current;
    current.next = newNode;

    if (newNode.next != null) {
        newNode.next.prev = newNode;
    }

    length++;

    // If inserted at last, update tail
    if (newNode.next == null) {
        tail = newNode;
    }
}
    void deleteAt(int where)
    {
        DLLNode current = head;
        if(where <= 0 || where > length)
        {
            System.out.println("Enter valid length");
            return;
        }
        if(head == null)
        {
            System.out.println("The list is already empty");
         
            return;
        }
        if( head.next == null)
        {
            head = null;
            length--;
            return;
        }
        if(where == 1)
        {
            if(head.next == null)
            {
                 head = null;
                 tail = null;
                 length--;
                 return;
                
             }
             else
             {
                head = head.next;
                head.prev = null;
                length--;
                return;
             }
             
        }

        for( int i = 1; i < where-1 && current != null; i++)
            current = current.next;

        if(current .next != null && current.next.next != null)
        { 
            current.next = current.next.next;   
            current.next.prev = current;
            length --;
        } 
        else
        {
           
            current.next = null;
            tail = current;
            length--;
    
        }
    }
    void reverseDLL() {
    DLLNode current = head;
    DLLNode temp = null;
    while(current != null)
    {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;

        current = current.prev;
    }
    if(temp != null)
    {   tail = head;
         head = temp.prev;
    }
}
    void printbackwards()
    {
        DLLNode current = tail;
        if(tail == null)
        {
            System.out.println("The list is empty");
            return;
        }
        do{
            System.out.println(current.value);
            current = current.next;
        }while(current != head);
        
    }
}
class CLL<T>
{
    class CLLNode
    {
        T value;
        CLLNode next;
        CLLNode prev;
        CLLNode(T value)
        {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    CLLNode head;
    CLLNode tail;
    int length;

    void printList()
    {
        CLLNode current = head;
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        
         do{
            System.out.println(current.value);
            current = current.next;
        }while(current != head);
        
    }
    void insertAt(T what, int where) {
    if (where <= 0 || where > length + 1) {
        System.out.println("Enter valid position to insert");
        return;
    }

    CLLNode N1 = new CLLNode(what);

    // Case 1: Empty list
    if (head == null) {
        head = tail = N1;
        N1.next = N1.prev = N1;
        length++;
        return;
    }

    // Case 2: Insert at beginning
    if (where == 1) {
        N1.next = head;
        N1.prev = tail;
        head.prev = N1;
        tail.next = N1;
        head = N1;
        length++;
        return;
    }

    // Case 3: Insert at end
    if (where == length + 1) {
        N1.next = head;
        N1.prev = tail;
        tail.next = N1;
        head.prev = N1;
        tail = N1;
        length++;
        return;
    }

    // Case 4: Insert in the middle
    CLLNode current = head;
    for (int i = 1; i < where - 1; i++) {
        current = current.next;
    }

    N1.next = current.next;
    N1.prev = current;
    current.next.prev = N1;
    current.next = N1;
    length++;
}
        
    
    void isCDLL()
    {
        CLLNode current = head;
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        boolean isCDLL = true;
        do{
            if(current.next == null || current.next.prev != current)
            {
                
                isCDLL = false;
                break;
            }
            current = current.next;
        }while(current != head);
        if(isCDLL)
        {
            System.out.println("IS CDLL");
        }
        else
        {
            System.out.println("NON CDLL");
        }
            
        
    }
    void deleteAt(int where)
    {
        CLLNode current = head;
        if(head == null)
        {
            System.out.println("There is no node");
            return;
        }
        if(head == tail )
        {
            head = tail =null;
            length--;
            return;
        }
        if(where == length)
        {
            tail = tail.prev;
            tail.next = head;
            head.prev =tail;
            length--;
            return;
        }

        for(int i = 1; i< where-1 ; i++)
        {
            current = current.next;
        }
        if(current.next != null && current.next.next != null)
        {
        current .next = current.next.next;
        current.next.next.prev = current;
        length--;
        return;
        }
        
    }

}
class FullLLlibrary
{
    public static void main(String[] args)
    {
    //     DLL<Integer> D1 = new DLL<>();

    // D1.addAtLast(1);
    //    D1.addAtLast(2);
    //   D1.addAtLast(3);
    //   D1.addAtLast(5);
    //   D1.addAtLast(6);
    //   D1.addAtLast(7);
    //    System.out.println("The Length of the list : "+D1.listLength());
    //   D1.insertAt(0,1);
      
    //    D1.reverseDLL();
      
    //    D1.isDLL();
    //     D1.printbackwards();
    CLL<Integer> C1 = new CLL<>();
    
    C1.insertAt(1,1);

    C1.insertAt(2,2);
    C1.insertAt(3,3);
    C1.insertAt(4,4);
    C1.insertAt(5,5);
     C1.insertAt(5,6);
      C1.insertAt(5,7);
      C1.deleteAt(4);

    
    C1.printList();
    C1.isCDLL();

    }
}