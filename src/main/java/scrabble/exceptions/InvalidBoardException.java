package scrabble.exceptions;

/**
 * Custom Exception for Board Class
 */
public class InvalidBoardException extends IllegalArgumentException{
    public  InvalidBoardException(String s){
        super(s);
    }
}