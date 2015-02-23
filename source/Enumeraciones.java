package source;

enum Constantes {
     CONST(10),
     COLOR(9);
    
    Constantes(int onzas){
        this.onzas = onzas;
    }

    private int onzas;
    
    public int getOnzas(){
        return this.onzas;
    }
}

public class Enumeraciones {
    
    Constantes consta;
        
    public static void main(String args[]){
    
        Enumeraciones enum1 = new Enumeraciones();
        enum1.consta = Constantes.CONST;        
        
        Enumeraciones enum2 = new Enumeraciones();
        enum2.consta = Constantes.COLOR;
        
        System.out.println(enum1.consta.getOnzas());

        for (Constantes cs :Constantes.values())
            System.out.println(cs + " "+cs.getOnzas());
    }
} 
