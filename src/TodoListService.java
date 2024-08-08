import java.io.IOException;
import java.util.*;

public class TodoListService {
    private final TodoListUtil todoListUtil;

    Map<String, List<String>> userMap = new HashMap<>();
    List<String> userList = new ArrayList<>(Arrays.asList("미정", "미정", "미정", "미정", "미정"));
    Scanner sc = new Scanner(System.in);
    String checkCondition = "";
    String name = "";

    public TodoListService(TodoListUtil todoListUtil) {
        this.todoListUtil = todoListUtil;
    }

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
        System.out.println("1.주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담");
        System.out.println("Title 번호 : ");
        int selectNum = sc.nextInt();


        List<String> values = userMap.get(userName);
        values.set(selectNum - 1, "완료");

        System.out.println("Status : 완료");



    }

    public void checkExitCondition(String checkExit) {
        switch (checkExit) {
            case "c" -> checkCondition = "c";
            case "q" -> checkCondition = "q";
            case "x" -> checkCondition = "x";
        }

    }

    public void runTodo() throws IOException {



        while (!checkCondition.equals("x")) {
            if (checkCondition.equals("") || checkCondition.equals("q")) {
                name =  todoListUtil.extractUsername();
                checkUserTodoList(name);
                showTodoMenu(name);
                checkExitCondition(todoListUtil.choiceQCX());
            } else if (checkCondition.equals("c")) {
                showTodoMenu(name);
                checkExitCondition(todoListUtil.choiceQCX());
            }
        }
        todoListUtil.showResult(userMap);
    }


}
