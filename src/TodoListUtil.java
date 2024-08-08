import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;

public class TodoListUtil {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public void beforeStart() throws IOException {
		bw.write("Status 기호 : 1: 완료, 2: 미정 \r\n");
		bw.write("종료 여부 : c-계속 입력 ,q- 다음 참여자로 넘기기 ,x- 입력 종료 \r\n");
		bw.flush();
	}

	public String extractUsername() throws IOException {
		bw.write("Input Your Name:");
		bw.flush();
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public int titleNumber() throws IOException {
		try {
			bw.write("To Do List 중 하나를 선택하세요!\r\n");
			bw.flush();
			bw.write("1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담\r\n");
			bw.flush();
			return Integer.parseInt(br.readLine());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String choiceQCX() throws IOException {
		bw.write("종료 여부:\r\n");
		bw.flush();
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void showResult(Map<String, List<String>> userMap){
		for (String key : userMap.keySet()) {

				try {
					bw.write(key +"\r\n");
					bw.flush();
					bw.write("1. 주간 보고서 작성 (" +userMap.get(key).get(0)+
						"), 2. 이메일 확인 및 응답 (" + userMap.get(key).get(1)+
						"), 3. 회의 준비 (" + userMap.get(key).get(2)+
						"), 4. 프로젝트 계획서 수정 (" + userMap.get(key).get(3)+
						"), 5.팀 멤버와의 1:1 면담 (" + userMap.get(key).get(4)+
						") \r\n");
					bw.flush();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}

		}



	}

}
