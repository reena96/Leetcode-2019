import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LockProblem {
    static int check_log_history(List<String> events){
        Stack<String> eventStack = new Stack<>();

        for(int i = 0;i<events.size(); i++){
            String[] str = events.get(i).split(" ");
            // A lock already A OR R a lock already R
            if(str[0] == "ACQUIRE" || str[0] == "RELEASE" ){
                if(eventStack.contains(events.get(i)))
                    return i+1;
                else{
                    eventStack.push(events.get(i));

                }

            }

            if(str[0] == "RELEASE"){
                if(eventStack.contains("ACQUIRE "+str[1])){
                    eventStack.pop();
                }
            }

        }

        return 0;
    }
    public static void main(String[] args){
        List<String> events = new ArrayList<>();
        events.add("ACQUIRE 1");
        events.add("ACQUIRE 2");
        events.add("ACQUIRE 3");
        events.add("RELEASE 3");
        events.add("RELEASE 2");
        events.add("RELEASE 1");
        System.out.println(check_log_history(events));


    }
}
