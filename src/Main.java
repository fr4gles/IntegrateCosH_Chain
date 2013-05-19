/**
 * Głowna klasa do przekazania argumentów
 * @author Michal
 */
public class Main
{
    /**
     * main
     * @param args argumenty
     */
    public static void main(String[] args)
    {
        double a = 0.0;
        if(args.length > 1)
        {
            try
            {
                a = Double.parseDouble(args[1]);
            }
            catch(Exception e)
            {
                HandleUnexpected(args);
            }
        }
        else
            a = 10.0;
        
        Chain c = new Chain();
        
        System.out.println("Przepustowość : " + String.format("%.5f", c.ObliczCalkeOdZeraDo(a)).replace(",", "."));
    }

    /**
     * jakby sie jakis blad pojawil
     * @param args argumenty
     * @return wartosc
     */
    private static double HandleUnexpected(String[] args)
    {
        double a = 0.0;
        try
        {
            a = Double.parseDouble(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("Oto parametry: "+args.toString());
        }
        return a;
    }
}
