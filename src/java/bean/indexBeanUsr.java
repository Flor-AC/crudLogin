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
    private operaciones.Usuario usr;

    /**
     * Creates a new instance of indexBeanUsr
     */
    public indexBeanUsr(String usuario,String password) {
        usr = new operaciones.Usuario();
        usr.setUsuario(usuario);
        usr.setPassword(usuario);
    }
    
    public indexBeanUsr() {
        service = new Operaciones_Service();
        interfaz = service.getOperacionesPort();
    }

    @Override
    public void setUsuario(String value) {
        usr.setPassword(value);
    }

    @Override
    public void setPassword(String value) {
        super.setPassword(value); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert() {
        if(interfaz.guardarUsuario(usr)==true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Successful", "Usuario Nuevo")); 
        } 
    }
    
    public void updatePassword() {
        usr = new operaciones.Usuario();
        interfaz.actualizarPassword(usr);  
    }
    
    public void finUser() {
        usr = new operaciones.Usuario();
        interfaz.buscarUsuario(usr.getUsuario());  
    }
}
