class PlussBintang {
    fun methodplussbintang(n : Int){
        for(i in 1..n){
            for(j in 1..n){
                if (i == ((n / 2) + 1) || j == ((n / 2) + 1))
                {
                    print("*")
                }
                else
                {
                    print(" ")
                }
            }
            println()
        }
    }
}