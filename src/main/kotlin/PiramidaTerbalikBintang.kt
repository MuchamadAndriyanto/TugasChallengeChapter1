class PiramidaTerbalikBintang {
    fun methodpiramidaterbalikbintang(n : Int){
        for (i in n downTo 1) {
            for(k in i..(n-1))
            {
                print(" ")
            }

            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }
    }
}