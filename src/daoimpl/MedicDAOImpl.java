package daoimpl;

import dao.MedicDAO;
import pojo.Medic;

import java.sql.SQLException;
import java.util.List;

public class MedicDAOImpl implements MedicDAO {
    @Override
    public Medic getById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Medic> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Medic medic) throws SQLException {

    }

    @Override
    public void delete(Medic medic) throws SQLException {

    }
}
