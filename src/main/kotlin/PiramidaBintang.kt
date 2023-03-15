class PiramidaBintang {
    fun methodpiramidabintang(n : Int){
        for (i in 1 .. n) {
            for(k in i..(n - 1))
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