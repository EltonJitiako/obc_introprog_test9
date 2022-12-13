public class Main {
    
    public static void main (String[] args){
        
         Cliente cliente1 = new Cliente();

            cliente1.Nombre = "John";
            cliente1.Edad = 23;
            cliente1.Telefono = 123123123;
            cliente1.Credito = 12000;

            System.out.println("Nombre: " + cliente1.Nombre 
                                + ", Edad: " + cliente1.Edad 
                                + ", Telefono: " + cliente1.Telefono 
                                + ", Credito: " + cliente1.Credito);

         Trabajodor trabajador1 = new Trabajodor();

            trabajador1.Nombre = "Lily";
            trabajador1.Edad = 27;
            trabajador1.Telefono = 321321321;
            trabajador1.Salario = 8000;

            System.out.println("Nombre: " + trabajador1.Nombre 
                                + ", Edad: " + trabajador1.Edad 
                                + ", Telefono: " + trabajador1.Telefono 
                                + ", Salario: " + trabajador1.Salario);


    }

}

abstract class Persona {
    String Nombre;
    int Edad;
    int Telefono;
}

class Cliente extends Persona {
    int Credito;
}

class Trabajodor extends Persona {
    int Salario;
}