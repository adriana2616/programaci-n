package montoescrito1;




import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class MontoEscrito1 {
    
  // Devuelve las unidades  
   public static String unidadT(int num){
   
    String letran=null;
        
         switch ((num % 10)){
	case 1:
		letran = " Uno "; break;
	case 2:
		letran = " Dos "; break;
	case 3:
		letran = " Tres "; break;
	case 4:
		letran = " Cuatro "; break;
	case 5:
		letran = " Cinco "; break;
	case 6:
		letran = " Seis "; break;
	case 7:
		letran = " Siete "; break;
	case 8:
		letran = " Ocho "; break;
	case 9:
		letran = " Nueve "; break;

        default : letran = " "; break;
         
         }
        return letran;
   } 
   
   // Devuelve las decenas  
     
   public static String decenasT(int num){
         
     String letran=null;
     String c = null;
     
     if((num/10)>0)     
    {    
    switch((int)(num/10)){
         
        case 1: 
          
    switch ((int)(num % 10))
    {
        case 0:
		letran  =" Diez "; break;
	case 1:
		letran  =" Once "; break;
	case 2:
		letran  =" Doce ";break;
	case 3:
		letran  =" Trece ";break;
	case 4:
		letran  =" Catorce ";break;
	case 5:
		letran  =" Quince ";break;
		
	default:
		letran  = " Diez y " + decenasT(num % 10);break;
                
           } 
             break;
           case 2:
    switch ((int)(num % 10)){
        
         case 0: letran =" Veinte "; break;
           default:
        letran = " Veinti " + decenasT(num % 10);break;
              }break;
         case 3: 
    switch ((int)(num % 10)){
                                
         case 0: letran =" Treinta "; break;
            default:
        letran = " Treinta y " + decenasT(num % 10);break;
              }break;
         case 4:
    switch ((int)(num % 10)){
                                
         case 0: letran =" Cuarenta "; break;
            default:
        letran = " Cuarenta y " + decenasT(num % 10);break;
               }break;
         case 5:
    switch ((int)(num % 10)){
                                
         case 0: letran =" Cincuenta "; break;
            default:
        letran = " Cincuenta y " + decenasT(num % 10);break;
                }break;
         case 6:
    switch ((int)(num % 10)){
                                
         case 0: letran =" Sesenta "; break;
            default:
        letran = " Sesenta y " + decenasT(num % 10);break;
                }break;
         case 7:
    switch ((int)(num % 10)){
                                
        case 0: letran =" Setenta "; break;
            default:
        letran = " Setenta y " + decenasT(num % 10);break;
               }break;
        case 8:
    switch ((int)(num % 10)){
                                
        case 0: letran =" Ochenta "; break;
            default:
        letran = " Ochenta y " + decenasT(num % 10);break;
                }break;
                                
        case 9:
    switch ((int)(num % 10)){
                                
        case 0: letran =" Noventa "; break;
             default:
        letran = " Noventa y " + decenasT(num % 10);break;
                }break; 
            }
         //c= unidadT(num);
       }else{
         letran=unidadT(num);
     }
       return letran; 
     }      
  // Devuelve las centenas 
   
     public static String centenasT(int num){
        
     String letran=null;
     String c = null;
     
      if ((num/100)>0){
     
      if ((num/100)== 1){
                    
      if ((num % 100)== 0){
                        
         letran= " cien ";
      }else {
          letran= centenasT(num / 100)+ " Ciento " + centenasT (num % 100);
                        }
      }else{
      if ((num/100)== 5){
                        
          letran = " Quinientos " + centenasT(num % 100);
         
         }else {
     
          if ((num/100) == 9){
                              
          letran= " Novecinetos " + centenasT(num % 100);
      }else{
          letran = centenasT(num/100) + " Cientos " +centenasT(num % 100); 
          }
        }
     
     }
       
   }else {
          letran = decenasT(num);
      }
     return letran;
}            
          
// Devuelve los miles  
     
  public static String milesT(int num){
          
     String letran=new String();
     String c = null;
     
     if ((num / 1000) > 0) {
                if ((num/ 1000) == 1) {
                    letran = " Mil " + milesT(num % 1000);
                } else {
                    letran = milesT(num / 1000) + " Mil " + milesT(num % 1000);
                }
 
     }else{
         
         letran = centenasT(num);
     }
  
        return letran;
}
   
         
// Devuelve los millones  
     
   public static String millonesT(int num){
          
     String letran = new String(); 

      if ((num / 1000000) > 0) {

            if ((num / 1000000) == 1) {
                letran = " Un Millon " + millonesT(num % 1000000);
            } else {
                letran = millonesT(num / 1000000) + " Millones " + millonesT(num % 1000000);
            } 
        }else{
        letran= milesT(num);
      }
      return letran;
   }
  
 public static void main(String[] args) {
        
     
        Scanner tecla = new Scanner (System.in);
        int ent = 0;
        int dec = 0;
        int uni = 0;
       
        System.out.println("Ingrese un numero");
        float num = tecla.nextFloat();
        ent = (int)num;
        dec = Math.round ((int) (100*(num - ent)));
        uni= (int)num;
        if(ent>0 && ent < 100000000){
            
            System.out.print(millonesT(ent));
   
        }
        else{
            
            System.out.println("Nuemro no permitido");
            
        }
        
        if(dec > 0){
            
           System.out.print(" Con "); 
           System.out.print(decenasT(dec));
           System.out.print(decenasT(uni));
           System.out.print(" Decimas "); 
                    
    }

}  
   
        
          
}    

     

 
     
     
     
     
     
     
     
     
     
     





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
