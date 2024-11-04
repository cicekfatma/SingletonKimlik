//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Kimlik kimlik1= Kimlik.kimlikOlustur();
        System.out.println("1.nesne:"+kimlik1.kimlikGoruntule());

        Kimlik kimlik2= Kimlik.kimlikOlustur();
        System.out.println("2.nesne:"+kimlik2.kimlikGoruntule());
    }
}