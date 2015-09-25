public class HourSheet {
       private int placenr;

       private void chechdop ()
	  throws DateOtPlaceError
	{
             
    
	try {
          chechdop() ;
	} catch (DateOtPlaceError dope ) {
	   System.err.println ("This place or date is already used." );
	   System.exit(1) ;
       }
       }
}