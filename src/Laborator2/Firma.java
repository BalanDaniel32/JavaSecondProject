package Laborator2;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.LinkedList;
public class Firma
{
    protected int ID_Inginer1;
    protected LinkedList<Integer>listaID=new LinkedList<Integer>();
    protected int ID_Inginer2;
    protected int ID_Sofer;
    protected int getNr_ore_lucrate_inginer1;
    protected int nr_ore_lucrate_sofer;
    protected int nr_ore_lucrate_inginer2;
    protected int km_parcursi_sofer;
    int salariuOrarMinim=15;
    double coeficientSalarialING=1.5;
    double getCoeficientSalarialSOF=1.0;
    public Firma()
    {

    }



    public void CitireFisier(String numeFisier) throws IOException
    {
        File numeFis=new File(numeFisier);
        Scanner scanner =new Scanner(numeFis);
        ID_Inginer1=scanner.nextInt();
        getNr_ore_lucrate_inginer1=scanner.nextInt();
        scanner.nextLine();
        ID_Inginer2=scanner.nextInt();
        nr_ore_lucrate_inginer2=scanner.nextInt();
        scanner.nextLine();
        ID_Sofer=scanner.nextInt();
        nr_ore_lucrate_sofer=scanner.nextInt();
        km_parcursi_sofer=scanner.nextInt();
        scanner.close();

    }

    public int getGetNr_ore_lucrate_inginer1()
    {

        return  getNr_ore_lucrate_inginer1;
    }
    public int getNr_ore_lucrate_inginer2(){
        return nr_ore_lucrate_inginer2;
    }
    public int getNr_ore_lucrate_sofer(){
        return nr_ore_lucrate_sofer;
    }

    public int getID_Inginer1() {
        return ID_Inginer1;
    }
    public int getID_Inginer2(){
        return ID_Inginer2;
    }
    public int getID_Sofer(){
        return ID_Sofer;
    }

    public int getKm_parcursi_sofer(){
        return km_parcursi_sofer;
    }


    public double salar_inginer1(){
        double a= (salariuOrarMinim*coeficientSalarialING)*getGetNr_ore_lucrate_inginer1();
        return a;
    }
    public double salar_inginer2() {
        double a = (salariuOrarMinim * coeficientSalarialING) * getNr_ore_lucrate_inginer2();
        return a;
    }

    public double salar_sofer(){
         double a=(salariuOrarMinim*getCoeficientSalarialSOF)*getNr_ore_lucrate_sofer()+getKm_parcursi_sofer()*0.1;
        return a;
        }
    public double salar_total(){
        double total=salar_inginer1()+salar_inginer2()+salar_sofer();
        return total;
    }





    public void GetAngajatdupaID()
    {
        listaID.add(getID_Inginer1());
        listaID.add(getID_Inginer2());
        listaID.add(getID_Sofer());
        System.out.println(listaID);



    }

}
