class Node{
    private String data;
    private Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
    
    public void Set_Data(String data){
        this.data=data;
    }

    public void Set_Next_Node(Node n){
        this.next=n;
    }

    public String get_Data(){
        return this.data;
    }

    public Node get_Next_Node(){
        return this.next;
    }
}

class Singly_linked_list{
    private Node head=null;

    public void traverse(){
        Node Current=this.head;
        if(Current!=null){
            while(true){
                System.out.print(Current.get_Data()+" ---> ");
                if(Current.get_Next_Node()==this.head){
                    break;
                }
                Current=Current.get_Next_Node();
            }
            System.out.println("");
        }else{
            System.out.println("List is empty.");
        }
    }

    public void insert_at_begning(String data){
        Node n=new Node(data);
        if(this.head==null){
            this.head=n;
            n.Set_Next_Node(this.head);
        }else{
            Node temp = this.head;
            while (temp.get_Next_Node() != this.head) {
                temp = temp.get_Next_Node();
            }
            temp.Set_Next_Node(n);
            n.Set_Next_Node(this.head);
            this.head=n;
        }
    }

    public void insert_at_last(String data){
        Node n=new Node(data);
        Node Current=this.head;
        if(Current!=null){
            while(Current.get_Next_Node()!=this.head){
                // System.out.print(Current.get_Data()+" ---> ");
                Current=Current.get_Next_Node();
            }
            Current.Set_Next_Node(n);
            n.Set_Next_Node(this.head);
        }else{
            this.head = n;
            n.Set_Next_Node(n);
        }
    }

    public void insert_at_Position(String data,int position){
        if(position<1){
            System.out.println("Invalid Input.");
            return;
        }
        Node n=new Node(data);
        Node Current=this.head;
        if(position==1){
            insert_at_begning(data);
            return;
        }
        if(Current!=null){
            int i=1;
            while(i<position-1){
                Current=Current.get_Next_Node();     
                i++;
                if(Current==this.head){
                    System.out.println("Position is out of index!");
                    return;
                }
            }
            n.Set_Next_Node(Current.get_Next_Node());
            Current.Set_Next_Node(n);
        }else{
            System.out.println("List is empty.");
        }
    }

    public void Delete_at_begning(){
        if(this.head==null){
            System.out.println("List is empty.");

        }else if(this.head.get_Next_Node()==this.head){
            System.out.println(this.head.get_Data()+" is deleted sucessfully!");
            this.head=null;
        }else{
            Node Current=this.head;
            while(Current.get_Next_Node()!=this.head){
                Current=Current.get_Next_Node();
            }
            Current.Set_Next_Node(this.head.get_Next_Node());
            System.out.println(this.head.get_Data()+" is deleted sucessfully!");
            this.head=this.head.get_Next_Node();
        }
    }

    public void Delete_at_last(){
        Node Current=this.head;
        if(Current==null){
            System.out.println("List is empty.");
        }else if(this.head.get_Next_Node()==this.head){
            System.out.println(this.head.get_Data()+" is deleted sucessfully!");
            this.head=null;
        }else{
             while(Current.get_Next_Node().get_Next_Node()!=this.head){
                Current=Current.get_Next_Node();
            }
            System.out.println(Current.get_Next_Node().get_Data()+" is deleted sucessfully!");
            Current.Set_Next_Node(this.head);
        }   
    }

    public void Delete_at_position(int position){
        // Node previce;
        Node Current=this.head;
        if(position<1){
            System.out.println("Invalid Position.");
        }
        if(position==1){
            Delete_at_begning();
            return;
        }
        if(Current!=null){
            for(int i=1;i<position-1;i++){
                if(Current.get_Next_Node()==this.head){
                    System.out.println("Position is out of index!");
                    return;
                } 
                Current=Current.get_Next_Node(); 
            }
                System.out.println(Current.get_Next_Node().get_Data() + " is deleted successfully!");
                Current.Set_Next_Node(Current.get_Next_Node().get_Next_Node());
        }else{
            System.out.println("List is empty.");
        }
    }

}


public class single_linked {
    public static void main(String[] args) {
        Singly_linked_list s=new Singly_linked_list();
        s.insert_at_begning("A");
        s.insert_at_begning("B");
        s.insert_at_last("D");
        s.insert_at_Position("C", 4);
        s.Delete_at_begning();
        s.Delete_at_last();
        s.Delete_at_position(2);

    }    
}
