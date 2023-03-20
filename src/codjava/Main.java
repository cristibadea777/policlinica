package codjava;

import codjava.pojo.Programare;
import codjava.daoimpl.MedicDAOImpl;
import codjava.daoimpl.PacientDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static MedicDAOImpl     medicDAO    = new MedicDAOImpl();
    private static PacientDAOImpl   pacientDAO  = new PacientDAOImpl();

    public static void main(String[] args) {

        try{
            //lista programari medic id 5
            List<Programare> programareArrayList = new ArrayList<Programare>();
            programareArrayList = medicDAO.getProgramariMedic(5);
            for(int i = 0; i<programareArrayList.size(); i++)
                System.out.println(programareArrayList.get(i).toString());
            //selectare pacient id 5
            System.out.println(pacientDAO.getById(5).toString());
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}