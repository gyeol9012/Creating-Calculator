package calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Double> initialResults = new ArrayList<>();
        initialResults.add(100.0);
        initialResults.add(200.0);

        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(initialResults);
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        while (true) {
            System.out.println("원하는 계산 방식을 선택하세요: 1) 사칙연산 2) 원의 넓이 계산");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                try {
                    double result = arithmeticCalculator.calculate(num1, num2, operator);
                    System.out.println("결과: " + result);
                } catch (ThrowException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String text1 = sc.next();
                if (Objects.equals(text1, "inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }
            } else if (choice == 2) {
                System.out.println("원의 반지름을 입력하세요:");
                double radius = sc.nextDouble();
                double area = circleCalculator.calculateCircleArea(radius);
                System.out.println("원의 넓이: " + area);

                System.out.println("저장된 원의 넓이 결과를 조회하시겠습니까? (circleInquiry 입력 시 조회)");
                String text2 = sc.next();
                if (Objects.equals(text2, "circleInquiry")) {
                    circleCalculator.inquiryCircleAreas();
                }
            } else {
                System.out.println("잘못된 선택입니다.");
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text4 = sc.next();
            if (Objects.equals(text4, "exit")) {
                break;
            }
        }
        sc.close();
    }
}
