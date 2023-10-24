public abstract class Heroe {

    int salud = 90;
    int energy= 100;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract void superPoder(int energiaActual);


}
