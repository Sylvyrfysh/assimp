package X

import assimp.Importer
import io.kotlintest.specs.StringSpec



class mozd02x : StringSpec() {



    init {

        val mozd02x = "mozd02.X"
        val mozd02x_a = "mozd02.assbin"

        mozd02x {
            with(Importer().readFile(x + mozd02x)!!) {
                printNodeNames(rootNode)
                with(rootNode) {

                }
            }
        }
    }
}