package Laborator2;

public class Sofer extends Persoana implements IAngajat
{
    protected int nr_ore;
    protected int km;
    protected double coefMinim=1.0;
    protected int ID;

    public Sofer(String nume,String prenume,int ID){
        super(nume,prenume);
        this.ID=ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
    this.nr_ore=nrOreLucrate;
    }

    public void setKmParcursi(int kmParcursi)
    {
        this.km=kmParcursi;
    }

    @Override
    public double salariu() {
        double a=(salariuOrarMinim*coefMinim)*nr_ore+km*0.1;
        return a;
    }

    @Override
    public String toString(){
        return "Sofer:\n"+"ID:"+ID+" "+super.toString()+ " a lucrat "+ nr_ore+ " si are salariul:"+salariu()+" lei";
    }
}
