package edu.ccrm.exception;

public class MaxCreditLimitExceededException extends Exception{
    public MaxCreditLimitExceededException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "MaxCreditLimitExceededException ->";
    }
}
