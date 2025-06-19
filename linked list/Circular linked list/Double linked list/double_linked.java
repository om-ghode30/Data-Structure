class Node{
    private String data;
    private Node pre_node;
    private Node next_node;


    Node(Node pre_n,String data,Node nextNode){
        this.pre_node=pre_n;
        this.data=data;
        this.next_node=nextNode;
    }
    
    public void Set_Data(String data){
        this.data=data;
    }

    public void Set_Next_Node(Node n){
        this.next_node=n;
    }
    public void Set_Pre_Node(Node n){
        this.pre_node=n;
    }

    public String get_Data(){
        return this.data;
    }

    public Node get_Next_Node(){
        return this.next_node;
    }

    public Node get_Pre_Node(){
        return this.pre_node;
    }
}



class Double_linked_list{
    private Node head=null;
    private Node tail=null;

    public void traverse_backward(){
        Node Current=this.tail;
        if(Current!=null){
            do{
                System.out.print(Current.get_Data());
                Current=Current.get_Pre_Node();
                if(Current!=this.tail){
                    System.out.print("<--");
                }
            }while(Current!=this.tail);
            System.out.println("");
        }else{
            System.out.println("List is empty.");
        }
    }

    public void traverse_forward(){
        Node Current=this.head;
        if(Current!=null){
            do{
                System.out.print(Current.get_Data());
                Current=Current.get_Next_Node();
                if(Current!=this.head){
                    System.out.print("-->");
                }
            }while(Current!=this.head);
            System.out.println("");
        }else{
            System.out.println("List is empty.");
        }
    }
 
    public void Search(String data){
        Node Current=this.head;
        if(Current!=null){
            do{
                if(Current.get_Data().equalsIgnoreCase(data)){
                    System.out.println(data+" Element Found.");
                    return;
                }
                Current=Current.get_Next_Node();
            }while(Current!=this.head);
            System.out.println(data+" Element Not Found.");
        }else{
            System.out.println("List is empty. Cannot Search!");
        }
    }

    public void SearchIndex(String data){
        Node Current=this.head;
        int position=1;
        if(Current!=null){
            do{
                if(Current.get_Data().equalsIgnoreCase(data)){
                    System.out.println(data+" Element Found at position "+position);
                    return;
                }
                Current=Current.get_Next_Node();
                position++;
            }while(Current!=this.head);
            System.out.println(data+" Element Not Found.");
        }else{
            System.out.println("List is empty. Cannot Search!");
        }
    }

        public void delete_by_value(String data){
        Node Current=this.head;
        int position=1;
        if(Current!=null){
            do{
                if(Current.get_Data().equalsIgnoreCase(data)){
                    Delete_at_position(position);
                    return;
                }
                Current=Current.get_Next_Node();
                position++;
            }while(Current!=this.head);
            System.out.println(data+" Element Not Found.");
        }else{
            System.out.println("List is empty. Cannot Search!");
        }
    }


    public void insert_at_begning(String data){
        Node n=new Node(null,data,this.head);
        if(head==null){
            this.tail=n;
            n.Set_Next_Node(n);
            n.Set_Pre_Node(n);
        }else{
            Node temp=this.head;
            n.Set_Next_Node(temp);
            temp.Set_Pre_Node(n);
            n.Set_Pre_Node(this.tail);
            this.tail.Set_Next_Node(n);            
        }
        this.head=n;
    }

    public void insert_at_last(String data){
        Node n=new Node(null,data,null);
        Node Current=this.tail;
        if(Current==null){
            this.head=n;
            n.Set_Next_Node(n);
            n.Set_Pre_Node(n);
        }else{
            Current.Set_Next_Node(n);
            n.Set_Pre_Node(Current);
            n.Set_Next_Node(this.head);
            this.head.Set_Pre_Node(n);
        }
        this.tail=n;
    }   

    public void insert_at_Position(String data,int position){
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }
        if(position==1){
            insert_at_begning(data);
            return;
        }       
        Node Current=this.head;
        if(Current!=null){
            Node n=new Node(null,data,null);
            int i=1;
            while(i < position-1){
                Current=Current.get_Next_Node(); 
                i++; 
                if(Current==this.head){
                    System.out.println("Position is out of index!");
                    return;
                }
            }
            Node nextNode=Current.get_Next_Node();
            n.Set_Next_Node(nextNode);
            n.Set_Pre_Node(Current);
            Current.Set_Next_Node(n);
            nextNode.Set_Pre_Node(n);
            if(nextNode==this.head){
                this.tail=n;
            }
        }else{
            System.out.println("List is empty. Cannot insert at position " + position);
        }
    }

    public void Delete_at_begning(){
        if(this.head==null){
            System.out.println("List is empty. Cannot Delete!");
        }else{
            Node Current=this.head;
            if(this.head==Current.get_Next_Node()){
                this.head=null;
                this.tail=null;
            }else{
                this.head=Current.get_Next_Node();
                this.head.Set_Pre_Node(Current.get_Pre_Node());
                Current.get_Pre_Node().Set_Next_Node(this.head);
            }
            System.out.println(Current.get_Data()+" is deleted successfully!");
        }
    }

    public void Delete_at_last(){
        Node Current=this.tail;
        if(Current!=null){
            if(Current==this.head){
                this.head=null;
                this.tail=null;
                return;
            }
            Node pre=Current.get_Pre_Node();
            this.tail=pre;
            pre.Set_Next_Node(Current.get_Next_Node());
            Current.get_Next_Node().Set_Pre_Node(pre);            
            System.out.println(Current.get_Data()+" is deleted successfully!");
        }else{
            System.out.println("List is empty. Cannot Delete!");
        }
    }

    public void Delete_at_position(int position){
        if(position<1){
            System.out.println("Invalid Position.");
            return;
        }
        if(this.head!=null){
            if(position==1){
                Delete_at_begning();
                return;
            }
            Node Current=this.head;
            int i=1;
            while(i < position){  
                Current=Current.get_Next_Node();  
                i++; 
                if(Current==this.head){
                    System.out.println("Position is out of index!");
                    return;
                }
            }
            Node PreNode=Current.get_Pre_Node();
            PreNode.Set_Next_Node(Current.get_Next_Node());
            Current.get_Next_Node().Set_Pre_Node(PreNode);
            if(Current==this.tail){
                this.tail=PreNode;
            }
            System.out.println(position + " index element is deleted successfully!");
        }else{
            System.out.println("List is empty. Cannot insert at position " + position);
        }

    }
}


public class double_linked {
    public static void main(String[] args) {
        Double_linked_list dl = new Double_linked_list();
        dl.insert_at_begning("C");
        dl.insert_at_last("D");
        dl.insert_at_Position("B", 1);
        dl.insert_at_Position("E", 4);
        dl.insert_at_Position("A", 1);

        // Expected: A -> B -> C -> D -> E
        dl.traverse_forward();   
        dl.traverse_backward();  

        dl.Search("D");            // Found
        dl.SearchIndex("D");       // Position 4

        dl.Delete_at_position(3);  // Deletes C
        dl.traverse_forward();     // A -> B -> D -> E

        dl.Delete_at_last();       // Deletes E
        dl.Delete_at_begning();    // Deletes A
        dl.traverse_forward();     // B -> D

    }
}
