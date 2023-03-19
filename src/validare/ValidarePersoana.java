package validare;

import postgresql.JDBCPosgreSQLConexiune;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static validare.Validari.*;

public class ValidarePersoana {

    private JDBCPosgreSQLConexiune jdbcPosgreSQLConexiune = new JDBCPosgreSQLConexiune();

    private List<String> listaEmail = new ArrayList<>();
    private List<String> listaCNP = new ArrayList<>();


    //validare nume, prenume
    public  boolean esteValidNume(String input){
        return nuEsteGol(input) && contineDoarLitere(input);
    }


    //validare CNP
    public boolean esteValidCNP(String input) {
        try (Connection connection = jdbcPosgreSQLConexiune.getConexiune();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT cnp FROM medic")) {

            while(resultSet.next()) {
                String value = resultSet.getString("cnp");
                listaCNP.add(value);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return nuEsteGol(input) && contineDoarNumere(input) && input.length() == 13 && esteUnic(listaCNP, input);
    }


    //validare varsta
    public  boolean esteValidVarsta(String input){
        return nuEsteGol(input) && esteNumar(input) && Long.parseLong(input) >= 0 && Long.parseLong(input) <= 120;
    }
    //validare telefon
    public boolean esteValidTelefon(String input){
        return nuEsteGol(input) && contineDoarNumere(input);
    }
    //validate email
    public  boolean esteValidEmail(String input){
        try (Connection connection = jdbcPosgreSQLConexiune.getConexiune();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT email FROM medic")) {

            while(resultSet.next()) {
                String value = resultSet.getString("email");
                listaEmail.add(value);
                System.out.println(value);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return nuEsteGol(input) && input.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") && esteUnic(listaEmail, input);
    }


}
