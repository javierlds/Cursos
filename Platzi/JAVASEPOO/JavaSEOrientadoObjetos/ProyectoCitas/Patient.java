/**
 * Getter y Setters: ayudaran a tener la consistencia en nuestras variables de acuerdo a las reglas de negocio
 * 
 */

package ProyectoCitas;

public class Patient {

    // encapsulamiento de los atributos solo accedidos desde la misma clase
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){ // parametros minimos para que el paciente exista.
        this.name = name;
        this.email = email;
    }

    //metodos get y set ayudan a validar todo dato que se quiera asignar.
    // metodo get obtengo variable  -- metodo set asigno valor a la variable.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()> 8){
            System.out.println("El numero telefonico debe ser maximo de 8 digitos.");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return this.height + "mts"; // se puede definir lo que yo retorne.
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(double weight){
        this.weight = weight;

    }

    public String getWeight(){  //se establecen las reglas desde esta clase y metodo
        return this.weight + "kg.";
    }



}
