import pojo.Medic;
import postgresql.JDBCPosgreSQLConexiune;
import validare.ValidarePersoana;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.

        Medic medic1 = new Medic();
        medic1.setCnp("12345678901234");
        medic1.setNume("A");
        medic1.setPrenume("Ion");
        medic1.setEmail("aaaa546@gmail.com");
        medic1.setNrtelefon("3573777");
        medic1.setVarsta(27);
        ValidarePersoana validarePersoana = new ValidarePersoana();

        List lista = new ArrayList();
        lista.add("1234567890124");

        System.out.println(validarePersoana.esteValidCNP(medic1.getCnp()));

        JDBCPosgreSQLConexiune conexiune = new JDBCPosgreSQLConexiune();
        conexiune.conectare();

    }
}