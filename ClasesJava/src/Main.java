//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombrePersona = "Diego";
        p.apellidoPersona = "González";
        p.edadPersona = 24;
        // p.idPersona = 312; no se puede acceder porque tiene el modificador de objetos private.
        // podemos acceder a estos atributos, porque en la clase Persona, los atributos no tienen modificadores de objetos.
                System.out.println("El nombre de la persona es:" + p.nombrePersona);


    }
}