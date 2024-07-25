
public class rev {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
     }
       
       static class linko{
        Node head = null;
        Node tail = null;
      
        void insertAtbegin(int val){
            Node t = new Node(val);
            if(head == null){
                head=t;
                tail=t;
            }
            else{
             t.next=head;
             head=t;
            }
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
       
        void insertAtIdx(int idx,int val){
            Node temp = new Node(val);
            Node t = head;
            if(size() == 0){
                insertAtbegin(val);
                return;
            }
            else{

            }
            for(int i=1;i<idx;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
        }
          
        int getElement(int idx){
          Node temp = head;
          for(int i=0;i<idx;i++){
            temp = temp.next;
          }
          return temp.data;
        }
         
        void insertAtEndHeadNode(int val){
            Node temp = new Node(val);
            Node t = head;
            while(t.next != null){
                t=t.next;
            }
            t.next=temp;
        }
       
        void deleteIdx(int idx){
            Node temp = head;
            if(idx == 0 ){
                temp = temp.next;
            }
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
        }


        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size(){
            int count=0;
            Node temp=head;
            while(temp != null){
                count++;
                temp=temp.next;
            }
            return count;
        }
     }
    
    public static void main(String[] args) {
          linko ll = new linko();
          ll.insertAtbegin(1);
          ll.insertAtbegin(0);
          ll.insertAtEnd(99);
          ll.insertAtEnd(100);
          ll.insertAtEnd(101);
          ll.insertAtIdx(4,-1);
          ll.insertAtEndHeadNode(999);
          System.out.println( "element at given index is :" + ll.getElement(3));
          ll.deleteIdx(1);
          ll.display();
    }
}
