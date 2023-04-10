package GLinkedList;

/**
 *
 * @author Mahmoud
 */
public class GLinkedList {
    
    public class Node {
        
        public String VidName,Path,Action,PlayerName,Team1,Team2;
        public Node next;
        
        public Node(String VN,String P,String A,String PL,String T1,String T2){
            this.VidName = VN;
            this.Path = P;
            this.Action = A;
            this.PlayerName = PL;
            this.Team1 = T1;
            this.Team2 = T2;
            this.next = null;
        }
        
        
    }
    
    public int size = 0;
    
    public Node head;
    
    public GLinkedList()
    {
        head = null;
    }
    
    public void add(String VN,String P,String A,String PL,String T1,String T2)
    {
        size++;
        Node newNode = new Node(VN, P, A, PL, T1, T2);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public boolean isEmpty() {
	return (head == null);
    }
    
    public void update(String CP,String VN,String P,String A,String PL,String T1,String T2)
    {
        if(head == null)
        {
            return;
        }
        
        Node current = head;
        
        while(current.Path != CP)
        {
            current = current.next;
        }
        current.VidName = VN;
        current.Path = P;
        current.Action = A;
        current.PlayerName = PL;
        current.Team1 = T1;
        current.Team2 = T2;
    }
    
    public void remove(String CP)
    {
        size--;
        if(isEmpty())
        {
            return;
        }
        else if(head.next == null)
        {
           head = null;
        }
        else
        {
            Node current = head;
            if(head.Path == CP)
            {
                head = head.next;
            }
            else{
                while (current.next.next != null && current.next.Path != CP)
                {
                    current = current.next;
                }
                if(current.next.next != null)
                {
                    current = current.next.next;
                }
                current.next = null;
            }
        }
    }
    
    public void ASCsortByVN(){
         
        if(head == null)
        {
            return;
        }
        else{
            Node current = head, CheckNext;
            while(current.next != null)
            {
                CheckNext = current.next;
                while(CheckNext != null)
                {
                    if( current.VidName.compareTo(CheckNext.VidName) > 0)
                    {
                        String VidNametemp = current.VidName;
                        String Pathtemp = current.Path;
                        String Acriontemp = current.Action;
                        String Playertemp = current.PlayerName;
                        String Team1temp = current.Team1;
                        String Team2temp =  current.Team2;     
                        current.VidName = CheckNext.VidName;
                        current.Path = CheckNext.Path;
                        current.Action = CheckNext.Action;
                        current.PlayerName = CheckNext.PlayerName;
                        current.Team1 = CheckNext.Team1;
                        current.Team2 = CheckNext.Team2;
                        CheckNext.VidName = VidNametemp;
                        CheckNext.Path = Pathtemp;
                        CheckNext.Action = Acriontemp;
                        CheckNext.PlayerName = Playertemp;
                        CheckNext.Team1 = Team1temp;
                        CheckNext.Team2 = Team2temp;
                    }
                    CheckNext = CheckNext.next;
                }
                current = current.next;
            }
        }
    }
    
    
    public void DESsortByVN(){
        
       if(head == null)
        {
            return;
        }
        else{
            Node current = head, CheckNext;
            while(current != null)
            {
                CheckNext = current.next;
                while(CheckNext != null)
                {
                    if(current.VidName.compareTo(CheckNext.VidName) < 0)
                    {
                        String VidNametemp = current.VidName;
                        String Pathtemp = current.Path;
                        String Acriontemp = current.Action;
                        String Playertemp = current.PlayerName;
                        String Team1temp = current.Team1;
                        String Team2temp =  current.Team2;     
                        current.VidName = CheckNext.VidName;
                        current.Path = CheckNext.Path;
                        current.Action = CheckNext.Action;
                        current.PlayerName = CheckNext.PlayerName;
                        current.Team1 = CheckNext.Team1;
                        current.Team2 = CheckNext.Team2;
                        CheckNext.VidName = VidNametemp;
                        CheckNext.Path = Pathtemp;
                        CheckNext.Action = Acriontemp;
                        CheckNext.PlayerName = Playertemp;
                        CheckNext.Team1 = Team1temp;
                        CheckNext.Team2 = Team2temp;
                    }
                    CheckNext = CheckNext.next;
                }
                current = current.next;
            }
        }
    }
} // end of GLinkedList
