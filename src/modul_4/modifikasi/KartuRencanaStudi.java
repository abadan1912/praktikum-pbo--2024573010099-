package modul_4.modifikasi;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMataKuliah;
    private int jumlahMatkul;
    private int maxMatkul;
    private final int BATAS_SKS = 24; // batas maksimum SKS

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMataKuliah = new Matakuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // Tambah mata kuliah dengan validasi batas SKS
    public boolean tambahMatakuliah(Matakuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            int totalSKSBaru = hitungTotalSKS() + matkul.getSks();
            if (totalSKSBaru > BATAS_SKS) {
                System.out.println("Gagal: Total SKS melebihi batas maksimum (" + BATAS_SKS + ")");
                return false;
            }
            daftarMataKuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Hapus mata kuliah
    public boolean hapusMataKuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMataKuliah[i].getKode().equalsIgnoreCase(kode)) {
                System.out.println("🗑️ Mata kuliah " + daftarMataKuliah[i].getNama() + " berhasil dihapus.");
                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMataKuliah[j] = daftarMataKuliah[j + 1];
                }
                daftarMataKuliah[--jumlahMatkul] = null;
                return true;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
        return false;
    }

    // Hitung total SKS
    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            total += daftarMataKuliah[i].getSks();
        }
        return total;
    }

    // Hitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;
        double totalBobot = 0.0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalBobot += daftarMataKuliah[i].getBobotNilai() * daftarMataKuliah[i].getSks();
            totalSKS += daftarMataKuliah[i].getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Cari mata kuliah
    public Matakuliah cariMataKuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMataKuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMataKuliah[i];
            }
        }
        return null;
    }

    // Tampilkan KRS
    public void tampilkanKRS() {
        System.out.println("\n==================== KARTU RENCANA STUDI ====================");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-25s %-5s %-10s %-5s\n", "KODE", "MATA KULIAH", "SKS", "NILAI", "HURUF");
        System.out.println("-------------------------------------------------------------");
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMataKuliah[i].tampilkanInfo();
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total SKS: " + hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("-------------------------------------------------------------");
    }

    // Nilai terbaik dan terburuk
    public void tampilkanNilaiTerbaikTerburuk() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada data mata kuliah.");
            return;
        }

        Matakuliah terbaik = daftarMataKuliah[0];
        Matakuliah terburuk = daftarMataKuliah[0];

        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMataKuliah[i].getNilai() > terbaik.getNilai())
                terbaik = daftarMataKuliah[i];
            if (daftarMataKuliah[i].getNilai() < terburuk.getNilai())
                terburuk = daftarMataKuliah[i];
        }

        System.out.println("\nNilai Terbaik:");
        terbaik.tampilkanInfo();
        System.out.println("\nNilai Terburuk:");
        terburuk.tampilkanInfo();
    }
}

