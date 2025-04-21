package com.example.mobile

fun main(args: Array<String>) {
    var age = array0f(1,2,3)
    println(age)
    println("The first element of age is "+ age[0])
    println("The second element of age is "+ age[1])
    println("The third element of age is "+ age[2])

    println(" **************************")

    var name = array0f("ram","shyam", "Hari")
    name [1] = "Pratikshya"
    println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])
    println(name.size)


    //we can add value only after our array is initialize

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add( index:1, element: 20)
    age1.add(5)

//we can add value directly in array while initializing variables.
    var age2 = arrayList0f<Int>(1,20,5)

    var name = arrayListOf<String>("sandis","ram","shyam")
    name.add("hari")
    name. add ( index:4, element:"Sita")

    name. remove ( element: "shyam")
    name. removeAt ( index: 0)

    println(name)

    var mixArrayList = arrayList0f<Any>("hello", 5, 2.0)
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);


}