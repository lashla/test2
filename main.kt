fun main() {
    val a = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
    val b = intArrayOf(121, 14641, 20736, 361, 25921, 361, 20736, 361)
    println(comp(a, b))
}


fun comp (a: IntArray?, b: IntArray?): Boolean{
    val aLength = a?.size
    val bool: Boolean = true
    if (aLength != null) {
        for(i in 0..aLength.toInt()){
            if (b != null) {
                if (!b.contains(i*i)) bool = false
            }
        }
    }
retun bool
}
