// ITI1120:  difference between println and print

class Prog4
{
    public static void main (String[] args)
    {
        // In the following, println is used both times
        
        System.out.println("Message 1");
        System.out.println("Message 2");

        // The following is used to print a blank line.

        System.out.println( );

        // In the following, print is used for the first message,
        // and println is used for the second message.

        System.out.print("Message 1");
        System.out.println("Message 2");

        // What happens if you use print both times?  Try it!
                
   }

}
