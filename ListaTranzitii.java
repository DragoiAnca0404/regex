import java.util.*;
public class ListaTranzitii {
    private ArrayList<Tranzitie>lista=new ArrayList<Tranzitie>();
    void adaugaTranzitii(Tranzitie tr){ this.lista.add(tr);}
    
    Tranzitie gasesteTranzitie(String stare, char simbol){
        for(int i=0; i<lista.size();i++){
            Tranzitie tmp=this.lista.get(i);
            if(stare.equals(tmp.spuneStInceput())&& simbol==tmp.spuneSimbol())
                return tmp;
        }
        return null;
    }
    
    public String toString(){
    String out="";
        for(int i=0;i<lista.size();i++)
        {
        Tranzitie tr=this.lista.get(i);
        out+="\u03B4("+tr.spuneStInceput()+","+tr.spuneSimbol()+")={"+tr.spuneStSfarsit()+"}\n";
        }
    return out;    
    }
    
}
