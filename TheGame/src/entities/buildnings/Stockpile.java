package entities.buildnings;

import java.util.ArrayList;

import org.javatuples.Pair;

import entities.resources.Resources;
import entities.resources.Stone;
import entities.worker.Worker;

public class Stockpile extends Building  {
	private int BUILD_TIME = 30; 
	private int NR_OF_WORKERS = 1;
	private String NAME = "Stockpile";
	
	public Stockpile() {
		super.workers = new ArrayList<Worker>();
		super.buildTime = BUILD_TIME;
		super.buildningName = this.NAME;
		//this.setNeedResources(new ArrayList<Pair<Resources,Integer>>());
		//Pair<Resources, Integer> p = new Pair<Resources, Integer>(new Stone(), 3);
		//super.getNeedResources().add(p);
		
	}
}
