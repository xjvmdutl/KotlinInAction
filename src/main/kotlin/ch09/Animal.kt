package ch09

open class Animal {
    fun feed(){
        //Logic
    }
}
/*
class Herd<T: Animal>{
    val size: Int get() = ...
    operator fun get(i: Int): T{
        //logic

    }
}
fun feedAll(animal: Herd<Animal>){
    for(i in 0 until animal.size){
        animal[i].feed()
    }
}

class Cat: Animal(){
    fun cleanLitter(){

    }
}
fun takeCareOfCats(cats: Herd<Cat>){
    for(i in 0 until cats.size){
        cats[i].cleanLitter()
        //feedAll(cats) //inferred type is Herd<Cat> but Herd<Animal> was expected 라는 오류가 발생
    }
}
 */
/*
class Herd<out T: Animal>{ //T는 이제 공변
    val size: Int get() = ...
    operator fun get(i: Int): T{
        //logic

    }
}
fun feedAll(animal: Herd<Animal>){
    for(i in 0 until animal.size){
        animal[i].feed()
    }
}

class Cat: Animal(){
    fun cleanLitter(){

    }
}
fun takeCareOfCats(cats: Herd<Cat>){
    for(i in 0 until cats.size){
        cats[i].cleanLitter()
    }
    feedAll(cats) //캐스팅 할 필요 없다
}
 */