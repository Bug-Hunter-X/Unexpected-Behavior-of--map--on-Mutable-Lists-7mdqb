```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } //This will work fine
    println(result) 
    val anotherList = mutableListOf(1,2,3,4,5)
    val mappedList = anotherList.map {it * 2} //This will not modify the original list
    println(anotherList)
    println(mappedList) 
    val yetAnotherList = mutableListOf(1,2,3,4,5)
    yetAnotherList.mapTo(yetAnotherList){it * 2} //This will modify original list
    println(yetAnotherList) 
}
```