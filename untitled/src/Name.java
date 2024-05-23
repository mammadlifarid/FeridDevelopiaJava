public class Name {
    public static void main(String[] args) {
        String ad = "Muharram";
        System.out.println(ad);

        String mesaj = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println(mesaj);

        int mesajUzunlugu = mesaj.length();
        System.out.println("Mesajın uzunluğu: " + mesajUzunlugu);

        char yeddinciSimvol = mesaj.charAt(6);
        System.out.println("Mesajın 7-ci simvolu: " + yeddinciSimvol);
        char besinciSimvol = mesaj.charAt(5);
        System.out.println("Mesajın 6-ci simvoluymus: " + besinciSimvol);

        int olmayanRSimvolununIndeksi = mesaj.indexOf('R');
        System.out.println("Simvol 'R'-nin indeksi: " + olmayanRSimvolununIndeksi);
int mSimvolununIndeksi = mesaj.indexOf('m');
        System.out.println("Simvol 'm'-in indeksi: " + mSimvolununIndeksi );
        String mesajKicikHerflerle = mesaj.toLowerCase();
        System.out.println("Mesaj kiçik hərflərlə: " + mesajKicikHerflerle);

        String mesajBoyukHerflerle = mesaj.toUpperCase();
        System.out.println("Mesaj böyük hərflərlə: " + mesajBoyukHerflerle);

        boolean simvolVar = !mesaj.isEmpty();
        System.out.println("Mesajda hər hansı simvol var: " + simvolVar);

        boolean sonuIleBiter = mesaj.endsWith("faydalıdır");
        System.out.println("Mesaj 'useful' ilə bitir: " + sonuIleBiter);

        boolean baslangiciIleBaslayirFalse = mesaj.startsWith("öyrənmək");
        System.out.println("Mesaj 'öyrənmək' ilə başlayır: " + baslangiciIleBaslayirFalse);

        boolean baslangiciIleBaslayirTrue = mesaj.startsWith("Java");
        System.out.println("Mesaj 'Java' ilə başlayır: " + baslangiciIleBaslayirTrue);

        ad = "      Ayxan         ";
        String adTrim = ad.trim();
        System.out.println("Boşluqları təmizlənmiş ad: " + adTrim);

        String digerAd = "Kamil";
        String ilkDordSimvol = digerAd.substring(0, 4);
        System.out.println("Kamil-in ilk 4 simvolu: " + ilkDordSimvol);

        ad = "Hüseyn Mehdizadə";
        String[] adHisseleri = ad.split(" ");
        for (String hisse : adHisseleri) {
            System.out.println(hisse);
        }
    }
}
