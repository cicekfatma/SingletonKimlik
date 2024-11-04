public class Kimlik {
    private static Kimlik kimlikInstance;
    private Kimlik(){}

    public static Kimlik kimlikOlustur(){
        if(kimlikInstance== null){
            kimlikInstance= new Kimlik();}

        return kimlikInstance;
    }
    public String kimlikGoruntule(){
      return  "Kimlik nesnesi tek kopya olarak oluşturuldu."+this;

    }

}
