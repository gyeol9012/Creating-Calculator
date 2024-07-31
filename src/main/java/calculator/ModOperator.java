package calculator;

//나머지 연산자
public class ModOperator implements Operator {
    @Override
    public double operate(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("분모는 0이 될 수 없습니다.");
        }
        return num1 % num2;
    }
}