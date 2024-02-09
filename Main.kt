import processing.core.PApplet
import processing.core.PVector

class Hello: PApplet() {
    override fun settings() {
        size(800, 800, P2D)
    }

    override fun setup() {
    }

    override fun draw() {
        background(0)
        stroke(255)
        noFill()
        repeat(50) {
            val r = it * 10
            ellipse(mouseX * 1f,mouseY * 1f, r * 2f,r * 2f)
        }
    }

    override fun mousePressed() {

    }

}

private operator fun PVector.times(mag: Float): PVector {
    return PVector.mult(this, mag)
}

fun main() {
    PApplet.main(arrayOf(Hello::class.java.name))
}
