package daoimpl;

import dao.PacientDAO;
import pojo.Pacient;

import java.sql.SQLException;
import java.util.List;

public class PacientDAOImpl implements PacientDAO {
    @Override
    public Pacient getById(int id) throws SQLException {
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
