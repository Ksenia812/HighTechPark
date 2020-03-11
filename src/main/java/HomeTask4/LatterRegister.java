import java.util.Scanner;

public class LatterRegister {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Input the line: " );

        String input = scanner.nextLine ();
        System.out.println ( leadToLowerCase ( input ) );
        System.out.println ( leadToUpperCase ( input ) );

    }

    public static char[] leadToLowerCase ( String input ) {

        char[] toLowerCase = new char[input.length ()];
        for ( int i = 0 ; i < input.length () ; i++ ) {
            if ( (int) input.charAt ( i ) >= 65 && (int) input.charAt ( i ) <= 90 ||  (int) input.charAt ( i ) >= 1040 && (int) input.charAt ( i ) <= 1071) {
                toLowerCase[i] = (char) ((int) input.charAt ( i ) + 32);
            }
            else{
                 toLowerCase[i] = input.charAt ( i );
            }
        }
        return toLowerCase;
    }
    public static char[] leadToUpperCase ( String input )
    {
        char[] toUpperCase = new char[input.length ()];
        for ( int i = 0 ; i < input.length () ; i++ ) {
            if ( (int) input.charAt ( i ) >= 97 && (int) input.charAt ( i ) <= 122  || (int) input.charAt ( i ) >= 1072 && (int) input.charAt ( i ) <= 1103 ) {
                toUpperCase[i] = (char) ((int) input.charAt ( i ) - 32);
            }
            else{
                toUpperCase[i] = input.charAt ( i );
            }
        }
        return toUpperCase;
    }
}






