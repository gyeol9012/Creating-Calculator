package calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
//
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//연산결과를 무한히 저장할 수 있는 리스트생성
        Scanner sc = new Scanner(System.in);

         while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            int result = 0;
            boolean validOperation = true; //연산이 유효한지 확인하는 변수

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
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("연산 기호를 확인 후 입력바랍니다.");
                    validOperation = false;
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
           if(validOperation) { //validOperation이 true이면(연산오류가 없으면)
               System.out.println("결과: " + result);
               list.add(result); //리스트에 결과값 저장
               System.out.println("현재 저장된 결과는 " + list.size() + "개 입니다");
           }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료,remove 입력 시 먼저 입력된 결과 삭제)");// 계산식 중단 메세지
            String text = sc.next(); //메세지 입력창 생성
            if(Objects.equals(text, "exit")) { // exit 와 같은지 확인
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("저장된 결과 " + i + ": " + list.get(i));
                }
                break; // 같으면 즉시 중단
            }
            if (Objects.equals(text,"remove")){//remove라고 쓴다면
                    if (!list.isEmpty()) { //list가 비어있지않으면
                        list.remove(0);//가장 먼저 저장된 결과 삭제
                        System.out.println("가정 먼저 저장된 결과를 삭제했습니다");
                    }else {
                        System.out.println("저장된 결과가 없습니다.");
                    }
            }


        }
    }
}