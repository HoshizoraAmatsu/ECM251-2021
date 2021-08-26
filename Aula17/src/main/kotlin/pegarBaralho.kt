import controller.DeckController

fun main()
{
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)
    val carta2 = deckController.drawCard()
    print(carta2)
}