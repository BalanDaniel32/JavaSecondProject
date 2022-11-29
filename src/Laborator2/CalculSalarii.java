package Laborator2;
import java.io.IOException;
public class CalculSalarii
{
    public static void main(String []args)
    {
        Inginer inginer1=new Inginer("Balan","Daniel",5);
        Inginer inginer2=new Inginer("Balan","Adriana",4);
        Sofer sofer1=new Sofer("Barbu","Delavrancea",3);
        inginer1.setNrOreLucrate(100);
        inginer2.setNrOreLucrate(200);
        sofer1.setKmParcursi(1000);
        sofer1.setNrOreLucrate(250);
        inginer2.setID(26);
        System.out.println(inginer1.toString());
        System.out.println(sofer1.toString());
        System.out.println(inginer2.toString());
        double abc=inginer1.salariu()+inginer2.salariu()+sofer1.salariu();
        System.out.println("Total salarii:"+abc);
        Firma firma=new Firma();
        try{
            firma.CitireFisier("pontaj.txt");
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println("=====================================");
        System.out.println("Rezolvare folosind citirea din fisier");
        System.out.println("=====================================");
        Inginer i1=new Inginer("Daniel","Delgado",firma.getID_Inginer1());
        Inginer i2=new Inginer("Adriana","Balan", firma.getID_Inginer2());
        i1.setID(firma.getID_Inginer1());
        i1.setNrOreLucrate(firma.getGetNr_ore_lucrate_inginer1());
        System.out.println(i1.toString());
        i2.setID(firma.getID_Inginer2());
        i2.setNrOreLucrate(firma.getNr_ore_lucrate_inginer2());
        System.out.println(i2.toString());
        Sofer s1=new Sofer("Balan","Daniel", firma.getID_Sofer());
        s1.setNrOreLucrate(firma.getNr_ore_lucrate_sofer());
        s1.setKmParcursi(firma.getKm_parcursi_sofer());
        System.out.println(s1.toString());
        System.out.println("Salariu total:"+firma.salar_total());
        firma.GetAngajatdupaID();
    }
}
