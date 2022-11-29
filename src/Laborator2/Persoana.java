package Laborator2;

public class Persoana
{
    protected String name;
    protected String prenume;

    public Persoana(){

    }

    public Persoana(String name,String prenume)
    {
        this.name=name;
        this.prenume=prenume;
    }


    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return name+" "+prenume;
    }











}
