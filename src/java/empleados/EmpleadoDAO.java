package empleados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectionDB;

public class EmpleadoDAO implements IdaoE<Empleado, Integer> {
    
    @Override
    public Empleado insert(Empleado entidad) {
        String sql = "INSERT INTO empleados(id, nombre,direccion,telefono) VALUES(" +
                entidad.getId() + ",'" +
                entidad.getNombre() + "','" +
                entidad.getDireccion() + "','" +
                entidad.getTelefono() + "') ";
        return ConnectionDB.getInstance().execute(sql) ? entidad : null;
    }

    @Override
    public Empleado update(Empleado entidad) {
        String sql = "UPDATE empleados SET "
                + "nombre = '" + entidad.getNombre() + "', "
                + "direccion = '" + entidad.getDireccion() + "', "
                + "telefono = '" + entidad.getTelefono() + "' WHERE id = " + entidad.getId();
        return ConnectionDB.getInstance().execute(sql) ? entidad : null;
    }

    @Override
    public boolean delete(Integer id) {
        return ConnectionDB.getInstance().execute("DELETE FROM empleados WHERE id = '" + id + "'");
    }

    @Override
    public Empleado find(Integer id) {
        Empleado empleado = null;
        try{
            ResultSet rs = ConnectionDB.getInstance().executeQuery("SELECT * FROM empleados WHERE id = '" + id + "'");
            if(rs.next()){
                empleado = new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<>();
        try{
            ResultSet rs = ConnectionDB.getInstance().executeQuery("SELECT * FROM empleados");
            while(rs.next()){
                empleados.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch(SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleados;
    }

    
    
}
