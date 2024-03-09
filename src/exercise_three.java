public class exercise_three {
    public void displayAll(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
        length ++;

    }

    public static void main(String[] args) {
        displayAll();
        tail.next = temp.enqueue(transfer);

    }
}
