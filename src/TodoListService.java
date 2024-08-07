import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoListService {

    // 내가 받는 값이
    // 1. String 타입의 유저 네임
    // 2. 메뉴를 선택할 때 쓰는 int 타입의 숫자
    // 3. 종류 여부를 판단하는 String 타입의 q,x,c
    // 그럼 내가 만들어야 하는건, 유저네임을 받아서 해당 유저의 대충 머시기 init();
    // 그리고 2번에서 받은 값에 따라 대충 머시기를 수정한다.
    // 3번은 대충 머시기 한다.

    Map<String, List<String>> userMap = new HashMap<>();
    List<String> userList = List.of("미정", "미정", "미정", "미정", "미정");

    public Map<String, List<String>> initUserTodoList(String userName) {
        userMap.put(userName, userList);
        return userMap;
    }

    public void userTodoList(String userName) {
        Map<String,List<String>> userTodoList= initUserTodoList(userName);
    }

    //성호님한테 받을 값
}
