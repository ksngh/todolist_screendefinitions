import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args){

		Map<String, List<String>> userMap = new HashMap<>();
		ArrayList<String> userList = new ArrayList<>(Arrays.asList("미정", "미정", "미정", "미정", "미정"));
		userMap.put("hyeok",userList);
		TodoListUtil todoListUtil = new TodoListUtil();
		todoListUtil.showResult(userMap);
	}
}