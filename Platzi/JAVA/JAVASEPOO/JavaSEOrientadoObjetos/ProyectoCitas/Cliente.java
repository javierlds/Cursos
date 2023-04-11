package ProyectoCitas;
import java.util.Date;

public class Cliente {  // " ES UN(Herencia) Cliente es una persona"
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    public Cliente(String nombre, char genero, int edad, String direccion, int idCliente, Date fechaRegistro, boolean vip){  // se debe asignar los atributos para inicializar la super clase, ya que esta
        // super(nombre,genero,edad,direccion);  // esto permite saber que, ya los atributos de la super clase estan inicializados.
        this.idCliente     = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip           = vip;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro(){
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getVip(){
        return vip;
    }

    public void setVip(boolean vip){
        this.vip = vip;
    }
}
