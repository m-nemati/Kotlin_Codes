package code5
fun main(){
	val arrNames = arrayOf("Ali", "Reza", "Hasan")
    val arrScores = arrayOf<Int>(10, 19, 8, 14)
    
    for(item in 0..arrNames.size -1){
        println(arrNames.get(item))
    }
    
    println(arrScores.last())
}