import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class TodoListUtil {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public void beforeStart() throws IOException {
		bw.write("Status 기호 : 1: 완료, 2: 미정 \r\n");
		bw.flush();
		bw.write("종료 여부 : c-계속 입력 ,q- 다음 참여자로 넘기기 ,x- 입력 종료");
		bw.flush();
	}

	public String extractUsername() throws IOException {
		bw.write("Input Your Name:");
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
