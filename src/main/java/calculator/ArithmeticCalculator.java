package calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {
    private Map<Character, Operator> operators;

    public ArithmeticCalculator(ArrayList<Double> initialResults) {
        super(initialResults);
        operators = new HashMap<>();
        // 기본 연산자 등록
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

    public void addOperator(char symbol, Operator operator) {
        operators.put(symbol, operator);
    }

    @Override
    public double calculate(int num1, int num2, char operator) throws ThrowException {
        Operator op = operators.get(operator);
        if (op == null) {
            throw new ThrowException("연산 기호를 확인 후 입력바랍니다.");
        }
        double result = op.operate(num1, num2);
        results.add(result);
        return result;
    }

    @Override
    public void inquiryResults() {
        super.inquiryResults();
    }
}
