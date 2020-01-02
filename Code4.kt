package code4
fun max(num1:Int, num2:Int, num3:Int):Int{
    var maxNum = num1
    if(maxNum < num2)
        maxNum = num2
    if(maxNum < num3)
    	maxNum = num3
    return maxNum
}
fun main(){
	println(max(5, 19, 8))
}