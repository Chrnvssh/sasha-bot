package main.kotlin

import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Message
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

class SashaBot : TelegramLongPollingBot(DefaultBotOptions()) {
    override fun getBotToken(): String = "1932444510:AAGwfvHR4JgJNvJV_crwJ24BpP0JClZ1bKo"
    override fun getBotUsername(): String = "Chrnvssh_bot"

    override fun onUpdateReceived(update: Update) {
        val msg: Message =update.message
        sendTextMessage(msg.chatId, msg.text)
    }


    private fun sendTextMessage(chatId: Long, responseMessage: String) {
        val sendMessage = SendMessage()
        sendMessage.enableMarkdownV2(false)
        sendMessage.enableHtml(true)
        sendMessage.chatId = chatId.toString()
        sendMessage.text = responseMessage
        try {
            execute(sendMessage)
        } catch (e: TelegramApiException) {

        }
    }
}