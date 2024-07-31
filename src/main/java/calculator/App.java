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

        Calculator calculator = new Calculator(initialResults);


        Scanner sc = new Scanner(System.in);



         while(true) {
             System.out.println("원하는 계산방식을 선택하세요 : 1) 사칙연산 2)원의 넓이 계산");
             int choice = sc.nextInt();
             if (choice == 1) {
                 System.out.print("첫 번째 숫자를 입력하세요: ");
                 int num1 = sc.nextInt();
                 System.out.print("두 번째 숫자를 입력하세요: ");
                 int num2 = sc.nextInt();
                 System.out.println("사칙연산 기호를 입력하세요: ");
                 char operator = sc.next().charAt(0);
                 boolean validOperation = true;
                 int result;

                 try {
                     result = calculator.calculate(num1, num2, operator);
                     System.out.println("결과: " + result);
                 } catch (ThrowException e) {
                     System.out.println(e.getMessage());
                     validOperation = false;
                 }
                 if (validOperation) {
                     // 결과값이 이미 리스트에 저장됨
                 }
             } else if (choice == 2) {
                 System.out.println("원의 반지름을 입력하세요:");
                 double radius = sc.nextDouble();
                 double area = calculator.calculateCircleArea(radius);
                 System.out.println("원의 넓이: " + area);
             } else {
                 System.out.println("잘못된 선택입니다.");
                 continue;
             }
             System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
             String text1 = sc.next();
             if (Objects.equals(text1,"remove")){
                     calculator.removeResult();
                     System.out.println("가장 먼저 저장된 결과를 삭제했습니다");
             }
             System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
             String text2 = sc.next();
            if (Objects.equals(text2,"inquiry")){
            }

             System.out.println("저장된 원의 넓이 결과를 조회하시겠습니까? (circleInquiry 입력 시 조회)");
            String text3 = sc.next();
            if (Objects.equals(text3,"circleInquiry")){
                calculator.inquiryCircleAreas();
            }

             System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text4 = sc.next();
            if(Objects.equals(text4, "exit")) {
                break;
            }
        }
         sc.close();
    }
}

