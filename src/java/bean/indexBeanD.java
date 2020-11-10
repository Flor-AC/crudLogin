package bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import static net.bootsfaces.component.ComponentsEnum.message;
import operaciones.Operaciones;
import operaciones.Operaciones_Service;
import operaciones.Departamento;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class indexBeanD extends operaciones.Departamento{
    
    private Operaciones_Service service;
    private Operaciones interfaz;
    private operaciones.Departamento dep;
    
    public indexBeanD(Long id, String departamento) {
        dep = new operaciones.Departamento();
        dep.setId(id);
        dep.setNombre(nombre);
    }
    
    public indexBeanD() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
    }

    @Override
    public void setId(long id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert() {
        if(interfaz.guardarDepartamento(dep)==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void update() {
        if(interfaz.actualizarDepartamento(dep)==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void delete() {
        if(interfaz.eliminarEmpleado((int)dep.getId())==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }

    public void find(Integer id) {
 
    }

    public void findAll() {
        
    }
    
}
