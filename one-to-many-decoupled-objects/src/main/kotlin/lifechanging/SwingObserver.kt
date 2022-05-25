package lifechanging

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JScrollPane

class SwingObserverExample {

    fun go(){
        val button = JButton("Should I Do it?")
        button.addActionListener(AngelListener())
        button.addActionListener(DevilListener())
        val frame = JFrame("Hello, Kotlin/Swing")
        frame.contentPane.add(button, BorderLayout.CENTER)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.size = Dimension(600, 400)
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }

    class DevilListener : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println("Do it! Come one you")
        }

    }

    class AngelListener : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println("Don't This will cause only harm")
        }

    }
}



fun main() {
    val subject = SwingObserverExample()
    subject.go()

}