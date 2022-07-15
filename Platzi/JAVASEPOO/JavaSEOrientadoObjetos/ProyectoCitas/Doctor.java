/**
 * 
 * Encapsulamiento: 
 *     permite controlar el acceso a los atributos y metodos de la clase. Solo se puede modificar desde la misma clase
 *     para el acceso se usan los metodos getter(retornar valor del atributo) y setters(establecer un valor para el atributo).
 */

package ProyectoCitas;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // encapsulamiento
    static int id = 0;  // como es estatico se aumentara por cada instancia
    private String name;
    private String lastName;
    private char sexo;
    private String email;
    private String speciality;

    //constructor
    public Doctor(String name){       // los diferentes constructores me permite sobrecarga
        System.out.println("Nombre del doctor es: " + name);
        id++; // incremento el id del doctor en 1
    }
    public Doctor(int id, String name, String lastName, char sexo, String email, String speciality){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sexo = sexo;
        this.email = email;
        this.speciality = speciality;  // this -> hace referencia a los elementos de la clase
    }

    //comportamientos
    public void showName(){
        System.out.println("Doctor: " + getName() + " Speciality: " + getSpeciality());
    }

    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();// coleccion de objetos, dentro de <> va el tipo en este caso es el de la clase anidada.

    //metodo que carga un arreglo de objetos con citas asociadas del doctor.
    public void addAvailableAppointment(Date date, String time){ 
        availableAppointment.add(new AvailableAppointment(date, time)); // metodo que va a estar añadiendo nuevas citas, que se acumularan en el array
    }

    // metodo que retorna un arreglo de citas lleno.
    public ArrayList<AvailableAppointment> getAvaliableAppointments(){
        return availableAppointment;
    }

    public void showId(){
        System.out.println("Id doctor:" + id);
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;

    }

    public String getSpeciality(){
        return speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }

        public Date getDate(){
            return this.date;
        }

        public void setDate(Date date){
            this.date = date;
        }

        public String getTime(){
            return this.time;
        }

        public void setTime(String time){
            this.time = time;
        }



        
    

    }



}
