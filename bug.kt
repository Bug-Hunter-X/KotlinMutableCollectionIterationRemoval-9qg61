fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //The following code will throw ConcurrentModificationException
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    for (i in list2) {
        if (i % 2 == 0) {
            list2.remove(i)
        }
    }
    println(list2)
}