package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class OptgroupAction extends ActionSupport {

	private String skillsArea;

	public String getSkillsArea() {
		return skillsArea;
	}

	public void setSkillsArea(String skillsArea) {
		this.skillsArea = skillsArea;
	}

	
	
	// ¥D¤èªk
	public String execute() {
		System.out.println(OptgroupAction.class.getName() + ",execute()...");
		System.out.println("skillsArea = " + skillsArea);

		if (skillsArea == null || "".equals(skillsArea)) {
			return Action.INPUT;
		} else {
			return Action.SUCCESS;
		}
	} // end execute()

}
