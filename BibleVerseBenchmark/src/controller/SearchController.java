package controller;

import javax.faces.bean.ManagedBean; 
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Scripture;
import beans.Search;
import business.SearchBusinessInterface;

@ManagedBean
@SessionScoped
public class SearchController {
	@Inject
	SearchBusinessInterface service;
	
	
	public String findVerse(Search search) {
		//api link to find the scripture... valid on google testing
		String link = "https://api.biblia.com/v1/bible/content/LEB.txt.txt?passage="+search.getBook() +search.getChapter() +"."+search.getVerse() + "&callback=myCallbackFunction&key=fd37d8f28e95d3be8cb4fbc37e15e18e";
		System.out.println(link);
		Scripture holy = new Scripture();
		//set the link as the scripture
		holy.setScripture(service.findVerse(link));
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("scripture", holy);
		//uses the service class to grab verse from link
		service.findVerse(link);
		return "ScriptureResults.xhtml";
		
	}
	
	
	
	
	
}