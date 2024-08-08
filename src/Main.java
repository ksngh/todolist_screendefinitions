import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args){

		TodoListService todoListService = new TodoListService(new TodoListUtil());
        try {
            todoListService.runTodo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}