package calculator;

import java.util.ArrayList;

class Calculator {
    ArrayList<Integer> results = new ArrayList<>();
    public int calculate(int num1, int num2, char operator) throws ThrowException {
         int result;
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
                if (num2 == 0) {
                    throw new ThrowException("분모는 0이 될 수 없습니다.");
                } else {
                    result = num1/num2;
                }
                break;
             default:
                 throw new ThrowException("연산 기호를 확인 후 입력바랍니다.");
        }
            results.add(result);
            return result;

     }

    }

