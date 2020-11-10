//package bean;
//
//import services.Crud;
//import services.Crud_Service;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean
//@RequestScoped
//public class indexBeanD extends Departamento{
//    
//    private services.Departamento dep;
//    private Crud_Service service;
//    private Crud interfaz;
//
//    public indexBeanD(String id, String departamento) {
//        super(id, departamento);
//    }
//    
//    public indexBeanD() {
//        this.departamentoDao = new DepartamentoDAO();
//    }
//
//    @Override
//    public void setId(String id) {
//        super.setId(id); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setDepartamento(String departamento) {
//        super.setDepartamento(departamento); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    public void insert() {
//        departamento = new Departamento(getId(), getDepartamento());
//        departamentoDao.insert(departamento);
//        
//    }
//
//    public void update() {
//        departamento = new Departamento(getId(), getDepartamento());
//        departamentoDao.update(departamento);
//    }
//
//    public void delete() {
//        departamento = new Departamento(getId(), getDepartamento());
//        departamentoDao.delete(Integer.parseInt(departamento.getId()));
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
