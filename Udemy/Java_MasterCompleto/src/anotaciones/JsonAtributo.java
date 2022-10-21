/*
*
*
*  */
package anotaciones;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)  // donde se aplicara la anotacion en este caso a un campo
@Retention(RetentionPolicy.RUNTIME)// si se chequea en tiempo de compilacion o ejecucion

public @interface JsonAtributo {
    String nombre() default "";

}
