package ies.puerto;

public class Continue1 {
   public String unoAlVeinte(){
      String resultado = " ";
    for(int i = 1; i <= 20; i++){
      if(i % 3 == 0){
         continue;
      }
      resultado += i + " ";
    }
    return resultado;
   }
}
