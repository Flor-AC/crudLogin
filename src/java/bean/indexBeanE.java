//package bean;
//
//import services.Crud;
//import services.Crud_Service;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean
//@RequestScoped
//public class indexBeanE extends Empleado {
//
//    private services.Empleado emp;
//    private Crud_Service service;
//    private Crud interfaz;
//
//    public indexBeanE(String id, String nombre, String direccion, String telefono) {
//        super(id, nombre, direccion, telefono);
//    }
//    
//    public indexBeanE() {
//        service = new Crud_Service();
//        interfaz = service.getCrudPort();
//    }
//
//    @Override
//    public void setId(String id) {
//        emp.setID(id);
//        super.setId(id); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setNombre(String nombre) {
//        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setDireccion(String direccion) {
//        super.setDireccion(direccion); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setTelefono(String telefono) {
//        super.setTelefono(telefono); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    public void insert() {
//        emp = new services.Empleado();
//        empleado = new Empleado(getId(), getNombre(), getDireccion(), getTelefono());
//        empleadoDao.insert(empleado);
//        
//    }
//
//    public void update() {
//        empleado = new Empleado(getId(), getNombre(), getDireccion(), getTelefono());
//        empleadoDao.update(empleado);
//    }
//
//    public void delete() {
//        empleado = new Empleado(getId(), getNombre(), getDireccion(), getTelefono());
//        empleadoDao.delete(Integer.parseInt(empleado.getId()));
//    }
//
//    public void find(Integer id) {
// 
//    }
//
//    public void findAll() {
//        
//    }
//    
//}
