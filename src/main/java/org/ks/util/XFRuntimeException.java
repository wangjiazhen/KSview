package org.ks.util;

public class XFRuntimeException extends RuntimeException {
	
	private static final long serialVersionUID = 5439915454935047937L;

    public XFRuntimeException(String msg){
        super(msg);
    }
    public XFRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
