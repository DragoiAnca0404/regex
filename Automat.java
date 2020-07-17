import java.io.*;
import java.util.*;
public class Automat {
    private String st_init;
    private ArrayList<String>st_finale=new ArrayList<String>();
    private ListaTranzitii delta=new ListaTranzitii();
    
    Automat(String fisier) throws Exception{
        BufferedReader buf=new BufferedReader(new FileReader(fisier));
        this.st_init=buf.readLine();
        String sir_finale=buf.readLine();
        String sir_finale_arr[]=sir_finale.split(" ");
        for(int i=0;i<sir_finale_arr.length;i++)
            this.st_finale.add(sir_finale_arr[i]);
        while(true){
            String strtmp=buf.readLine();
            if(strtmp==null)
                break;
            else {
                String strtr[]=strtmp.split(" ");
                Tranzitie tr=new Tranzitie(strtr[0], strtr[1].charAt(0), strtr[2]);
                        this.delta.adaugaTranzitii(tr);
            }
        }
    }
    void afiseaza(){
        
       System.out.println("Stare initiala:"+this.st_init);
       System.out.println("\nMultime stari finale:{"+this.st_init+","+this.st_finale+"}");
       System.out.println("\nFunctia de tranzitii:");
       
       /*System.out.println("\n\u03B4("+this.st_init+", a)={q1}");
       System.out.println("\n\u03B4(q1, b)={q1}");
       System.out.println("\n\u03B4(q1, a)={"+this.st_finale+"}");
        */
        
        System.out.println(delta.toString());
            
    }
    boolean analizeazaCuvant(String cuvant){
        
        
    }
}
