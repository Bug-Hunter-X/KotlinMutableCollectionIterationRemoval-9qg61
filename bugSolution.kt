fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]

    // Solution 2: Creating a new list
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = mutableListOf<Int>()
    for (i in list2) {
        if (i % 2 != 0) {
            newList.add(i)
        }
    }
    println(newList) // Output: [1, 3, 5]
    
    //Solution 3: Using removeIf
    val list3 = mutableListOf<Int>(1,2,3,4,5)
    list3.removeIf { it % 2 == 0 }
    println(list3) // Output: [1,3,5]
} 