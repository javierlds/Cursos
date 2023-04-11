package Java.Uber.Java;

public class Driver extends Account{
  
    private String license;
    private int yearsExperience;


    public Driver(String name, String document,String email, String password, String license, int yearsExperience){ 
        super(name,document,email,password); // con super se indica que ya estan inicializadas en el padre / representa la superclase/ como si llamara al metodo constructor de la superclase/ super hace referencia a todo lo de la super clase
        this.license         = license;
        this.yearsExperience = yearsExperience;
    }

    @Override   // Indica que voy a sobreescribir el metodo de la super clase
    public void mostrarDatos(){
        System.out.println("Conductor:  ");
        System.out.println("Name: "     + getName());
        System.out.println("Document: " + getDocument());
        System.out.println("email: "    + getEmail());
        System.out.println("password: "   + getPassword());
        System.out.println("License: "  + getLicense());
        System.out.println("Years Experience: " + getYearsExperience());
    }

    public String getLicense(){
        return license;
    }

    public void setLicense(String license){
        this.license = license;
    }

    public int getYearsExperience(){
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience){
        this.yearsExperience = yearsExperience;
    }
}