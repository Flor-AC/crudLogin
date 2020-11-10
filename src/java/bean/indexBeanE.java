package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import static net.bootsfaces.component.ComponentsEnum.message;
import operaciones.Operaciones;
import operaciones.Operaciones_Service;
import operaciones.Empleados;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class indexBeanE extends operaciones.Empleados {

    private Operaciones_Service service;
    private Operaciones interfaz;
    private operaciones.Empleados emp;

    public indexBeanE(String usuario,String password) {
        emp = new operaciones.Empleados();
        emp.setNombre(nombre);
        emp.setDireccion(nombre);
        emp.getTelefono();
    }
    
    public indexBeanE() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
    }


    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert() {
        if(interfaz.guardarEmpleado(emp)==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void update() {
        if(interfaz.actualizarEmpleado(emp)==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void delete() {
        if(interfaz.eliminarEmpleado((int)emp.getId())==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void find(Integer id) {
 
    }

    public void findAll() {
        
    }
    
}
