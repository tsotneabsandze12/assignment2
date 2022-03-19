package point
import kotlin.math.pow
import kotlin.math.sqrt

class Point(var x: Int = 0, var y: Int = 0) {

    fun calculateDistance(other: Point) : Double
           = sqrt((other.x - x.toDouble()).pow(2.0) + (other.y - y.toDouble()).pow(2.0));

    fun rotateSymmetrically(){
        x = -x;
        y = -y;
    }
    override fun equals(other: Any?): Boolean
        = (other is Point) && x == other.x && y == other.y

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String = "{X=$x; Y=$y}";
}