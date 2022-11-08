public class Main {
    public static void main(String[] args) {
        Tendik a = new Tendik();
        a.setNip("123");
        a.setNama("Alma");
        a.setAlamat("kendari");
        a.setTgl_lahir("13-07-2002");
        a.setJk("perempuan");
        a.setThn_msk("2011");

        System.out.println(" Tendik ");
        System.out.println("NIP             : " + a.getNip());
        System.out.println("Nama            : " + a.getNama());
        System.out.println("Alamat          : " + a.getAlamat());
        System.out.println("Tanggal Lahir   : " + a.getTgl_lahir());
        System.out.println("Jenis Kelamin   : " + a.getJk());
        System.out.println("Tahun Masuk     : " + a.getThn_msk());
        a.lembur(20);
        a.hitung_gaji();

        Dosen b = new Dosen();
        b.setNip("208");
        b.setNidn("2100018192");
        b.setJurusan("Informatika");
        b.setNama("Dosen Uye");
        b.setAlamat("Jogjakarta");
        b.setTgl_lahir("15-09-1970");
        b.setJk("perempuan");
        b.setThn_msk("2005");

        System.out.println("");
        System.out.println(" Dosen ");
        System.out.println("NIP             : " + b.getNip());
        System.out.println("NIDN            : " + b.getNidn());
        System.out.println("Nama            : " + b.getNama());
        System.out.println("Jurusan         : " + b.getJurusan());
        System.out.println("Alamat          : " + b.getAlamat());
        System.out.println("Tanggal Lahir   : " + b.getTgl_lahir());
        System.out.println("Jenis Kelamin   : " + b.getJk());
        System.out.println("Tahun Masuk     : " + b.getThn_msk());
        b.minggu(6);
        b.hitung_gaji();


    }
}