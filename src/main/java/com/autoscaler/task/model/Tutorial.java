package com.autoscaler.task.model;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "tutorials")
public class Tutorial {
	 @Id
	  private String pid;

	  private String title;
	  private String description;
	  private boolean published;

	  public Tutorial() {

	  }

	  public Tutorial(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }
	  public String getpId() {
	    return pid;
	  }
	  public String getTitle() {
		    return title;
		  }

		  public void setTitle(String title) {
		    this.title = title;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public void setDescription(String description) {
		    this.description = description;
		  }

		  public boolean isPublished() {
		    return published;
		  }

		  public void setPublished(boolean isPublished) {
		    this.published = isPublished;
		  }
		  @Override
		  public String toString() {
		    return "Tutorial [id=" + pid + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
		  }

}
