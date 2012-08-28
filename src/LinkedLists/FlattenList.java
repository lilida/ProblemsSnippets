package ProblemsSnippets.LinkedLists;

/**
 * For a doubly linked list, each node has a children that may point to another doubly linked list.
 * Flattening the list to another linked list
 */
public class FlattenList {

    public class Node{
        public Node next;
        public Node previous;
        public Node child;
        public int value;
        public Node(FlattenList list){};
    }

    public  Node GetSample(){
        /*
            Sample is:

            1 <-> 2<->9<->10
                  |
                  3<->6<->7
                  |       |
                  4<->5   8
         */
        Node[] nodes=new Node[10];

        for(int i=0;i<10;i++){
            nodes[i]=new Node(this);
            nodes[i].value=i+1;
        }
        nodes[0].next=nodes[1];
        nodes[1].previous=nodes[0];
        nodes[1].next=nodes[8];
        nodes[1].child=nodes[2];
        nodes[2].next=nodes[5];
        nodes[2].child=nodes[3];
        nodes[3].next=nodes[4];
        nodes[4].previous=nodes[3];
        nodes[5].previous=nodes[2];
        nodes[5].next=nodes[6];
        nodes[6].previous=nodes[5];
        nodes[6].child=nodes[7];
        nodes[8].previous=nodes[1];
        nodes[8].next=nodes[9];
        nodes[9].previous=nodes[8];
        return nodes[0];
    }
    public static Node Flatten(Node head){
        if (head == null)
            return null;
        Node current=head;
        while (current.next !=null || current.child!=null){
            if (current.child != null){
                Node next=current.next;
                Node tail=Flatten(current.child);
                current.next=current.child;
                tail.next=next;
                current=tail;
        }

            if (current.next==null)
                break;
            else
                current=current.next;

        }
        return current;
    }


}
