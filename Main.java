public class Main {
        public static void main(String[] args) {
            Persona persona1 = new Persona(),persona2 = new Persona();

            persona1.setNombre("Ichigo");
            persona1.cumplirAnios();
            persona1.cumplirAnios();
            persona1.cumplirAnios();
            persona1.cumplirAnios();

            persona2.setNombre("Rosas");
            persona2.cumplirAnios();
            persona2.cumplirAnios();

            System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años");
            System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años");
        }
}

class Persona {
    int edad=0;
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void cumplirAnios(){
        edad+=1;
    }






}