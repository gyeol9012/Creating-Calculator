package calculator;

import java.util.Scanner;
//사칙연산 기호는 String도 가능하지만 char를 이용하여 sc.next().charAt(0); 사용하여 구현
//charAt(0) 사칙연산기호로 변경해줌 0= 첫번째
//next()는 striong 에 사용되지만 .charAt()을 통해 char 로 반환가능

public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                System.out.println("operator = " + operator);

            }
        }


