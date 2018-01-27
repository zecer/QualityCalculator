package pl.edu.agh.qualitycalculator;

public class CalculationsVerbalizer {

    public String verbalize(Operation operation, float operand1, float operand2, float operand3, float result) {
        if (String.valueOf(operation) == "Average of") {
            String verbalizedOperation = operation.toString() + " ";
            verbalizedOperation += String.valueOf(operand1) + ", ";
            verbalizedOperation += String.valueOf(operand2) + ", ";
            verbalizedOperation += String.valueOf(operand3);
            verbalizedOperation += " gives value ";
            verbalizedOperation += String.valueOf(result);
            return verbalizedOperation;
        } else {
            String verbalizedOperation = String.valueOf(operand1);
            verbalizedOperation += " " + operation.toString() + " ";
            verbalizedOperation += String.valueOf(operand2);
            verbalizedOperation += " gives value ";
            verbalizedOperation += String.valueOf(result);
            return verbalizedOperation;
        }
    }
}
