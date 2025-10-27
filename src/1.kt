import kotlin.random.Random

fun toTextik(z: Int): String{
    return when(z){
        1 -> "Камень"
        2 -> "Ножницы"
        3 -> "Бумага"
        else -> "Хз"
    }
}

fun main() {
    while (true) {
        println("Сделай свой выбор \n 1 - камень \n 2 - ножницы \n 3 - бумага")
        val input = readln().toInt()
        if (input !in 1..3){

        }else{
            println("Введите по примеру")
            continue
        }
        val Compek = Random.nextInt(1,4)

        val TextP = toTextik(input)
        val TextK = toTextik(Compek)

        println("Ваш выбор $TextP")
        println("Выбор Компика $TextK")

        if (input == Compek){
            println("Ничья\n")
            continue
        }

        when {
            input == 1 && Compek == 2 -> println("Ура победа, Камень ломает ножницы")
            input == 2 && Compek == 3 -> println("Ура победа, Ножницы режут бумагу")
            input == 3 && Compek == 1 -> println("Ура победа, Бумага накрывает камень")
            else -> println("Компьютер победил: $TextK бьет $TextP")
        }
        break
    }
}