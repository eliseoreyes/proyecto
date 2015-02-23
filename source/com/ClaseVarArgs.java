public class ClaseVarArgs {
    
    public static void main(String args[]){
        
        ClaseVarArgs  c = new ClaseVarArgs();
            
        int [] numeros = new int [5];
        numeros[0] = 4;   
        numeros[1] = 4;   
        numeros[2] = 4;   
        numeros[3] = 4;   
        numeros[4] = 4;   
        
        System.out.println(c.sumar(6,numeros));
    }

    public int sumar(int j, int ... valores){ //metodo que recibe un arreglo como parametro
        
        int valor = 0;;
        
        for (int x:valores){
            valor = valor + x;
        }
        return valor + j;
    }
}
