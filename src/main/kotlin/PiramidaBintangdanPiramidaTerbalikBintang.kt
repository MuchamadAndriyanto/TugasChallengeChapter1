class PiramidaBintangdanPiramidaTerbalikBintang {
    fun methodpiramidabintangdanpiramidaterbalikbintang(n1 : Int, n2: Int){
        for (i in 1..n1) {
            for(k in i..(n1-1))
            {
                print(" ")
            }

            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }

        for (i in n2 downTo 1) {
            for(k in i..(n1-1))
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