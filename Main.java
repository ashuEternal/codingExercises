package internshala;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Student> pq = new PriorityQueue<Student>(new StudentComparator());
       // System.out.println("Enter the test Cases");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-->0)
        {
            String operation = br.readLine();
            if(operation.charAt(0)=='E')
            {
                String[] values = operation.split(" ");
                pq.add(new Student(values[1],Double.parseDouble(values[2]),Integer.parseInt(values[3])));
            }
            else if(pq.peek()!=null)
                pq.poll();
        }
        if(pq.peek()!=null) {
            while (pq.peek() != null)
                System.out.println(pq.poll().getName());
        }
        else
            System.out.println("EMPTY");
    }
}
