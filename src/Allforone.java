public class Allforone  extends Heroe implements IActionHuman{
    String nombreHeroe;
    int edad;
    String NombreReal;
    String ocupacion;
    boolean usaTraje;
    String descripcion;

    public Allforone() {
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreReal() {
        return NombreReal;
    }

    public void setNombreReal(String nombreReal) {
        NombreReal = nombreReal;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean isUsaTraje() {
        return usaTraje;
    }

    public void setUsaTraje(boolean usaTraje) {
        this.usaTraje = usaTraje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void superPoder(int energiaActual) {
        this.usarManos();
        this.usarPies();
        this.saltar();
        energiaActual(energiaActual);



    }

    @Override
    public void usarManos() {
        System.out.println("roba y da poderes");
    }

    @Override
    public void usarPies() {
        System.out.println("Super velocidad");



    }

    @Override
    public void moverse() {
        System.out.println("es capaz de moverse a la velocidad de la luz");
    }

    @Override
    public void saltar() {
        System.out.println("puede saltar a grandes distancias");
    }

    @Override
    public void hablar() {
        System.out.println("escupe veneno por la boca");

    }

    public  void ataque(int saludActual ){

       int mostrarSalud = salud -saludActual;
        System.out.println("la salud del heroe actual es " + mostrarSalud);
    }

public  void  energiaActual(int energiaActual){
        int mostrarEnergia = energy - energiaActual;
    System.out.println("su energia actual es " + mostrarEnergia);
}
}
