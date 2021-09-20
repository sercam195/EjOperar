fun main(){

println(entero(3))
    par(6)

}

fun entero(num : Int) : Int {
    var numero = num
    if(numero>0) {
        numero *= 2
        numero += 3
    }
        else if (numero<0) {
        numero /=2
        numero -= 3
    }

    return numero

}

fun par(num : Int) {
var numero2 = num
    if (numero2%2==0)
    {
        return println("$numero2 es par")
    }
    else return println("$numero2 es impar")

}