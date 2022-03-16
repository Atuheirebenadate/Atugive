fun main(){
   myWork()
    var x=(10%3)
    println(x)
    println(me("Benadette", 22))

}
fun myWork(){
    var stmt="codeHive"
    var char1=stmt[4]
    var char2=stmt[5]
    var char3=stmt[6]
    var char4=stmt[7]
    println(char1.toString()+char2+char3+char4)
good()
}
fun numb(numb1:Int,numb2:Int):Int{
    var number=numb1%numb2
    return number
}
fun me(name:String,age:Int):String{
    var say = ("Hi, my name is $name and I am $age years old")
    return say

}
fun good(){
    var x="WOMAN".length
    println(x)
}