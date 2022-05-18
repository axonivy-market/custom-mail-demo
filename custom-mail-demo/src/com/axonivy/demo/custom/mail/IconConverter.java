package com.axonivy.demo.custom.mail;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ch.ivyteam.ivy.workflow.WorkflowPriority;

@ManagedBean
@ApplicationScoped
public class IconConverter {

	public String getPriorityMailIcon(WorkflowPriority priority) {
		switch (priority) {
			case EXCEPTION:
				return "exclamation-mail";
			case HIGH:
				return "arrow-up-mail";
			case LOW:
				return "arrow-down-mail";
			case NORMAL:
				return "arrow-right-mail";
		}
		return "";
	}
}
