package Laborator2;

public class Inginer extends Persoana implements IAngajat
{
    protected double coeficientSalarial=1.5;
    protected int salar_minim=15;
    protected int nr_ore;
    protected int ID;


    public Inginer(String nume,String prenume,int ID){
        super(nume,prenume);
        this.ID=ID;


    }
    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        this.nr_ore=nrOreLucrate;
    }

    @Override
    public double salariu() {
        double a= (salariuOrarMinim*coeficientSalarial)*nr_ore;
        return a;
    }
    public void setID(int ID){
        this.ID=ID;
    }

    public int getID(){
        return ID;
    }

    @Override
    public String toString(){
        return "Inginer:\n"+"ID:"+ID+" "+super.toString() + " a lucrat "+nr_ore+ " si are salariul:"+salariu()+" Lei";
    }
}
