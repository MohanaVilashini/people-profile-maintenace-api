package com.people.profiles.exception;

public class PersonNotExistException extends RuntimeException {
    public PersonNotExistException(String message) {
        super(message);
    }
}
