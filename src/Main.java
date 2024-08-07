import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> questions = new ArrayList<>();

        // 첫 번째 문제
        HashMap<String, String> question1 = new HashMap<>();
        question1.put("question", "1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question1.put("choices", "1) var name 2) name = value 3) set name 4) name == value");
        question1.put("correct", "2");
        question1.put("score", "10");
        questions.add(question1);

        // 두 번째 문제
//        question1 = new HashMap<>();
//        question1.put("question", "2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
//        question1.put("choices", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
//        question1.put("correct", "1");
//        question1.put("score", "15");
//        questions.add(question1);

        // 두 번째 문제
        HashMap<String, String> question2 = new HashMap<>();
        question2.put("question", "2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        question2.put("choices", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        question2.put("correct", "1");
        question2.put("score", "15");
        questions.add(question2);

        // 세 번째 문제
        HashMap<String, String> question3 = new HashMap<>();
        question3.put("question", "3. Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        question3.put("choices", "1) if-else, 2) for-in, 3) while, 4) def");
        question3.put("correct", "1");
        question3.put("score", "10");
        questions.add(question3);

        // 네 번째 문제
        HashMap<String, String> question4 = new HashMap<>();
        question4.put("question", "4. Python에서 함수를 정의하는 방법은? (점수: 5점)");
        question4.put("choices", "1) class, 2) def, 3) import, 4) return");
        question4.put("correct", "2");
        question4.put("score", "5");
        questions.add(question4);

        // 사용자의 응답
        ArrayList<String> userResponses = new ArrayList<>();
        userResponses.add("4");
        userResponses.add("2");
        userResponses.add("3");
        userResponses.add("2");

        /*for (int i=0; i<questions.size(); i++) { // 이렇게 쓰는건 좋지 않다

        }*/
        // Iterator 방식
        /*for (HashMap<String, String> question : questions) {
            // 묶여 있는 변수는 이렇게 Iterator 를 쓰는것이 유리함
            System.out.println("");
        }*/

        int totalScore = 0;
        int userScore = 0;
        int i = 0;
        for (HashMap<String, String> question : questions) {
            int score = Integer.parseInt(question.get("score"));
            totalScore += score;
            if (userResponses.get(i).equals(question.get("correct"))) {
                userScore += score;
            }
            i++;
        } // 결과 출력 System.out.println("—----- 결과 —-------------"); System.out.println("응답한 내용 : 1번 " + userResponses.get(0) + ", 2번 " + userResponses.get(1) + ", 3번 " + userResponses.get(2) + ", 4번 " + userResponses.get(3)); System.out.println("당신 응답 합계 : " + userScore + "점"); // 학점 계산char grade; if (userScore >= 90) { grade = 'A'; } else if (userScore >= 80) { grade = 'B'; } else if (userScore >= 70) { grade = 'C'; } else if (userScore >= 60) { grade = 'D'; } else { grade = 'F'; } System.out.println("학점은 " + grade + " 입니다.");


    }
}