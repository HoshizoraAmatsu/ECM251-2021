package shared

class DeckOfCardsAPIConstants
{
    companion object
    {
        val baseUrl: String = "https://deckofcardsapi.com/api/deck"
        val newDeckUrl: String = "$baseUrl/new/shuffle/?deck_count=1"
        fun getNewCard(deckId:String) = "$baseUrl/$deckId/draw/?count=1"

    }
}