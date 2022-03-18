import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> Stack1 = new ArrayList<Integer>();
        List<Integer> Stack2 = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while(total > 0){
            int job = scan.nextInt();
            switch (job){
                case 1: // Add Element
                    if (Stack1.isEmpty() && Stack2.isEmpty()) {
                        Stack1.add(scan.nextInt());
                    } else {
                        Stack2.add(scan.nextInt());
                    }
                    break;
                case 2:// Removing Element
                    if(Stack1.isEmpty()) { // If first stack is empty move all elements over to the first stack
                        while(!Stack2.isEmpty()) {
                            Stack1.add(Stack2.get(0));
                            Stack2.remove(0);
                        }
                    }
                    Stack1.remove(0); // Remove the first element of stack 1
                    break;
                case 3:
                    if(Stack1.isEmpty()){ // If first stack is empty move all elements over to the first stack
                        while(!Stack2.isEmpty()){
                            Stack1.add(Stack2.get(0));
                            Stack2.remove(0);
                        }
                    }
                    System.out.println(Stack1.get(0)); // Remove the first element of stack 1
                    break;
            }
            total--;
        }
    }
}
