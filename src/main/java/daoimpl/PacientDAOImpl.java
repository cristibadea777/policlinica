package main.java.daoimpl;

import main.java.dao.PacientDAO;
import main.java.pojo.Pacient;
import main.java.postgresql.JDBCPosgreSQLConexiune;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PacientDAOImpl implements PacientDAO {

    private static JDBCPosgreSQLConexiune jdbcPosgreSQLConexiune = new JDBCPosgreSQLConexiune();
    private static PacientDAOImpl pacientDAO = new PacientDAOImpl();

    @Override
    public Pacient getById(int id) throws SQLException {
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement("SELECT * FROM pacient WHERE pacientid = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                //Pacient(id, nume, prenume, varsta, nrtelefon, cnp, email, img, programari, fise_consultatii, rezultate_analize)
                Pacient pacient = new Pacient(
                        Long.parseLong(rs.getString(1)),
                        rs.getString(2),
                        rs.getString(3),
                        Long.parseLong(rs.getString(4)),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        null,
                        null,
                        null
                        //getAllProgramariPacient(9),
                        //getFiseConsultatiePacient(10),
                        //getRezultatAnalizePacient

                );
                return pacient;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public List<Pacient> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Pacient pacient) throws SQLException {

    }

    @Override
    public void delete(Pacient pacient) throws SQLException {

    }
}
