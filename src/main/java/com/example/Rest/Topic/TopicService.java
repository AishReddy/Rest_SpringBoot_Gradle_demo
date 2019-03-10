package com.example.Rest.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> list = new ArrayList<Topic>(Arrays.asList(new Topic(1, "aishwarya", "have to aish"),
            new Topic(2, "vishnu", "silent killer"),
            new Topic(3, "harish", "down to earth")));

    public List<Topic> getAllTopics() {
        return list;
    }

    public Topic getTopic(int id) {

        return list.stream().filter(x->x.getId()==id).findFirst().get();

    }

    public void postTopic(Topic topic) {
    list.add(topic);
    }

    public void removeTopic(Topic topic) {
        list.removeIf(t->t.getId()==topic.getId());
    }

    public void updateTopic(Topic topic ,int id) {

        for(int i=0;i<list.size();i++)
        {
           Topic t=list.get(i);
           if(t.getId()==id)
           {
               list.set(i,topic);
           }

        }
    }
}
