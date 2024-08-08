import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args){
		TodoListUtil todoListUtil = new TodoListUtil();
		try {
			todoListUtil.beforeStart();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}