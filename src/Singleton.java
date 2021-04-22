public class Singleton {

    private static Singleton singleton;
    private String atributo1;
    private String atributo2;

    private Singleton(){
        this.atributo1 = "";
        this.atributo2 = "";
    }

    public static Singleton getInstance(){
        if(null == singleton){
            singleton = new Singleton();
        }
        return singleton;
    }
}
