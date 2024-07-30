package calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
//
public class App {
    public static void main(String[] args) {
        //초기 results 리스트를 설정하는 예시
        ArrayList<Integer> initialResults = new ArrayList<>();
        initialResults.add(100);
        initialResults.add(200);
        //Calculator 클래스 인스턴스를 초기 results 리스트와 함께 생성
        Calculator calculator = new Calculator(initialResults); //Calculator 클래스 인스턴스 생성

        Scanner sc = new Scanner(System.in);

//        calculator.setResults(initialResults);

         while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            boolean validOperation = true; //연산이 유효한지 확인하는 변수
              int result;

             try { // 예외 처리 방법
                 result = calculator.calculate(num1,num2,operator); //Calculator 클래스의 calculate 메서드 호출
                 System.out.println("결과: "+result);
             } catch (ThrowException e){
                 System.out.println(e.getMessage());
                 validOperation = false; // 예외 발생 시 유효한 연산이 아님
             }
             if (validOperation){// validOperation이 true이면 (연산오류가 없으면)
                 // 결과값이 이미 리스트에 저장됨
             }

             System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
             String text1 = sc.next(); //메세지 입력창 생성
             if (Objects.equals(text1,"remove")){//remove라고 쓴다면
                     calculator.removeResult(); //removeResult 활용
                     System.out.println("가장 먼저 저장된 결과를 삭제했습니다");
             }
             System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
             String text2 = sc.next(); //메세지 입력창 생성
            if (Objects.equals(text2,"inquiry")){ //inquiry라고 쓴다면
                calculator.inquiryResults();
            }
             System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");// 계산식 중단 메세지
            String text3 = sc.next(); //메세지 입력창 생성
            if(Objects.equals(text3, "exit")) { // exit 와 같은지 확인
                break; // 같으면 즉시 중단
            }
        }
         sc.close(); //Scanner 닫기
    }
}

