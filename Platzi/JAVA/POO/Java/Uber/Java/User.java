package Java.Uber.Java;

import javax.sound.sampled.SourceDataLine;

public class User extends Account{
 
    public User(String name, String document, String email, String password){
        super(name,document,email,password);
    }

    public void mostrarDatos(){
        System.out.println("Name: " + getName());
        System.out.println("Document: " + getDocument());
        System.out.println("email: " + getEmail());
        System.out.println("password" + getPassword());
    }
}
