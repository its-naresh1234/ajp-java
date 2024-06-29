import java.util.ArrayDeque;

public class Pq2 {

	public static void main(String[] args) {
       ArrayDeque<String > aq=new ArrayDeque<String>();
       aq.add("A");
       aq.add("B");
       aq.add("C");
       aq.add("D");
       aq.add("E");
       aq.add("F");
       System.out.println(aq);
       System.out.println(aq.peekFirst());
       System.out.println(aq.peekLast());
       System.out.println(aq.getFirst());
       System.out.println(aq.size());
       System.out.println(aq.contains("C"));
       System.out.println(aq);
       System.out.println(aq.hashCode());
        System.out.println(aq.peek());
        System.out.println(aq);
        System.out.println(aq.poll());
        System.out.println(aq);
	}

}
