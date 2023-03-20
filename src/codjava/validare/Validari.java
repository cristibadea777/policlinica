package codjava.validare;

import codjava.postgresql.JDBCPosgreSQLConexiune;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validari {

    private static JDBCPosgreSQLConexiune jdbcPosgreSQLConexiune = new JDBCPosgreSQLConexiune();

    //doar numere
    public static boolean contineDoarNumere(String input){
        return input.matches("^[0-9]+$");
    }
    //doar litere
    public static boolean contineDoarLitere(String input){
        return input.matches("[a-zA-Z]+");
    }
    //tip long
    public static boolean esteNumar(String input){
        try{
            long l = Long.parseLong(input);
        }catch (NumberFormatException  nfe){
            return false;
        }
        return true;
    }
    //tip Date
    public static boolean esteData(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        //dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    //unicitate
    public static boolean esteEmailUnic(String input){
        String value_pacient = " ";
        String value_medic = " ";
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;

            pstmt = connection.prepareStatement("SELECT COUNT(*) FROM pacient WHERE email = ?");
            pstmt.setString(1,input);
            rs = pstmt.executeQuery();
            if(rs.next())
                value_pacient = rs.getString(1);

            pstmt = connection.prepareStatement("SELECT COUNT(*) FROM medic WHERE email = ?");
            pstmt.setString(1,input);
            rs = pstmt.executeQuery();
            if(rs.next())
                value_medic = rs.getString(1);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return value_pacient.equals("0") && value_medic.equals("0");

    }

    public static boolean esteCNPUnic(String input){
        String value_pacient = " ";
        String value_medic = " ";
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;

            pstmt = connection.prepareStatement("SELECT COUNT(*) FROM pacient WHERE cnp = ?");
            pstmt.setString(1,input);
            rs = pstmt.executeQuery();
            if(rs.next())
                value_pacient = rs.getString(1);

            pstmt = connection.prepareStatement("SELECT COUNT(*) FROM medic WHERE cnp = ?");
            pstmt.setString(1,input);
            rs = pstmt.executeQuery();
            if(rs.next())
                value_medic = rs.getString(1);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return value_pacient.equals("0") && value_medic.equals("0");
    }

    public static boolean esteCodUnic(String input){
        String value_cod = " ";
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;

            pstmt = connection.prepareStatement("SELECT COUNT(*) FROM rezultatanaliza WHERE cod = ?");
            pstmt.setString(1,input);
            rs = pstmt.executeQuery();
            if(rs.next())
                value_cod = rs.getString(1);

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return value_cod.equals("0");
    }

    //obligativitate
    public static boolean nuEsteGol(String input){
        return ! input.isBlank() && ! input.isEmpty();
    }

}
