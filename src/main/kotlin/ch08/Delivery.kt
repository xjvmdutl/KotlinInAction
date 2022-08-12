package ch08

enum class Delivery {
    STANDARD, EXPEDITED
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(
    delivery: Delivery
): (Order) -> Double { //함수를 반환하는 함수를 선언한다
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount } //함수에서 람다를 반환
    }
    return { order -> 1.2 * order.itemCount }
}