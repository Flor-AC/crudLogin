package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import static net.bootsfaces.component.ComponentsEnum.message;
import operaciones.Operaciones;
import operaciones.Operaciones_Service;
import operaciones.Usuario;

/**
 *
 * @author victorm
 */
@ManagedBean
@SessionScoped
public class indexBeanUsr extends operaciones.Usuario{
    private Operaciones_Service service;
    private Operaciones interfaz;
    private Usuario usr;

    /**
     * Creates a new instance of indexBeanUsr
     */

    public indexBeanUsr() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
        usr=new Usuario();
    }

    
    public void insert() {
        if(interfaz.guardarUsuario(usr)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
    }
    
    public void updatePassword() {
        if(interfaz.actualizarPassword(usr)==true){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Succesful", "Operacion exitosa"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Operacion fallida"));
        }
            
    }
    
    public void finUser() {
        interfaz.buscarUsuario(usr.getUsuario());  
    }
}
