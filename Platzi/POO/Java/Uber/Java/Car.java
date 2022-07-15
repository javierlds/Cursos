package Java.Uber.Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;


    public Car(String license, Account driver){ // parametros obligatorios para construir un objeto driver hereda de account
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar(){
        System.out.println("license:" + license);
        System.out.println("driver:" + driver);
        System.out.println("passenger:" + passenger);
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getLicense(){
        return license;
    }

    public void setLicense(String license){
        this.license = license;
    }

    public Account getDriver(){
        return driver;
    }

    public void setDriver(Account driver){
        this.driver = driver;
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        this.passenger = passenger;
    }
    
}
