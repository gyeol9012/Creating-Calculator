package calculator;

import java.util.Objects;
import java.util.Scanner;
//
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //Calculator 클래스 인스턴스 생성
        Scanner sc = new Scanner(System.in);

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
//             if (validOperation){// validOperation이 true이면 (연산오류가 없으면)
//                 // 결과값이 이미 리스트에 저장됨
//             }
//
             System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
             String text1 = sc.next(); //메세지 입력창 생성
             if (Objects.equals(text1,"remove")){//remove라고 쓴다면
                 calculator.removeFirstResult(); //첫번째 결과 삭제
//                 if (!calculator.getResults().isEmpty()) { //Results가 비어있지않으면
//                     calculator.getResults().remove(0);//가장 먼저 저장된 결과 삭제
                     System.out.println("가정 먼저 저장된 결과를 삭제했습니다");
//                 }else {
//                     System.out.println("저장된 결과가 없습니다.");
//                 }
             }
             System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
             String text2 = sc.next(); //메세지 입력창 생성
            if (Objects.equals(text2,"inquiry")){ //inquiry라고 쓴다면
                for (int resultvalue : calculator.getResults()){ // 향상된 for문
                    System.out.println(resultvalue);
                }
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

