val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
val b = intArrayOf(121, 14641, 20736, 361, 25921, 361, 20736, 361)

fun comp (a: IntArray?, b: IntArray?): Boolean{
    var res = 0
    val aLength = a?.size
    val bLength = b?.size
    for(i in 0..aLength!!){
        for (n in 0..bLength!!){
            if ((b[n] / a[i]) == b[n]){
                res++
            }
        }
    }
    println(res == aLength)
    return (res == aLength)
}
