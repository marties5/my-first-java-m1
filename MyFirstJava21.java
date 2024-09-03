public class MyFirstJava21 {

    static void PersonalBiodataName(String Name) {
        String longNameString = Name;
        Header.header();
        System.out.println("DATA MAHASISWA JURUSAN TEKNOLOGI INFORMASI POLINEMA");
        Header.header();
        System.out.println("NAMA    : " + longNameString);
        System.out.println("NIM     : 244107060162");
        System.out.println("PRODI   : Sistem Informasi Bisnis");
        System.out.println("JURUSAN : Teknologi Informasi");
        System.out.println("No.HP   : +6281515254030");
        System.out.println("HOBI    : mengkoding");
    }

    public static void main(String[] argrs) {
        String[] Names = { "Zhidan", "Alfareza", "Marties" };
        String myLocalIp = LocalIP.localIp(argrs);
        if (myLocalIp.equals("192.168.65.198")) {
            for (String Name : Names) {
                PersonalBiodataName(Name);
            }
        } else {
            System.out.println("Error:This code has Zhidan Marties Alfareza SIB 1-E Polinema");
        }
    }
}