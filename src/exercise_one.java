import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class exercise_one {

    public ListNode findIndex(int data){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            if(current.data == element){
                return count;
            }
            current = current.next;
            count ++;
        }
        return false;
    }
}
