package PasoValorRef;

public class PasoPorReferencia {

    public static void main (String args[]){
        int edad[] = {10,11,45,63,32};

        System.out.println("Iniciamos el metodo main");
        for(int ed: edad){
            System.out.println("edad[i]: " + ed);
        }

        System.out.println("Antes de llamar el metodo test");
        test(edad);
        System.out.println("Despues de llamar el metodo test");
        for(int ed: edad){
            System.out.println("edad[i] = " + ed);
        }
        System.out.println("Finaliza el metodo main con datos de arreglo modificados.");

        System.out.println("********** paso por referencia persona");
        testPersona(pasoReferenciaPersona());
        System.out.println("********** fin por referencia persona");

    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo test");
        //i = 35;
        int index = 0;
        for(int ed: edadArr){
            edadArr[index] = ed +20;
            index++;
        }
        System.out.println("Finaliza el metodo tes");
    }

    public static void testPersona(Persona pers){
        System.out.println("Inicia testPersona..");
        pers.setNombre("JAVIER AUGUSTO");
        System.out.println("Persona paso 2:" +pers.getNombre());
        System.out.println("Finaliza testPersona");


    }

    public static Persona pasoReferenciaPersona(){
        Persona persona = new Persona();
        persona.setNombre("Jose");
        System.out.println("Persona paso 1:" +persona.getNombre());
        return persona;
    }
}