# LAPORAN DASAR PEMROGRAMAN JAVA LANJUTAN  - Abadan Syakira TI 2E
## Array, Method/Function, dan String/Manipulasi String  

---

## **BAB I – DASAR TEORI**

### **1.1 Pendahuluan**  
Pemrograman Java lanjutan merupakan kelanjutan dari dasar pemrograman yang bertujuan untuk memperdalam pemahaman tentang struktur logika dan konsep modular dalam pemrograman. Pada tahap ini, mahasiswa diperkenalkan pada tiga konsep utama, yaitu **Array**, **Method/Function**, serta **String dan Manipulasi String**.  
Ketiga konsep ini merupakan fondasi dalam membangun program yang terstruktur, efisien, dan mudah dikembangkan lebih lanjut, terutama ketika berhadapan dengan data berjumlah besar dan proses berulang.

---

### **1.2 Penjelasan Array**  
**Array** adalah struktur data yang digunakan untuk menyimpan sejumlah elemen dengan tipe data yang sama dalam satu variabel. Setiap elemen dapat diakses menggunakan indeks yang dimulai dari nol.  
Array digunakan untuk mempermudah penyimpanan dan pengolahan data yang jumlahnya banyak, seperti daftar nilai, data statistik, atau elemen numerik lainnya.  

Ciri-ciri utama array:
- Memiliki tipe data homogen.  
- Memiliki ukuran tetap.  
- Dapat diakses menggunakan indeks.  

Dengan menggunakan array, proses iterasi dan pengolahan data menjadi lebih sistematis serta efisien dalam penggunaan memori.

---

### **1.3 Penjelasan Method/Function**  
**Method** atau **Function** adalah blok kode yang memiliki tugas khusus dan dapat dipanggil berulang kali di berbagai bagian program. Tujuan utama penggunaan method adalah untuk **menghindari pengulangan kode (redundansi)** serta meningkatkan modularitas program.  

Setiap method dapat memiliki parameter (sebagai input) dan nilai kembalian (output). Dalam Java, method dapat dibedakan menjadi dua jenis:
1. **Void Method**, yaitu method yang tidak mengembalikan nilai.  
2. **Return Method**, yaitu method yang menghasilkan atau mengembalikan nilai setelah proses tertentu.  

Selain itu, Java juga mendukung **method overloading**, yaitu penggunaan nama method yang sama dengan parameter berbeda, memungkinkan efisiensi dalam penulisan kode dan peningkatan fleksibilitas fungsi.

---

### **1.4 Penjelasan String dan Manipulasi String**  
**String** merupakan tipe data yang digunakan untuk menyimpan sekumpulan karakter. Dalam Java, objek `String` bersifat **immutable**, artinya setiap operasi yang dilakukan terhadap string akan menghasilkan objek baru tanpa mengubah nilai aslinya.  

String banyak digunakan dalam aplikasi yang melibatkan input teks, pencarian, dan pemrosesan data berbasis karakter.  
Beberapa operasi dasar pada string antara lain:
- Menghitung panjang string.  
- Mengubah huruf menjadi kapital atau huruf kecil.  
- Mengambil sebagian karakter dari string tertentu.  
- Membandingkan dua string.  
- Menggabungkan beberapa string menjadi satu kesatuan.  

Manipulasi string berperan penting dalam pengembangan aplikasi yang memerlukan pengolahan teks, validasi input pengguna, serta tampilan data dalam format tertentu.

---

## **BAB II – PRAKTIKUM**

### **2.1 Tujuan Praktikum**  
Tujuan praktikum ini adalah untuk memahami penerapan konsep **Array**, **Method/Function**, dan **String/Manipulasi String** dalam bahasa pemrograman Java secara langsung. Melalui kegiatan praktikum, mahasiswa diharapkan mampu:
1. Mengimplementasikan array untuk menyimpan dan mengelola data secara efisien.  
2. Membuat dan memanfaatkan method untuk modularisasi program.  
3. Menggunakan berbagai operasi string untuk pengolahan data berbasis teks.  

---

### **2.2 Langkah-Langkah Umum Praktikum**  
1. Membuat proyek Java baru di IDE (Integrated Development Environment) seperti *NetBeans*, *IntelliJ IDEA*, atau *Eclipse*.  
2. Menuliskan kode program yang melibatkan array, method, dan string sesuai dengan tujuan percobaan.  
3. Menjalankan program dan mengamati hasilnya.  
4. Melakukan analisis hasil keluaran program untuk memahami peran masing-masing konsep dalam pemrograman Java.  
5. Menarik kesimpulan berdasarkan hasil eksekusi dan teori yang telah dipelajari.  

---

### **2.3 Hasil dan Pembahasan**  
Hasil praktikum menunjukkan bahwa penggunaan **array** sangat membantu dalam pengelolaan data dalam jumlah besar secara sistematis.  
Penggunaan **method/function** memberikan efisiensi dalam pengembangan kode dan memperjelas struktur program, sehingga mudah dipahami dan diuji.  
Sedangkan **manipulasi string** memungkinkan pengolahan data teks menjadi lebih fleksibel, seperti mengubah format teks, menampilkan data dinamis, serta melakukan perbandingan dan pemisahan karakter.  

Keterpaduan ketiga konsep ini menunjukkan bahwa pemrograman Java memiliki struktur yang kuat untuk membangun sistem berbasis data maupun aplikasi berbasis teks dengan modularitas tinggi.

---

### **2.4 Praktikum**
### Praktikum 1

##### a. ArraySatuDimensi.java
Program ini mendemonstrasikan dasar pengolahan array satu dimensi berisi nilai ujian siswa. Alur eksekusi dimulai dengan inisialisasi array, kemudian seluruh elemen ditampilkan agar pembaca memahami data awal. Akses elemen spesifik menunjukkan cara pengindeksan (berbasis nol) dan pentingnya menjaga batas indeks agar tidak memicu `ArrayIndexOutOfBoundsException`. Pencarian nilai maksimum dan minimum dilakukan dengan perulangan enhanced for yang sederhana dan mudah dibaca; kompleksitas waktunya linear, O(n), karena setiap elemen dikunjungi tepat satu kali. Keluaran program menegaskan tiga hal: isi data, contoh akses per elemen, serta ringkasan nilai ekstrem. Untuk pengembangan, Anda dapat menambahkan validasi panjang array (misalnya, tidak boleh kosong) dan menampilkan posisi indeks dari nilai ekstrem. Selain itu, hasil dapat diformat lebih informatif, misalnya menyoroti apakah terdapat lebih dari satu elemen yang berbagi nilai maksimum atau minimum.
![Ss Hasil](laporan/laporan2/gambar/gambar_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_1.png)



##### b. Latihan1.java
Fokus program ini adalah perhitungan statistik dasar dari kumpulan nilai: rata-rata, nilai tertinggi, dan nilai terendah. Seluruh metrik dihitung dalam satu lintasan array sehingga efisien dan mudah diikuti alurnya. Rata-rata dihitung sebagai total dibagi jumlah elemen; langkah ini menggarisbawahi pentingnya tipe data `double` agar presisi desimal terjaga. Nilai tertinggi dan terendah dicari bersamaan untuk mengurangi biaya komputasi, tetap pada kompleksitas O(n). Keluaran diringkas dengan format yang mudah dibaca, termasuk pembulatan dua angka di belakang koma untuk nilai rata-rata. Potensi pengembangan meliputi penanganan kasus tepi seperti array kosong, data negatif, atau deteksi outlier. Anda juga bisa menambahkan perhitungan median dan modus untuk analisis statistik yang lebih menyeluruh.
![Ss Hasil](laporan/laporan2/gambar/latihan_1_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_2.png)



### Praktikum 2
##### a. ArrayDuaDimensi.java
Program ini merepresentasikan data nilai tiga siswa pada empat mata pelajaran menggunakan array dua dimensi (baris = siswa, kolom = mata pelajaran). Tahap awal menampilkan ukuran baris dan kolom agar struktur data jelas, kemudian setiap baris dicetak dalam bentuk larik yang mudah dipindai. Praktik ini membantu pembaca memetakan hubungan data (misalnya, nilai siswa ke-2 pada mata pelajaran ke-3) dan meminimalkan kebingungan indeks. Kompleksitas pencetakan seluruh matriks adalah O(r×c), di mana r adalah jumlah siswa dan c adalah jumlah mata pelajaran. Dengan struktur seperti ini, operasi lanjutan—misalnya rata-rata per siswa atau per mata pelajaran—menjadi lebih sistematis. Pengembangan yang disarankan mencakup validasi keseragaman panjang kolom, pemberian label (nama siswa dan mata pelajaran), serta pemisahan logika tampilan ke method terpisah demi keterbacaan. Untuk laporan, Anda dapat menambahkan diagram kecil yang menjelaskan pemetaan indeks baris/kolom.
![Ss Hasil](laporan/laporan2/gambar/gambar_2.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_3.png)



##### b. Latihan2.java
Program menganalisis data 2D untuk dua sasaran: menemukan mata pelajaran dengan nilai tertinggi bagi tiap siswa, serta menghitung rata-rata per mata pelajaran. Pencarian nilai maksimum per baris dilakukan dengan memindai seluruh kolom dan menyimpan indeks mata pelajaran terbaik; cara ini memudahkan pelaporan yang menyebut nama mapelnya, bukan sekadar angkanya. Rata-rata per mata pelajaran dihitung menelusuri kolom dan menjumlahkan nilai dari semua siswa, kemudian dibagi jumlah siswa; pendekatan ini menyoroti performa kolektif di tiap mata pelajaran. Kompleksitas total tetap linear terhadap jumlah elemen matriks. Keluaran bersifat informatif karena menggabungkan sudut pandang individu (per siswa) dan agregat (per mata pelajaran). Untuk pengembangan, Anda dapat menambahkan deteksi nilai tertinggi ganda, visualisasi perbandingan rata-rata, serta penanganan data yang tidak seragam (misalnya, nilai kosong atau nol). Program juga dapat diperluas dengan menghitung peringkat siswa untuk tiap mata pelajaran atau indeks prestasi sederhana.
![Ss Hasil](laporan/laporan2/gambar/latihan_2_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_4.png)1




### Praktikum 3
##### a. MethodDasar.java
Kelas ini menekankan desain modular melalui pemisahan tanggung jawab ke dalam beberapa method: tampilan header, tampilan hasil, validasi input, dan operasi aritmetika. Pendekatan ini memperbaiki keterbacaan serta memudahkan pengujian unit pada masing-masing fungsi. Validasi input berbasis ekspresi reguler mencegah kesalahan konversi tipe dan meningkatkan ketahanan program saat menerima data dari pengguna. Operasi pembagian memperhatikan kasus tepi pembagi nol, sehingga tidak menimbulkan perilaku tak terduga. Keluaran disusun rapi dengan label yang konsisten, memudahkan perbandingan antaroperasi. Dari sisi kompleksitas, seluruh operasi aritmetika adalah O(1), sedangkan biaya paling signifikan berasal dari interaksi I/O dengan pengguna. Ekstensi yang disarankan mencakup penanganan lokal (format desimal dengan koma/titik), pengulangan input hingga valid, serta menambah operasi pangkat atau akar untuk cakupan yang lebih luas.
![Ss Hasil](laporan/laporan2/gambar/gambar_3.png)
![Ss Hasil](laporan/laporan2/gambar/gambar_3_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_5.png)




##### b. Latihan3.java
Program ini mengonsolidasikan operasi matematika dasar dalam method yang masing-masing memiliki parameter dan nilai kembalian. Validasi pembagian nol mengembalikan `null` untuk menyatakan operasi tidak valid, yang kemudian ditangani di `main` dengan pesan yang jelas; ini melatih pola pikir defensif (defensive programming). Struktur method yang ringkas mempermudah penyusunan baterai uji (test cases) seperti angka negatif, pecahan, atau bilangan sangat besar/kecil. Kompleksitas tetap konstan per operasi, sehingga fokus utamanya pada kejelasan antarmuka method dan penanganan kesalahan. Program dapat diperluas dengan overload method untuk tipe data lain atau dengan pengecualian kustom (misalnya melempar `IllegalArgumentException` saat pembagi nol). Untuk kebutuhan pelaporan, Anda dapat menambahkan tabel uji yang menunjukkan input, keluaran, dan status validasi setiap skenario.
![Ss Hasil](laporan/laporan2/gambar/latihan_3_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_6.png)




### Praktikum 4
##### a. ArrayMethod.java
Kelas ini menyajikan “alur lengkap” analisis array: input dinamis, tampilan data, ekstraksi metrik (maksimum, minimum, rata-rata), dan pengurutan. Input menggunakan `Scanner` memberi fleksibilitas jumlah elemen, tetapi perlu diperhatikan validasi agar hanya angka yang diterima dan jumlah elemen tidak negatif. Pengurutan menerapkan Bubble Sort, algoritme yang sederhana dan edukatif meskipun kurang efisien untuk data besar (O(n²)); untuk konteks pembelajaran, pemilihan ini tepat karena mudah dipahami langkah-demi-langkah. Pemisahan method membuat kode mudah dipelihara dan mendorong penggunaan ulang, misalnya memanggil `urutkanArray` setelah menambah elemen baru. Keluaran dibuat bertahap—sebelum dan sesudah pengurutan—sehingga perubahan urutan dapat diamati dengan jelas. Ekstensi yang direkomendasikan: menambah pengecekan array kosong, memberikan opsi urut naik/turun, serta mengganti algoritme dengan Selection/Insertion/Quick Sort untuk perbandingan performa. Untuk pelaporan, menambahkan analisis kompleksitas waktu dan ruang akan memperkaya pembahasan.
![Ss Hasil](laporan/laporan2/gambar/gambar_4.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_7.png)




##### b. Latihan4.java
Program ini merupakan versi ringkas yang berfokus pada tiga metrik utama (maksimum, minimum, rata-rata) dan pengurutan. Penempatan logika pada method yang berbeda memperjelas peran tiap bagian dan mendorong pengujian terpisah. Bubble Sort tetap digunakan untuk konsistensi materi, dengan optimasi kecil berupa penghentian dini ketika tidak terjadi pertukaran pada satu putaran. Dengan menampilkan data awal dan hasil akhir, program memfasilitasi verifikasi manual oleh pengguna. Kompleksitas untuk metrik adalah O(n), sedangkan pengurutan O(n²), yang sudah memadai untuk ukuran data kecil sampai menengah. Pengembangan lebih lanjut dapat meliputi perhitungan rentang (range), deviasi standar, dan median agar analisis statistik lebih komprehensif. Program juga dapat dilengkapi dengan antarmuka input dinamis atau pembacaan data dari berkas teks.
![Ss Hasil](laporan/laporan2/gambar/latihan_4_1.png)
![Ss Hasil](laporan/laporan2/gambar/latihan_4_2.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_8.png)




### Praktikum 5
##### a. StringDasar.java
Kelas ini menggabungkan berbagai operasi dasar pemrosesan string: menghitung panjang karakter, jumlah kata, konversi huruf besar/kecil, jumlah vokal, pembalikan string, dan deteksi palindrom. Pemeriksaan palindrom membersihkan karakter non-alfanumerik terlebih dahulu, lalu membandingkan hasil normalisasi dengan versi terbalik; pendekatan ini relevan untuk kalimat yang mengandung spasi atau tanda baca. Penghitungan kata menggunakan pemisah spasi jamak (`\\s+`) sehingga tahan terhadap jarak antarkata yang tidak konsisten. Dari sisi kompleksitas, hampir seluruh operasi bersifat linear O(n) terhadap panjang string. Keluaran disusun berurutan agar pengguna memahami hasil tiap tahap analisis. Untuk pengembangan, Anda dapat menambahkan penghitungan konsonan, deteksi frekuensi huruf/katanya (histogram), serta validasi input kosong. Dalam konteks laporan, sertakan contoh kasus seperti “Kasur ini rusak” agar proses normalisasi palindrom tampak jelas.
![Ss Hasil](laporan/laporan2/gambar/gambar_5.png)
![Ss Hasil](laporan/laporan2/gambar/gambar_5_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_7.png)




##### b. Latihan5.java
Program ini memusatkan perhatian pada manipulasi string yang paling sering diminta di tugas pemrograman dasar: menghitung jumlah vokal, mengubah ke huruf besar/kecil, dan menghitung kata. Struktur fungsinya minimalis namun jelas, sehingga mudah dipakai ulang di program lain. Penggunaan `toLowerCase()` pada penghitungan vokal menyederhanakan logika pencocokan karakter. Penghitungan kata kembali menggunakan `split("\\s+")` untuk mengatasi variasi spasi. Kompleksitas keseluruhan tetap linear terhadap panjang string, yang efisien untuk input wajar. Pengembangan yang dianjurkan: menambahkan validasi input kosong, menghitung jumlah digit/simbol, serta fitur pembersihan teks (trim, normalisasi spasi ganda) sebelum analisis. Untuk dokumentasi, tampilkan contoh masukan beragam—termasuk teks tanpa vokal—dan interpretasi hasilnya.
![Ss Hasil](laporan/laporan2/gambar/latihan_5_1.png)
##### output
![Ss Hasil](laporan/laporan2/gambar/zke_8.png)


### Praktikum 6
##### a. TextProcessing.java
Program ini menyimulasikan alur pemrosesan data nama mulai dari parsing input koma-dipisahkan, analisis dasar (terpanjang/terpendek), pengurutan alfabetis tanpa peka huruf besar/kecil, hingga format nama dan pembuatan username. Metode `prosesDataMahasiswa` memastikan setiap entri dipangkas spasi sehingga daftar nama bersih sebelum dianalisis. `formatTitleCase` menormalisasi kapitalisasi tiap kata, sedangkan `formatKataInitial` menghasilkan rangkaian inisial yang ringkas. `buatUsername` membersihkan karakter nonhuruf dan menggabungkan nama depan serta belakang menjadi identitas yang konsisten; untuk kasus tanpa nama belakang, logika fallback mencegah hasil kosong. Kompleksitas pengurutan menggunakan `sort` berbasis perbandingan umumnya O(n log n), sementara operasi lain cenderung linear terhadap total panjang teks. Perluasan yang berguna antara lain: deteksi nama ganda, penanganan nama dengan partikel (misalnya “bin/binti”, “de”, “van”), serta validasi karakter khusus lokal. Untuk laporan, Anda bisa menambahkan contoh input masif dan ringkasan statistik (jumlah nama unik, distribusi panjang, dan sebagainya).
![Ss Hasil](laporan/laporan2/gambar/gambar_6.png)
![Ss Hasil](laporan/laporan2/gambar/gambar_6_1.png)
![Ss Hasil](laporan/laporan2/gambar/gambar_6_2.png)
![Ss Hasil](laporan/laporan2/gambar/zke_3.png)





''
##### b. Latihan6.java
Program ini berfokus pada validasi format nama dan pembentukan alamat surel berbasis nama lengkap serta domain yang diberikan pengguna. Validasi menggunakan ekspresi reguler yang mengizinkan huruf, spasi, dan tanda hubung, sehingga banyak variasi nama tetap diterima namun angka/karakter khusus ditolak. Pembentukan surel mengubah nama menjadi huruf kecil, membersihkan karakter tak diinginkan, lalu menyusun pola `firstname.lastname@domain`. Logika fallback memastikan surel tetap terbentuk walaupun pengguna hanya memasukkan satu kata nama. Kompleksitas proses dominan pada operasi string linear terhadap panjang input. Untuk peningkatan, Anda dapat menambahkan pemeriksaan domain (misalnya, minimal satu titik, tidak diawali/diakhiri dengan titik), penanganan homonim dengan penambahan angka acak, dan transliterasi huruf beraksen agar sesuai dengan kebijakan sistem surel. Dari sudut dokumentasi, sediakan contoh valid/invalid dan jelaskan alasan penolakannya agar aturan jelas bagi pengguna.
![Ss Hasil](laporan/laporan2/gambar/latihan_6_1.png)
![Ss Hasil](laporan/laporan2/gambar/latihan_6_2.png)

---
## **BAB III – PENUTUP**

### **3.1 Kesimpulan**  
Dari hasil pembelajaran dan praktikum, dapat disimpulkan bahwa:
- **Array** berfungsi untuk menyimpan dan mengelola data dengan tipe yang sama secara efisien.  
- **Method/Function** memungkinkan program ditulis secara modular dan mudah dikembangkan.  
- **String dan Manipulasi String** memberikan kemampuan pengolahan teks yang dinamis serta efisien.  

Ketiga konsep ini menjadi dasar dalam membangun program Java yang kuat, terstruktur, dan mudah dikelola untuk pengembangan sistem yang lebih kompleks.

---

### **3.2 Penutup**  
Pemahaman yang baik terhadap konsep Array, Method, dan String merupakan langkah awal menuju penguasaan paradigma **Object-Oriented Programming (OOP)** dalam Java. Dengan menguasai dasar ini, mahasiswa akan lebih siap dalam menghadapi topik lanjutan seperti *inheritance*, *polymorphism*, serta *data structure and algorithm* yang menjadi fondasi utama dalam rekayasa perangkat lunak modern.

---

### **3.3 Referensi**  
1. Oracle. *The Java™ Tutorials — Learning the Java Language: Arrays and Methods.* [https://docs.oracle.com/javase/tutorial/](https://docs.oracle.com/javase/tutorial/)  
2. Deitel, H. M., & Deitel, P. J. (2017). *Java: How to Program (11th Edition).* Pearson Education.  
3. Liang, Y. D. (2020). *Introduction to Java Programming and Data Structures.* Pearson.  
4. Wahana Komputer. (2021). *Pemrograman Java untuk Pemula dan Lanjutan.* Andi Publisher.  
