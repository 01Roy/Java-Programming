class InvaildInputException extends Exception {

    public String toString() {
        return "You can not use 8 and 9";
    }

    public String getMessage() {
        return "I am getmessage()";
    }
}

class canNotDivideByZeroException extends Exception {

    public String toString() {
        return "Can nor divide by zero";
    }

    public String getMessage() {
        return "I am getmessage()";
    }
}

class maxInputException extends Exception {

    public String toString() {
        return "this is maxInputException";
    }

    public String getMessage() {
        return "I am getmessage()";
    }
}

class CustomeCalculator {
    double sum(double a, double b) throws InvaildInputException, maxInputException {
        if (a == 100000 || b == 100000) {
            throw new maxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvaildInputException();
        }
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double div(double a, double b) throws canNotDivideByZeroException, maxInputException {
        if (a == 100000 || b == 100000) {
            throw new maxInputException();
        }
        if (b == 0) {
            throw new canNotDivideByZeroException();
        }
        return a / b;
    }
}

public class Class103CustomeCalcu {
    public static void main(String[] args)
            throws InvaildInputException, canNotDivideByZeroException, maxInputException {
        CustomeCalculator c1 = new CustomeCalculator();
        c1.div(100000, 89);
    }
}
