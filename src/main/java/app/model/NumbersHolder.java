package app.model;

import java.util.List;

public class NumbersHolder {
    private List<Integer> numbers;
    private String order;

//    public NumbersHolder() {
//        this.numbers = new int[] {1, 5, 3, 9, 7};
//        this.typeOfSort = "ASC"; //"DESC"
//    }
//
//    public String numbersSort() {
//        if (numbers != null) {
//            if (typeOfSort.equals("ASC")) {
//                return "numbers: ";
//            } else if (typeOfSort.equals("DESC")) {
//                return "numbers: ";
//            } else {
//                throw new WrongTypeException(typeOfSort);
//            }
//        } else {
//            return "numbers: null";
//        }
//    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
