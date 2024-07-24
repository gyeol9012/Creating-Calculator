package calculator;

import java.util.Scanner;
//switch case: break; default: 형식으로 이루어져 있음

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        System.out.println("operator = " + operator);
        int result = 0;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
              if( num2==0){
                  System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");}
                else { result = num1/num2;}
                break;
            default:
                System.out.println("연산 기호를 확인 후 입력바랍니다.");
        }
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
    }
}




