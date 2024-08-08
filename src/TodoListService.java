import java.util.*;

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
    Scanner sc = new Scanner(System.in);

    public void checkUserTodoList(String userName) {
        if (!userMap.containsKey(userName)) {
            createUserTodoList(userName);
        }
    }

    public Map<String, List<String>> createUserTodoList(String userName) {
        userMap.put(userName, userList);
        return userMap;
    }

    public void showTodoMenu(String userName) {
        System.out.println("주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담");
        System.out.println("Title 번호 : ");
        int selectNum = sc.nextInt();


        List<String> values=userMap.get(userName);
        values.set(selectNum-1,"완료");

        System.out.println("Status : 완료");

        System.out.println(userMap.toString());



    }



    //성호님한테 받을 값
}
