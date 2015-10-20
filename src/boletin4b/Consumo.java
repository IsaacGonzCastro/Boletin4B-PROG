package boletin4b;

public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    private float tempo;
   
    //contructores
    public Consumo(){
   }
   public Consumo(float kM,float lI,float vM,float pG,float t){
     km = kM;
     litros = lI;
     vMed = vM;
     pGas = pG;
     tempo = t;
     }
   
 //metodos
  public void setlitros(float lI){
     litros = lI;
}
 public void setkM(float kM){
     km = kM;
 }
 public float getTempo(){
     return tempo;
 }
 public float consumoMedio(float kM,float lI){
     float consumoMedio = (lI*100)/kM;
     return consumoMedio;
    
 }
 public void setPGas(float pG){
     pGas = pG;
 }
 public float consumoEuros(float pG,float lI){
     float consumoEuros = lI*pG;
     return consumoEuros;
 }
 public float getvMed(float t,float kM){
     vMed= kM/t;
             
     return vMed;
 }
 public void setvMed(float vM){
        vMed = vM;
 }

}

