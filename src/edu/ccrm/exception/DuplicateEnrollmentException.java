package edu.ccrm.exception;

public class DuplicateEnrollmentException extends Exception {


    public DuplicateEnrollmentException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return "DuplicateEnrollmentException -> ";
    }
}
