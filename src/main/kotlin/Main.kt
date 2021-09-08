package main.kotlin

import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession

/**
 * Created by sanasov on 01.04.2017.
 */

fun main() {
    val botsApi = TelegramBotsApi(DefaultBotSession::class.java)
    botsApi.registerBot(SashaBot())
}
