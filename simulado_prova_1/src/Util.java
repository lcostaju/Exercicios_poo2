import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    public static String formatarMoeda(Double salario){
        Locale localeBR = Locale.of("pt", "BR");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(localeBR);
        return formatter.format(salario);
    }
}
