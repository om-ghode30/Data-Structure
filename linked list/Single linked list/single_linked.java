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
                if(Current.get_Next_Node()==null){
                    break;
                }
                Current=Current.get_Next_Node();
            }
            System.out.println("");
        }else{
            System.out.println("No Node Selected");
        }
    }

    public void insert_at_begning(String data){
        Node n=new Node(data);
        n.Set_Next_Node(this.head);
        this.head=n;
    }

    public void insert_at_last(String data){
        Node n=new Node(data);
        Node Current=this.head;
        if(Current!=null){
            while(Current.get_Next_Node()!=null){
                // System.out.print(Current.get_Data()+" ---> ");
                Current=Current.get_Next_Node();
            }
            Current.Set_Next_Node(n);
        }else{
            this.head = n;
        }
    }

    public void insert_at_Position(String data,int position){
        Node n=new Node(data);
        Node Current=this.head;
        if(position==1){
            insert_at_begning(data);
            return;
        }
        if(Current!=null){
            for(int i=1;i<position-1;i++){
                if(Current.get_Next_Node()==null){
                    System.out.println("Position is out of index!");
                    break;
                }
                Current=Current.get_Next_Node();     
            }
            n.Set_Next_Node(Current.get_Next_Node());
            Current.Set_Next_Node(n);
        }else{
            System.out.println("No Node Selected");
        }
    }

    public void Delete_at_begning(){
        if(this.head==null){
            System.out.println("No Node to delete");

        }else{
            Node Current=this.head;
            this.head=Current.get_Next_Node();
            System.out.println(Current.get_Data()+" is deleted sucessfully!");
        }
    }

    public void Delete_at_last(){
        Node Current=this.head;
        if(Current!=null){
            while(Current.get_Next_Node()!=null){
                if((Current.get_Next_Node()).get_Next_Node()==null){
                    System.out.println((Current.get_Next_Node()).get_Data()+" is deleted sucessfully!");
                    Current.Set_Next_Node(null);
                    break;
                }
                Current=Current.get_Next_Node();
            }
        }else{
            System.out.println("No Node Selected");
        }
    }

    public void Delete_at_position(int position){
        // Node previce;
        Node Current=this.head;
        if(position==1){
            Delete_at_begning();
            return;
        }
        if(Current!=null){
            for(int i=1;i<position-1;i++){
                if(Current.get_Next_Node()==null){
                    System.out.println("Position is out of index!");
                    return;
                } 
                Current=Current.get_Next_Node(); 
            }
            Current.Set_Next_Node(Current.get_Next_Node().get_Next_Node());
            System.out.println(Current.get_Data()+" is deleted sucessfully!");

        }else{
            System.out.println("No Node Selected");
        }
    }

}


public class single_linked {
    public static void main(String[] args) {
        Singly_linked_list s=new Singly_linked_list();
        s.traverse();
        s.insert_at_begning("A");
        s.traverse();
        s.insert_at_begning("B");
        s.traverse();
        s.insert_at_last("D");
        s.traverse();
        s.insert_at_Position("C", 4);
        s.traverse();
        s.Delete_at_begning();
        s.traverse();
        s.Delete_at_last();
        s.traverse();
        s.Delete_at_position(2);
        s.traverse();
    }    
}
