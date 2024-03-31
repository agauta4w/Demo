package io.javaBrains.SpringBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


//In Spring business services are typically Singleton .

@Service    //@Service Annotation here are called as sterioType Annotations .
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("AYush", "AYush frameWork","AYush Framework Description"),
			new Topic("Champ", "Java frameWork","Java Framework Description"),
			new Topic("Aj", "AJ frameWork","AJ Framework Description")
			));
	
	public List<Topic> getAllList(){
		return topics;
		
	}
	
	public Topic getId(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0 ; i <topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;			
			}
		}	
	}
	
	public void delTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
