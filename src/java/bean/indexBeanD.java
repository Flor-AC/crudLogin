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
    private Departamento dep;
    
    
    public indexBeanD() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
        dep=new Departamento();
    }

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }
    
    
    public void insert() {
        if(interfaz.guardarDepartamento(dep)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }

    public void update() {
        if(interfaz.actualizarDepartamento(dep)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }

    public void delete() {
        if(interfaz.eliminarEmpleado((int)dep.getId())==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }

    public void find(Integer id) {
 
    }

    public void findAll() {
        
    }
    
}
