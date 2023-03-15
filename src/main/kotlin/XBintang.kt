class XBintang {
    fun methodXbintang(n : Int){
        for(i in 1..n){
            for(j in 1..n){
                if(j==i || (j==n - i + 1))
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