package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile("Alman Hadi Pratama", 21, 178)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()


    /**
    Challenge:
    ===============Class A Afternoon===============
    4Keys -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    CELESTIAL -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Strix -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Fast and Serious -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Kuda Terbang -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Geek Genius's Team -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Enforcers -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    HA HENG -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    End Game -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Fly Without Wings -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Unity Force -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    11:11 ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x

    ===============Class B Afternoon===============
    FRINIGHT -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
    EnviGrowth -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
    ZWH (Zero Waste Heroes) -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    Serenity -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    UNLIMITED INNOVATION -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Procyon -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Beta+ -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    Elevens United -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    OmniDev -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    COSMOPOLITE -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    GrowZen -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Unpredictable (Group Merge 12)
    NusaVote -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Vortex -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */


    // Memulai sesuatu aktivitas = 20
       hero.jalan() //-1
       hero.jalan() //-1
       hero.lari()  //-2
       hero.makan() //+2
       hero.minum() //+2
       // 20-1-1-2+2+2 = 16

    // Istirahat sebentar tapi gak jadi
       hero.lompat() //-2
       hero.makan()  //+2
       hero.duduk()  //-1
       hero.jalan()  //-1
       // 16-2+2-1-1 = 14

    // Lanjut cuy
       hero.jalan() //-1
       hero.makan() //+2
       hero.minum() //+2
       hero.lompat() //-2
       hero.duduk() //+1
       hero.lompat() //-2
       // 14-1+2+2-2+1-2 = 14

    // Udahan Cok Capek Gw
       hero.lompat() //-2
       hero.minum() //+2
       hero.lompat() //-2
       hero.minum()  //+2
       hero.duduk() //+1
       hero.minum() //+2
       // 14-2+2-2+2+1+2 = 17


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()


}