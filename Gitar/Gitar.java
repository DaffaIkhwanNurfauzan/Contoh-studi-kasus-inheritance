
public class Gitar {

    String merek, jenis, warna, harga;
    int tahun;

    Gitar () {
    }
    Gitar (int harga){
    }
    Gitar (String merek, String jenis, String warna, int tahun){
    }

    void setInfoGitar (String merek, String jenis, String warna, int tahun){
        System.out.println ("merek : " + merek + "\njenis : " + jenis + "\nwarna : " + warna +"\ntahun : " + tahun  );
    }

    String sejarahGitar(){
        String a = "Les Paul sendiri adalah nama seorang pemain gitar populer di era 1930-1950-an. Dia juga suka membuat gitar dengan model kreasinya sendiri. Suatu kali Les lagi main ke New York tahun 1941. Menurut cerita, saat itu dia lagi tergiang-ngiang banget sama konsep gitar dengan suara yang diperoleh dari bodi kayu solid.";
        System.out.println(a);
        return a;
    }

    void setHarga(String harga){
        System.out.println("Harga Gitar : "+ harga);
    }
}
//Program ini dibuat dengan beberapa tipe data, variabel, construcor, method, dan parameter. Saya disini menggunakan gitar sebagai objek contoh yang dirincikan datanya