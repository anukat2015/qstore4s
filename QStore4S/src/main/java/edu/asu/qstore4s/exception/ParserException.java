package edu.asu.qstore4s.exception;


/**
 * @author Bhargav Desai
 * This is exception class which is used to throw different parsing exception of XML provide by user. 
 */

public class ParserException extends Exception {
	
	public ParserException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }

    private static final long serialVersionUID = 2957019437292932505L;
	
	public ParserException(){super();}
	
	public ParserException(String exception){super(exception);}
	

}
