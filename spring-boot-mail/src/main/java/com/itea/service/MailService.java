package com.itea.service;

/**
 * @ClassName MailService
 * @Describe
 * @create 2019-03-21 16:54
 * @Version 1.0
 **/
public interface MailService {

    public void sendSimpleMail(String to, String subject, String content);

    public void sendHtmlMail(String to, String subject, String content);

    public void sendAttachmentsMail(String to, String subject, String content, String filePath);

    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
