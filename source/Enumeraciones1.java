package source;

class Enum {
    
    enum Numeros {
        UNO,
        DOS,
        TRES
    }

    Numeros num;
}

public class Enumeraciones1 {
    
    public static void main(String args[]){
        
        Enum en = new Enum();
        
        en.num = Enum.Numeros.UNO;
    }
}
