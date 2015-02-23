package source;

public class TestEnum {
    
    enum Numeros {
        UNO,
        DOS,
        TRES
        }
        
    public static final TestEnum UNO = new TestEnum("UNO",0);
    public static final TestEnum DOs = new TestEnum("DOS",1);
    public static final TestEnum TRES = new TestEnum("TRES",2);    

    public TestEnum (String enumName, int index){

    }

    
    public static void main(String args []){
        
        TestEnum en = new TestEnum();

        System.out.println(en.DOS);
    }
}
