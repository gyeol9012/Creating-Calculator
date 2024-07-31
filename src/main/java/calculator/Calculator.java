package calculator;

import java.util.ArrayList;

public class Calculator {
    protected ArrayList<Double> results;
    protected ArrayList<Double> circleAreas;

    public Calculator(ArrayList<Double> initialResults) {
        this.results = new ArrayList<>(initialResults);
        this.circleAreas = new ArrayList<>();
    }

    public double calculate(int num1, int num2, char operator) throws ThrowException {
        throw new UnsupportedOperationException("이 메서드는 하위 클래스에서 구현해야 합니다.");
    }

    public double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        double area = PI * radius * radius;
        circleAreas.add(area);
        return area;
    }

    public ArrayList<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(ArrayList<Double> results) {
        this.results = new ArrayList<>(results);
    }

    public ArrayList<Double> getCircleAreas() {
        return new ArrayList<>(circleAreas);
    }

    public void setCircleAreas(ArrayList<Double> circleAreas) {
        this.circleAreas = new ArrayList<>(circleAreas);
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    public void inquiryResults() {
        System.out.println("저장된 연산 결과들:");
        for (double result : results) {
            System.out.println(result);
        }
    }

    public void inquiryCircleAreas() {
        System.out.println("저장된 원의 넓이 결과들:");
        for (double area : circleAreas) {
            System.out.println(area);
        }
    }
}

