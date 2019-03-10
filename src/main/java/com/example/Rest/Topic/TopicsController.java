package com.example.Rest.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TopicsController {
@Autowired
    public TopicService topicService;


    public TopicsController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics")
    public List<Topic> allTopics()
    {
     return topicService.getAllTopics();

    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable int id)
    {
     return topicService.getTopic(id);
    }
    @PostMapping("topics")
    public void postTopic(@RequestBody Topic topic)
    {
       topicService.postTopic(topic);
    }
    @DeleteMapping("topics/{id}")
    public void removeTopic(@RequestBody Topic topic)
    {
        topicService.removeTopic(topic);
    }
    @PostMapping("/topics/{id}/update")
    public void updateTopic(@RequestBody Topic topic,@PathVariable int id)
    {
        topicService.updateTopic(topic,id);

    }
}
