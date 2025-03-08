package easy

/**
 * https://leetcode.com/problems/design-parking-system/description/
 */
class ParkingSystem(
    big: Int,
    medium: Int,
    small: Int
) {

    private val parkingLot: Map<Int, Car> = mapOf(
        1 to BigCar(big),
        2 to MediumCar(medium),
        3 to SmallCar(small),
    )

    fun addCar(carType: Int): Boolean {
        val car = parkingLot.getOrDefault(carType, NullCar)

        if (car.hasParkingSpace()) {
            car.minus()
            return true
        }

        return false
    }
}

interface Car {

    fun hasParkingSpace(): Boolean

    fun minus()
}

class BigCar(private var slot: Int) : Car {

    override fun hasParkingSpace() = slot > 0

    override fun minus() {
        this.slot--
    }
}

class MediumCar(private var slot: Int) : Car {

    override fun hasParkingSpace() = slot > 0

    override fun minus() {
        this.slot--
    }
}

class SmallCar(private var slot: Int) : Car {

    override fun hasParkingSpace() = slot > 0

    override fun minus() {
        this.slot--
    }
}

object NullCar : Car {
    override fun hasParkingSpace(): Boolean {
        return false
    }

    override fun minus() {
        // Nothing
    }
}
