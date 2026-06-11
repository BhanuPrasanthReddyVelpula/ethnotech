
public class BusStop {
    public static void main(String args[]){
        Bus bus = new Bus();
        bus.add("Nani");
        bus.add("NTR");
        bus.add("Surya");
        bus.add("Vijay");
        bus.add("Karthi");
        bus.disaply();
    }
}

class Node{
    String data;
    Node Next;
    Node(String data){
        this.data = data;
        this.Next = null;
    }
}

class Bus{
    Node head;
    public void add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.Next != null){
                temp = temp.Next;
            }
            temp.Next = newNode;
        }
    }
    public void disaply(){
        if(head == null)
            System.out.println("No Data Found!");
        else {
            Node temp = head;
            while(temp.Next != null){
                System.out.println(temp.data);
                temp = temp.Next;
            }
            System.out.println(temp.data);
        }
    }
}
