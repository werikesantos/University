public class Caneta
{
   private  String   tipo;
   private  String   cor;
   
   public   Caneta()
   {
      tipo = ""; 
      cor  = "";
   }
   
   public   Caneta(String t, String c)
   {
      tipo = t;
      cor  = c;
   }
   
   public   void  setTipo(String t)
   {
      tipo = t;
   }
   public   String   getTipo()
   {
      return   tipo;
   }
   public   void  setCor(String c)
   {
      cor = c;
   }
   public   String   getCor()
   {
      return   cor;
   }
}