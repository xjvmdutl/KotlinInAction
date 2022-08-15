package ch09

interface Transformer<T> {
    fun transform(t: T): //( 인 위치)
            T //아웃 위치
}