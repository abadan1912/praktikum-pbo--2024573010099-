package modul_4.modifikasi;

public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;
    private double nilai;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }
    public double getNilai() { return nilai; }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) this.nilai = nilai;
        else System.out.println("Nilai harus antara 0-100");
    }

    public String getNilaiHuruf() {
        if (nilai > 85) return "A";
        else if (nilai > 80) return "A-";
        else if (nilai > 75) return "B+";
        else if (nilai > 70) return "B";
        else if (nilai > 65) return "B-";
        else if (nilai > 60) return "C+";
        else if (nilai > 55) return "C";
        else if (nilai > 50) return "D";
        else return "E";
    }

    public double getBobotNilai() {
        switch (getNilaiHuruf()) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo() {
        System.out.printf("%-10s %-25s %-5d %-10.2f %-5s\n",
                kode, nama, sks, nilai, getNilaiHuruf());
    }
}

