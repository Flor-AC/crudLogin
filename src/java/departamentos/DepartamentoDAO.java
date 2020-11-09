package departamentos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectionDB;

public class DepartamentoDAO implements IdaoD<Departamento, Integer>{
    
    @Override
    public Departamento insert(Departamento entidad) {
        String sql = "INSERT INTO departamentos(id, departamento) VALUES(" +
                entidad.getId() + ",'" +
                entidad.getDepartamento()+ "') ";
        return ConnectionDB.getInstance().execute(sql) ? entidad : null;
    }

    @Override
    public Departamento update(Departamento entidad) {
        String sql = "UPDATE departamentos SET "
                + "departamento = '" + entidad.getDepartamento()+ "' WHERE id = " + entidad.getId();
        return ConnectionDB.getInstance().execute(sql) ? entidad : null;}

    @Override
    public boolean delete(Integer id) {
        return ConnectionDB.getInstance().execute("DELETE FROM departamentos WHERE id = '" + id + "'");
    }

    @Override
    public Departamento find(Integer id) {
        Departamento departamento = null;
        try{
            ResultSet rs = ConnectionDB.getInstance().executeQuery("SELECT * FROM departamentos WHERE id = '" + id + "'");
            if(rs.next()){
                departamento = new Departamento(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departamento;
    }

    @Override
    public List<Departamento> findAll() {
        List<Departamento> departamentos = new ArrayList<>();
        try{
            ResultSet rs = ConnectionDB.getInstance().executeQuery("SELECT * FROM departamentos");
            while(rs.next()){
                departamentos.add(new Departamento(rs.getString(1), rs.getString(2)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departamentos;
    }
    
}
