import java.text.NumberFormat;
import java.text.ParseException;

import static java.text.NumberFormat.getInstance;

public class ExemploExcessao {

    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
