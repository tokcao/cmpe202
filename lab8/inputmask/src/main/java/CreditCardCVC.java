/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 )
				cvc += ch.substring(20);
			else if ( nextHandler != null )
				cvc += ch.substring(19,23);
		}
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}