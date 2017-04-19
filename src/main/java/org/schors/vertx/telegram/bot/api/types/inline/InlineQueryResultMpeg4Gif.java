package org.schors.vertx.telegram.bot.api.types.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.schors.vertx.telegram.bot.api.types.InputMessageContent;

public class InlineQueryResultMpeg4Gif extends InlineQueryResult {
    private Type type;
    private String id;
    @JsonProperty("mpeg4_url")
    private String mpeg4Url;
    @JsonProperty("mpeg4_width")
    private Integer mpeg4Width;
    @JsonProperty("mpeg4_height")
    private Integer mpeg4Height;
    @JsonProperty("thumb_url")
    private String thumbUrl;
    private String title;
    private String caption;
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

    public InlineQueryResultMpeg4Gif() {
        this.type = Type.mpeg4_gif;
    }

    public InlineQueryResultMpeg4Gif(Type type, String id, String mpeg4Url, Integer mpeg4Width, Integer mpeg4Height, String thumbUrl, String title, String caption, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent) {
        this.type = type;
        this.id = id;
        this.mpeg4Url = mpeg4Url;
        this.mpeg4Width = mpeg4Width;
        this.mpeg4Height = mpeg4Height;
        this.thumbUrl = thumbUrl;
        this.title = title;
        this.caption = caption;
        this.replyMarkup = replyMarkup;
        this.inputMessageContent = inputMessageContent;
    }

    public Type getType() {
        return type;
    }

    public InlineQueryResultMpeg4Gif setType(Type type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public InlineQueryResultMpeg4Gif setId(String id) {
        this.id = id;
        return this;
    }

    public String getMpeg4Url() {
        return mpeg4Url;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Url(String mpeg4Url) {
        this.mpeg4Url = mpeg4Url;
        return this;
    }

    public Integer getMpeg4Width() {
        return mpeg4Width;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Width(Integer mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
        return this;
    }

    public Integer getMpeg4Height() {
        return mpeg4Height;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Height(Integer mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
        return this;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public InlineQueryResultMpeg4Gif setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InlineQueryResultMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public InlineQueryResultMpeg4Gif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public InlineQueryResultMpeg4Gif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public InlineQueryResultMpeg4Gif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }
}
