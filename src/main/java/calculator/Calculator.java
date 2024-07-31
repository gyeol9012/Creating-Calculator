package calculator;

import java.util.ArrayList;

public class Calculator{
    private ArrayList<Double> results;
    private ArrayList<Double> circleAreas; //원의 넓이 결과를 저장하는 리스트


    //생성자 : 초기 연산 결과 리스트를 작성
    public Calculator(ArrayList<Double> initialResults) {
        this.results =new ArrayList<>(initialResults);
        this.circleAreas = new ArrayList<>(); //원의 넓이 결과 리스트 초기화
    }
    public double calculate(int num1, int num2, char operator) throws ThrowException {
         double result;
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
     public double calculateCircleArea(double radius){
        final double PI = 3.14159; //원주율은 변하지 않는 상수이므로 final 키워드 사용
        double area = PI *radius*radius;
        circleAreas.add(area); //계산된 원의 넓이를 리스트에 추가
         return  area;
     }
     public ArrayList<Double> getResults(){
        return new ArrayList<>(results);
     }
     public void setResults(ArrayList<Double> results){
        this.results =new ArrayList<>(results);
    }
    public ArrayList<Double> getcircleAreas(){ //gtter
        return new ArrayList<>(circleAreas); //결과를 복사하여 반환(읽기전용)
    }
    public void setCircleAreas(ArrayList<Double> circleAreas){
        this.circleAreas = new ArrayList<>(circleAreas); //복사본을 만들어 할당
    }


    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
    public void inquiryResults(){
        System.out.println("저장된 연산 결과들:");
        for (double result : results) {
            System.out.println(result);
        }
    }
    public void inquiryCircleAreas(){
        System.out.println("저장된 원의 넓이 결과들:");
        for (double area : circleAreas){
            System.out.println(area);
        }
    }
}
