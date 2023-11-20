package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun bagi(a: Int, b: Int): Int {
        return try {
            a / b
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan: ${e.message}")
            0 // Mengembalikan nilai default jika terjadi kesalahan
        }
    }

    fun main() {
        val hasil: Int = bagi(10, 0)
        println("Hasil pembagian: $hasil")
    }


}