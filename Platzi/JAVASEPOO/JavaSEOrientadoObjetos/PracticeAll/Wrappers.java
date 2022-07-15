/**
 * Las clases Wrapper son:
 * BYTE - SHORT -INTEGER- LONG- FLOAT- DOUBLE- CHARACTER- BOOLEAN- STRING
 */
package PracticeAll;

public class Wrappers {
    private Integer myInt;
    private Double myDouble;
    private Character myChar;

    public void showData(){
        System.out.println("Entero Wrapper: " + myInt);
        System.out.println("Double Wrapper: " + myDouble);
        System.out.println("Char Wrapper: " + myChar);
    }

    public void convertIntegerToString(){
        String newWord = getMyInt().toString(); //convierto entero a string
        System.out.println("Longitud nueva cadena: " + newWord);
    }

    public Integer getMyInt(){
        return myInt;
    }
    public void setMyInt(Integer myInt){
        this.myInt = myInt;
    }

    public Double getMyDouble(){
        return myDouble;
    }

    public void setMyDouble(Double myDouble){
        this.myDouble = myDouble;
    }

    public Character getMyChar(){
        return myChar;
    }

    public void setMyChar(Character myChar){
        this.myChar = myChar;
    }
}
