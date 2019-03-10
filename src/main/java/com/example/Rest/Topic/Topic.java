package com.example.Rest.Topic;

public class Topic {
    int id;
    String topic;
    String description;

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic(int id, String topic, String description) {
        this.id = id;
        this.topic = topic;
        this.description = description;
    }
    public Topic()
    {

    }
}
