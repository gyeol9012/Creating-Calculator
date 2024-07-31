package calculator;

// 나눗셈 연산자
public class DivideOperator implements Operator {
    @Override
    public double operate(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("분모는 0이 될 수 없습니다.");
        }
        return (double) num1 / num2;
    }
}
