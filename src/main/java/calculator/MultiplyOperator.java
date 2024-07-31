package calculator;

// 곱셈 연산자
public class MultiplyOperator implements Operator {
    @Override
    public double operate(int num1, int num2) {
        return num1 * num2;
    }
}
