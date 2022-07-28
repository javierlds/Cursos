package JavaSE;

/**
 *
 * Esta clase muestra el uso de los constructores, Metodo que crea un objeto, y se invocan con la palabra reservada new.
 * @author japaez
 * @version 1.0
 * */

import java.util.Scanner;

public class Student { //declaracion de la clase

    private int studentId;
    private String name;   // campos / variables , private -> para proteger los datos
    private String ssn;    // declaracion de variables minuscula usando camelcase
    private double gpa;
    public final int SCHCODE = 34958; // declaracion de una constante, siempre debe ser en MAYUSCULA y debe ser publico

    // a contstructor
    public Student() {  // constructor, permite crear una instancia de la clase, no declaran tipo de retorno.
        // un constructor sin parametros inicializa las variables numericas de la clase en 0, y variables de objeto en nul
    }

    public Student(int studentId, String name, String ssn, double gpa) { // se inicializa el objeto con los valores que envie desde la clase controlador
        this.studentId = studentId;
        this.name = name;
        this.ssn = ssn;
        this.gpa = gpa;
    }

    public String toString() {
        String s1 = "";
        s1 = "Student Id:" + getStudentId()
                +"Student Name:" + getName()
                +"Student SSN:" + getSsn()
                +"Student GPA:" + getGpa();
        return s1;
    }

    public int getStudentId() {  // metodos   - public-> modificador de acceso
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

