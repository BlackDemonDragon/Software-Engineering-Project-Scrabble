package scrabble.exceptions;

public class InvalidInputException extends IllegalArgumentException{
    public  InvalidInputException(String s){
        super(s);
    }
}
