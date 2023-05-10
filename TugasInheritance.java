public class TugasInheritance {
    public static void main(String[] args) {

        //Deklarasi objek dan inisalisasi class
        Band band = new Band();
        Vokalis vokalis = new Vokalis();
        Gitaris gitaris = new Gitaris();
        Drummer drummer = new Drummer();
        Keyboardist keyboardist = new Keyboardist();
        Bassist bassist = new Bassist();

        //pemanggilan atribut yang tertatam di class induk band
        System.out.println("Nama Band : " + band.namaBand);
        System.out.println("Jumlah personil : " + band.jumlahPersonil);
        System.out.println("Tarif manggung : " + band.tarifManggung);

        //pemanggilan atribut yang diwariskan oleh class induk pada masing-masing subclass
        System.out.println("Nama band vokalis : " + vokalis.namaBand);
        System.out.println("Jumlah personil dari band gitaris : " + gitaris.jumlahPersonil);
        System.out.println("Tarif manggung band si keyboardist : " + keyboardist.tarifManggung);

        //pemanggilan method yang di overriding oleh masing subclass dari class induk
        band.mainkan();
        vokalis.mainkan();
        gitaris.mainkan();
        drummer.mainkan();
        keyboardist.mainkan();
        bassist.mainkan();
    }

    }
    class Band {
        //deklarasi atribut utama di induk class
        String namaBand = "Pitutu";
        int jumlahPersonil = 5;
        int tarifManggung = 10000000;

        public String jadwalReady(){
            return "Setiap sore";
        }
        public void mainkan (){
            System.out.println("Sedang manggung...");
        }
    }

    class Vokalis extends Band {
        //menimpa method mainkan pada class induk
        public void mainkan (){
            System.out.println("Sedanag bernyanyi...");
        }
    }

    class Gitaris extends Band {
        public void mainkan (){
            System.out.println("Sedang memetik gitar...");
        }
    }

    class Drummer extends Band {
        public void mainkan (){
            System.out.println("Sedang memukul drum...");
        }
    }

    class Keyboardist extends Band {
        public void mainkan (){
            System.out.println("Sedang menekan kunci note...");
        }
    }

    class Bassist extends  Band {
    public void  mainkan (){
        System.out.println("Sedang memainkan bass...");
     }
    }
