package com.example.muaz.qrcodescanner;

public class Konfigurasi {

    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.43.202:8080/peserta/pesertaHadir.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_PES_ID = "idPes";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "idPes";

    public static final String PES_ID = "pes_id";
}
