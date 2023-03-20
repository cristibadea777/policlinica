package main.java.daoimpl;

import main.java.dao.MedicDAO;
import main.java.pojo.FisaConsultatie;
import main.java.pojo.Medic;
import main.java.pojo.Programare;
import main.java.postgresql.JDBCPosgreSQLConexiune;
import main.java.pojo.Specializare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicDAOImpl implements MedicDAO {

    private static JDBCPosgreSQLConexiune jdbcPosgreSQLConexiune = new JDBCPosgreSQLConexiune();

    @Override
    public Medic getById(int id) throws SQLException {
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement("SELECT * FROM medic WHERE medicid = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                //Medic(id medic, nume, prenume, varsta, nrtelefon, cnp, email, img, specializari, fise_consultatie, programari)
                Medic medic = new Medic(
                        id,
                        rs.getString(2),
                        rs.getString(3),
                        Long.parseLong(rs.getString(4)),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        getSpecializariMedic(id),
                        getFiseConsultatieMedic(id),
                        getProgramariMedic(id)
                );
                return medic;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Specializare> getSpecializariMedic(int id){
        List<Specializare> listaSpecializari = new ArrayList<Specializare>();
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement(
                    "SELECT * FROM medic_specializari " +
                            "INNER JOIN specializare " +
                            "ON medic_specializari.specializareid = specializare.specializareid " +
                            "WHERE medic_specializari.medicid = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //nume specializare
                Specializare specializare = new Specializare(
                        rs.getString(4)
                );
                listaSpecializari.add(specializare);
            }
            return listaSpecializari;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<FisaConsultatie> getFiseConsultatieMedic(int id){
        List<FisaConsultatie> listaFiseConsultatii = new ArrayList<FisaConsultatie>();
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement(
                    "SELECT * FROM fisaconsultatie WHERE medicid = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //fise consultatie
                //id fisa, pacient, medic, diagnostic
                FisaConsultatie fisaConsultatie = new FisaConsultatie(
                        Long.parseLong(rs.getString(1)),
                        Long.parseLong(rs.getString(2)),
                        Long.parseLong(rs.getString(3)),
                        rs.getString(4),
                        null,
                        null
                );
                listaFiseConsultatii.add(fisaConsultatie);
            }
            return listaFiseConsultatii;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Programare> getProgramariMedic(int id){
        List<Programare> listaProgramari = new ArrayList<Programare>();
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement("SELECT * FROM programare WHERE medicid = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //programari
                //id programare, pacient, medic, diagnostic
                Programare programare = new Programare(
                        Long.parseLong(rs.getString(1)),
                        Long.parseLong(rs.getString(2)),
                        Long.parseLong(rs.getString(3)),
                        Long.parseLong(rs.getString(4)),
                        rs.getDate(5),
                        rs.getString(6)
                );
                listaProgramari.add(programare);
            }
            return listaProgramari;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Medic> getAll() throws SQLException {
        List<Medic> listaMedici = new ArrayList<Medic>();
        try {
            Connection connection = jdbcPosgreSQLConexiune.getConexiune();
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = connection.prepareStatement("SELECT * FROM medic");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //Medic(id medic, nume, prenume, varsta, nrtelefon, cnp, email, img, specializari, fise_consultatie, programari)
                Medic medic = new Medic(
                        Long.parseLong(rs.getString(1)),
                        rs.getString(2),
                        rs.getString(3),
                        Long.parseLong(rs.getString(4)),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        getSpecializariMedic(5),
                        getFiseConsultatieMedic(5),
                        null
                );
                listaMedici.add(medic);
            }
            return listaMedici;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Medic medic) throws SQLException {
        Connection connection = jdbcPosgreSQLConexiune.getConexiune();
        PreparedStatement pstmt;
        ResultSet rs;
        pstmt = connection.prepareStatement("INSERT INTO medic (nume, prenume, varsta, nrtelefon, cnp, email, img) " +
                                                        "VALUES (?, ?, ?, ?, ?, ?, ?)");
        pstmt.setString(1, medic.getNume());
        pstmt.setString(2, medic.getPrenume());
        pstmt.setLong(3, medic.getVarsta());
        pstmt.setString(4, medic.getNrtelefon());
        pstmt.setString(5, medic.getCnp());
        pstmt.setString(6, medic.getEmail());
        pstmt.setString(7, medic.getImg());
        pstmt.execute();
    }

    @Override
    public void delete(Medic medic) throws SQLException {
        Connection connection = jdbcPosgreSQLConexiune.getConexiune();
        PreparedStatement pstmt;
        ResultSet rs;
        pstmt = connection.prepareStatement(
                "DELETE FROM medic WHERE medic.medicid = ?");
        pstmt.setLong(1, medic.getMedicId());
        pstmt.execute();
    }
}
