public class exercise_two {

    public static <E> transfer(E t){

        Stack<E> s = new Stack<>();
        for(E data : s){
            stack.push(data);
        }
        for(int i=0;i<t.length; i++){
            s[i] = stack.pop();
        }
        return new <E>(s);
    }
}
