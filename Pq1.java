import java.util.PriorityQueue;

public class Pq1 {

	public static void main(String[] args) {
         PriorityQueue <String > pq=new PriorityQueue<String>();
         pq.add("A");
         pq.add("B");
         pq.add("C");
         pq.add("D");
         pq.add("G");
         pq.add("F");
         pq.add("E");
         System.out.println(pq);
       System.out.println(pq.peek());
       System.out.println(pq);
        //System.out.println( pq.element());
        System.out.println(pq.poll());
     //   System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq);
	}

}
