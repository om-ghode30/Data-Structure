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
            while(Current!=null){
                System.out.print(Current.get_Data());
                if(Current.get_Pre_Node()==null){
                    break;
                }
                System.out.print("<--");
                Current=Current.get_Pre_Node();
            }
            System.out.println("");
        }else{
            System.out.println("List is empty.");
        }
    }

    public void traverse_forward(){
        Node Current=this.head;
        if(Current!=null){
            while(Current!=null){
                System.out.print(Current.get_Data());
                if(Current.get_Next_Node()==null){
                    break;
                }
                System.out.print("-->");
                Current=Current.get_Next_Node();
            }
            System.out.println("");
        }else{
            System.out.println("List is empty.");
        }
    }
 
    public void Search(String data){
        Node Current=this.head;
        if(Current!=null){
            while(Current!=null){
                if(Current.get_Data().equalsIgnoreCase(data)){
                    System.out.println(data+" Element Found.");
                    return;
                }
                Current=Current.get_Next_Node();
            }
            System.out.println(data+" Element Not Found.");
        }else{
            System.out.println("List is empty. Cannot Search!");
        }
    }

    public void SearchIndex(String data){
        Node Current=this.head;
        int position=1;
        if(Current!=null){
            while(Current!=null){
                if(Current.get_Data().equalsIgnoreCase(data)){
                    System.out.println(data+" Element Found at position "+position);
                    return;
                }
                Current=Current.get_Next_Node();
                position++;
            }
            System.out.println(data+" Element Not Found.");
        }else{
            System.out.println("List is empty. Cannot Search!");
        }
    }

    public void insert_at_begning(String data){
        Node n=new Node(null,data,this.head);
        if(head!=null){
            head.Set_Pre_Node(n);
        }else{
            this.tail=n;
        }
        this.head=n;
    }

    public void insert_at_last(String data){
        Node n=new Node(null,data,null);
        Node Current=this.tail;
        if(Current!=null){
            Current.Set_Next_Node(n);
            n.Set_Pre_Node(Current);
            this.tail=n;
        }else{
            this.head = n;
            this.tail = n;
        }
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
            
            for(int i=1;i<position-1;i++){
                if(Current.get_Next_Node()==null){
                    System.out.println("Position is out of index!");
                    return;
                }
                Current=Current.get_Next_Node();     
            }
            Node nextNode=Current.get_Next_Node();
            n.Set_Next_Node(nextNode);
            n.Set_Pre_Node(Current);
            Current.Set_Next_Node(n);
            if(nextNode!=null){
                nextNode.Set_Pre_Node(n);
            }else{
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
            this.head=Current.get_Next_Node();
            if(this.head!=null){
                head.Set_Pre_Node(null);
            }else{
                this.tail=null;
            }
            
            System.out.println(Current.get_Data()+" is deleted sucessfully!");
        }
    }

    public void Delete_at_last(){
        Node Current=this.tail;
        if(Current!=null){
            Node pre=Current.get_Pre_Node();
            this.tail=pre;
            if(pre!=null){
            pre.Set_Next_Node(null);
            }else{
                this.head=null;
            }
            System.out.println(Current.get_Data()+" is deleted sucessfully!");
        }else{
            System.out.println("List is empty. Cannot Delete!");
        }
    }

    public void Delete_at_position(int position){
        Node Current=this.head;
        if(position<1){
            System.out.println("Invalid Position.");

        }
        if(position==1){
            Delete_at_begning();
            return;
        }
        if(Current!=null){
            for(int i=1;i<position;i++){
                if(Current.get_Next_Node()==null){
                    System.out.println("Position is out of index!");
                    return;
                } 
                Current=Current.get_Next_Node(); 
            }
            Node pre=Current.get_Pre_Node();
            Node next=Current.get_Next_Node();
            pre.Set_Next_Node(next);
            if(next==null){
                tail=pre;
            }else{
                next.Set_Pre_Node(pre);
            }
            System.out.println(Current.get_Data()+" is deleted sucessfully!");
        }else{
            System.out.println("List is empty. Cannot Delete!");
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

        dl.traverse_forward();   // A --> B --> C --> D --> E
        dl.traverse_backward();  // E <-- D <-- C <-- B <-- A

        dl.Search("D");
        dl.SearchIndex("D");

        dl.Delete_at_position(3);
        dl.traverse_forward();
        dl.Delete_at_last();
        dl.Delete_at_begning();
        dl.traverse_forward();
    }
}
