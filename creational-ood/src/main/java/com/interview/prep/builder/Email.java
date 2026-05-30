package com.interview.prep.builder;

import java.util.List;

public class Email {

    private final String to;
    private final List<String> cc;
    private final boolean isAttachement;
    private final boolean isSecured;
    private final String body;
    private final String subject;

    private Email(EmailBuilder emailBuilder)
    {
        this.to = emailBuilder.to;
        this.cc = emailBuilder.cc;
        this.isAttachement = emailBuilder.isAttachment;
        this.isSecured = emailBuilder.isSecured;
        this.body = emailBuilder.body;
        this.subject = emailBuilder.subject;
    }

    public static class EmailBuilder
    {
        private final String to;
        private  List<String> cc;
        private  boolean isAttachment;
        private  boolean isSecured;
        private  String body;
        private  String subject;

        public EmailBuilder(String to)
        {
            this.to = to;
        }

        public EmailBuilder cc(List<String> cc)
        {
            this.cc = List.copyOf(cc);
            return this;
        }

        public EmailBuilder isSecured(boolean isSecured)
        {
            this.isSecured = isSecured;
            return  this;
        }

        public EmailBuilder isAttachment(boolean isAttachment)
        {
            this.isAttachment = isAttachment;
            return  this;
        }

        public EmailBuilder subject(String subject)
        {
            this.subject = subject;
            return this;
        }

        public EmailBuilder body (String body)
        {
            this.body = body;
            return  this;
        }

        public  Email build()
        {
            return new Email(this);
        }
    }
}
