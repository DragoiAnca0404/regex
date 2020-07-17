public class Tranzitie {

   private String stare_inceput;
   private char simbol;
   private String stare_sfarsit;
   Tranzitie(String stare_inceput, char simbol, String stare_sfarsit){
       this.stare_inceput=stare_inceput;
       this.simbol=simbol;
       this.stare_sfarsit=stare_sfarsit;
       
   }
   String spuneStInceput(){
       return this.stare_inceput;
   }
   char spuneSimbol(){
       return this.simbol;
   }
   String spuneStSfarsit(){
       return this.stare_sfarsit;
   }
   

}
   
