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
public class indexBeanE {

    private Operaciones_Service service;
    private Operaciones interfaz;
    private Empleados emp;
    
    public indexBeanE() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
        emp=new Empleados();
    }

    public Empleados getEmp() {
        return emp;
    }

    public void setEmp(Empleados emp) {
        this.emp = emp;
    }
  

    public void insert() {     
        if(interfaz.guardarEmpleado(emp)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }

    public void update() {
        if(interfaz.actualizarEmpleado(emp)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }

    public void delete() {
        if(interfaz.eliminarEmpleado((int)emp.getId())==true){
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
