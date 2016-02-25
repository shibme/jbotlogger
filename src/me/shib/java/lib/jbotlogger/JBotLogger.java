package me.shib.java.lib.jbotlogger;

import me.shib.java.lib.jbotstats.BotStatsConfig;
import me.shib.java.lib.jbotstats.JBotStats;
import me.shib.java.lib.jtelebot.types.*;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public final class JBotLogger extends JBotStats {

    private Logger logger;

    public JBotLogger(BotStatsConfig botStatsConfig, User botInfo) {
        super(botStatsConfig, botInfo);
        logger = Logger.getLogger(botStatsConfig.getBotStatsClassName() + "-" + botInfo.getUsername());
        String definedLevel = botStatsConfig.getConfig("logLevel");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        if (definedLevel != null) {
            switch (definedLevel.toUpperCase()) {
                case "FINEST":
                    logger.setLevel(Level.FINEST);
                    handler.setLevel(Level.FINEST);
                    break;
                case "FINER":
                    logger.setLevel(Level.FINER);
                    handler.setLevel(Level.FINER);
                    break;
                case "FINE":
                    logger.setLevel(Level.FINE);
                    handler.setLevel(Level.FINE);
                    break;
                case "OFF":
                    logger.setLevel(Level.OFF);
                    handler.setLevel(Level.OFF);
                    break;
                case "CONFIG":
                    logger.setLevel(Level.CONFIG);
                    handler.setLevel(Level.CONFIG);
                    break;
                case "INFO":
                    logger.setLevel(Level.INFO);
                    handler.setLevel(Level.INFO);
                    break;
                case "SEVERE":
                    logger.setLevel(Level.SEVERE);
                    handler.setLevel(Level.SEVERE);
                    break;
                case "WARNING":
                    logger.setLevel(Level.WARNING);
                    handler.setLevel(Level.WARNING);
                    break;
                default:
                    logger.setLevel(Level.ALL);
                    handler.setLevel(Level.ALL);
            }
        } else {
            logger.setLevel(Level.ALL);
            handler.setLevel(Level.ALL);
        }
        logger.addHandler(handler);
    }

    @Override
    public String getAnalyticsRedirectedURL(long user_id, String url) {
        return null;
    }

    @Override
    public void onReceivingUpdate(Update update, IOException e, Date accessTime) {
        String enteringMethod = "onReceivingUpdate";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{update, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onGettingMe(User response, IOException e, Date accessTime) {
        String enteringMethod = "onGettingMe";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onGettingUserProfilePhotos(long user_id, int offset, int limit, UserProfilePhotos response, IOException e, Date accessTime) {
        String enteringMethod = "onGettingUserProfilePhotos";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{user_id, offset, limit, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onGettingFile(String file_id, TelegramFile response, IOException e, Date accessTime) {
        String enteringMethod = "onGettingFile";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{file_id, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingMessage(ChatId chat_id, String text, boolean disable_notification, ParseMode parse_mode, boolean disable_web_page_preview, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingMessage";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, text, disable_notification, parse_mode, disable_web_page_preview, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onForwardingMessage(ChatId chat_id, ChatId from_chat_id, long message_id, boolean disable_notification, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onForwardingMessage";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, from_chat_id, message_id, disable_notification, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingPhoto(ChatId chat_id, TelegramFile photo, boolean disable_notification, String caption, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingPhoto";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, photo, disable_notification, caption, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingAudio(ChatId chat_id, TelegramFile audio, boolean disable_notification, int duration, String performer, String title, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingAudio";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, audio, disable_notification, duration, performer, title, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingDocument(ChatId chat_id, TelegramFile document, boolean disable_notification, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingDocument";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, document, disable_notification, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingSticker(ChatId chat_id, TelegramFile sticker, boolean disable_notification, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingSticker";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, sticker, disable_notification, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingVideo(ChatId chat_id, TelegramFile video, boolean disable_notification, int duration, String caption, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingVideo";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, video, disable_notification, duration, caption, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingVoice(ChatId chat_id, TelegramFile voice, boolean disable_notification, int duration, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingVoice";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, voice, disable_notification, duration, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingLocation(ChatId chat_id, float latitude, float longitude, boolean disable_notification, long reply_to_message_id, ReplyMarkup reply_markup, Message response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingLocation";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, latitude, longitude, disable_notification, reply_to_message_id, reply_markup, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onAnsweringInlineQuery(String inline_query_id, InlineQueryResult[] results, String next_offset, boolean is_personal, int cache_time, boolean response, IOException e, Date accessTime) {
        String enteringMethod = "onAnsweringInlineQuery";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{inline_query_id, results, next_offset, is_personal, cache_time, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onSendingChatAction(ChatId chat_id, ChatAction action, boolean response, IOException e, Date accessTime) {
        String enteringMethod = "onSendingChatAction";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{chat_id, action, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

    @Override
    public void onOtherData(String methodName, Map<String, Object> objectMap, Object response, IOException e, Date accessTime) {
        String enteringMethod = "onOtherData";
        logger.entering(this.getClass().getName(), enteringMethod, new Object[]{methodName, objectMap, response, accessTime});
        if (e != null) {
            logger.throwing(this.getClass().getName(), enteringMethod, e);
        }
    }

}
