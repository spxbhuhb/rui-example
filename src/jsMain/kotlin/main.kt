import hu.simplexion.rui.runtime.dom.RuiDOMAdapter
import hu.simplexion.rui.runtime.dom.html.Button
import hu.simplexion.rui.runtime.dom.html.Text
import hu.simplexion.rui.runtime.rui

fun main() {
    rui(RuiDOMAdapter()) {
        var counter = 0
        Button("Counter: $counter") { counter++ }
        Text("You've clicked $counter times.")
    }
}