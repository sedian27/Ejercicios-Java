package Bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "selecCursosBean")
@RequestScoped
public class SelecCursosBean {
    private String email;
    private String[] cursosId;
    private String salida;

    public SelecCursosBean() {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getCursosId() {
        return cursosId;
    }

    public void setCursosId(String[] cursosId) {
        this.cursosId = cursosId;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    public void mostrar(){
        String cursos = "";
        
        for(String curso: this.cursosId){
            cursos += curso + " ";
        }
        this.salida = "Email: "+this.email+
                      " Cursos: "+cursos;
    }
    
}
