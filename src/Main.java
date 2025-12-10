import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] jmena = {"Adam", "Gregor", "Jakub"};
        String uzivJmeno = "Adam";
        boolean spravneJmeno = false;
        for(String jm : jmena ){
            if(uzivJmeno.equals(jm)){
                spravneJmeno = true;
                break;
            }
        }
        System.out.println(spravneJmeno ? "Správné uživatelské jméno" : "Špatné uživatelské jméno");

        System.out.println();
        String text = "adam";
        if(text.equals(text.toLowerCase())){
            text = text.toUpperCase();
        }
        System.out.println(text);

        System.out.println();
        String[] pole = {"Adam", "Gregor", "Jakub"};
        for(int i = 0; i < pole.length; i++){

            if(i == 0 || i == pole.length-1){
                System.out.println(pole[i].toUpperCase());
            }else{
                System.out.println(pole[i]);
            }
        }

        System.out.println();
        String text1 = "Halloween";
        boolean jeZdvojena = false;

        for(int i = 0; i < text.length() - 1; i++){

            if(text1.charAt(i) == text1.charAt(i+1)){
                jeZdvojena = true;
                break;
            }
        }
        System.out.println(jeZdvojena ? "Ano" : "Ne");

        System.out.println();
        String rodneCislo = "740425/0999";
        System.out.println(rodneCislo.indexOf("/") + 1 == 7 ? "Lomítko je na správném místě": "Lomítko není na správném místě");

        System.out.println();

        String cislo = "23151231";
        for(int i = cislo.length() - 1; i >= 0; i--){
            System.out.print(cislo.charAt(i));
        }
        System.out.println();

        System.out.println();
        String retezec = "rohlík";
        for(int i = 0; i < retezec.length(); i++){

            if((i+1) % 2 == 0){
                retezec = retezec.replace(retezec.charAt(i), ((""+retezec.charAt(i)).toLowerCase()).charAt(0));
            }else{
                retezec = retezec.replace(retezec.charAt(i), ((""+retezec.charAt(i)).toUpperCase()).charAt(0));
            }

        }
        System.out.println(retezec);

        System.out.println();
        String jmeno = "jeRoNÝm rohLík";
        String[] jmenoPrijmeni = jmeno.split(" ");

        for(int i = 0; i < jmenoPrijmeni.length;i++){
            String sToAdd = String.join("", ""+Character.toUpperCase(jmenoPrijmeni[i].charAt(0)), jmenoPrijmeni[i].substring(1).toLowerCase());
            jmenoPrijmeni[i] = sToAdd;
        }
        jmeno= String.join(" ", jmenoPrijmeni);
        System.out.println(jmeno);

        System.out.println();
        String rodneCislo1 = "750325/0999";

        int cisloKeKontrole = Integer.parseInt(rodneCislo1.substring(2,4));
        if(  cisloKeKontrole >= 1 && cisloKeKontrole <= 12){
            System.out.println("Muž");
        }else if(cisloKeKontrole >= 51 && cisloKeKontrole <= 62){
            System.out.println("Žena");
        }else{
            System.out.println("Nevim");
        }

        System.out.println();
        int cislo1 = 12345;
        int pocetCislic = (""+cislo1).length();
        System.out.println(pocetCislic);

        System.out.println();
        String s = "kajalk";

        boolean palindrom = true;
        for(int i = 0; i < (s.length()-1)/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                palindrom = false;
            }
        }
        System.out.println(palindrom);

        

    }
}