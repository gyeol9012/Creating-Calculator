package calculator;

import java.util.ArrayList;

class Calculator {
    private ArrayList<Integer> results = new ArrayList<>(); //private으로 설정하여 캡슐화
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
     public ArrayList<Integer> getResults(){ //Getter
        return new ArrayList<>(results); // 결과를 복사하여 반환(읽기 전용)
     }
     public void setResults(ArrayList<Integer> results){
        this.results =results;
    }
    public void removeResult(){
        if (!results.isEmpty()){
            results.remove(0); //가장 먼저 저장된 결과 삭제
        }
    }

}

