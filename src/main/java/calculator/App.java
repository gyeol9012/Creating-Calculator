package calculator;

import java.util.Objects;
import java.util.Scanner;
//
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            System.out.println("operator = " + operator);
            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("연산 기호를 확인 후 입력바랍니다.");
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");// 계산식 중단 메세지
            String text = sc.next(); //메세지 입력창 생성
            if(Objects.equals(text, "exit")) { // exit 와 같은지 확인
                break; // 같으면 즉시 중단
            }
            /* exit을 입력 받으면 반복 종료 */
        }
    }
}