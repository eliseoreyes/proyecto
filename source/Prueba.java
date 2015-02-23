public class Prueba {
    
   static int count  = 5;
    public static void main(String args[]){       

        retornarValor(); 
        
        System.out.println("El numero es "+count);
        
        tomarVariable(); 
    }

    public static void retornarValor(){
        int count = 10;
        System.out.println("La variable coount es "+count);
    }

    public static void tomarVariable(){
        count = 10;
        System.out.println("La variable count en el metodo tomarVAriable es"+count);
    }

}
