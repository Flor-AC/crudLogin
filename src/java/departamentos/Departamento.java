package departamentos;

public class Departamento {
    
    private String id;
    private String departamento;

    public Departamento() {
    
    }
    
    public Departamento(String id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
