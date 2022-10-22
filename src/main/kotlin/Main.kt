fun main(args: Array<String>) {

      val list = mutableListOf<Int>()
    for (i in 1..10) {
        list.add(i)
    }
        printList(list)
}
fun printList(list: MutableList<Int>){
    print(list)
}