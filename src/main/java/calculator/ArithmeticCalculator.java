package calculator;

import javax.swing.*;
import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private Operator addOperator;
    private Operator subtractOperator;
    private Operator multiplyOperator;
    private Operator divideOperator;

    // 생성자
    public ArithmeticCalculator(ArrayList<Double> initialResults) {
        super(initialResults);
        // 연산자 초기화
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    @Override
    public double calculate(int num1, int num2, char operator) throws ThrowException {
        double result;
        switch (operator) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                result = divideOperator.operate(num1, num2);
                break;
            default:
                throw new ThrowException("연산 기호를 확인 후 입력바랍니다.");
        }
        results.add(result);
        return result;
    }

    @Override
    public void inquiryResults() {
        super.inquiryResults();
    }
}

