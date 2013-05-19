
import java.util.Random;

/**
 * oblicanie calki
 * @author Michal
 */
public class Chain
{
    /**
     * funkcja dla ktorej obliczamy calke
     * @param a a
     * @param x x
     * @return wartsco calki 
     */
    private static double CalkaCalceNierownaAleOblicz(double a, double x) 
    {
        return a * Math.cosh(x/a);
    }

    /**
     * losowy numer od a do b
     * @param a a
     * @param b b
     * @return losowy numer od a do b
     */
    private static double WysolujPunktZPrzedzialu(double a, double b) 
    {
        return  a + Math.random() * (b-a);
    }  
    
    /**
     * właściwe obliczanie wartoci calki
     * @param a a
     * @return wartosc calki
     */
    public double ObliczCalkeOdZeraDo(double a)
    {
        double  calka = 0.0, 
        dokladnyWynikCalki = a * a * 1.1752011936438014568823818505955; // a^2 * sinh(1)
        
        calka+=CalkaCalceNierownaAleOblicz(a, WysolujPunktZPrzedzialu(0.0, a)); 
        
        int n = 1;
        while(n<2500300 && Math.abs( a*calka/(double)n - dokladnyWynikCalki )>0.000001)
        {
            calka+=CalkaCalceNierownaAleOblicz(a, WysolujPunktZPrzedzialu(0.0, a)); 
            ++n;
        }
        return a*calka/(double)n;
    }
}
