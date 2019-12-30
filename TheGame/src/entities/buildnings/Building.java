package entities.buildnings;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;

import entities.Selectable;
import entities.resources.Resources;
import entities.worker.Worker;


public abstract class Building extends Selectable {
	protected int buildTime;
	protected ArrayList<Worker> workers;
	protected String buildningName;
	private List<Pair<Resources, Integer>> needResources;
	protected int efficiency;
	protected BuildingState state;
	
	protected int calcEfficiency(ArrayList<Worker> wList,int maxNrOfWorkers) {
		float efficiency = (float)wList.size()/(float)maxNrOfWorkers;
		if(efficiency< 0)
			return 0;
		
		return (int)(efficiency*100);
	}
	
	protected void addWroker(Worker worker) {
		this.workers.add(worker);
	}

	public List<Pair<Resources, Integer>> getNeedResources() {
		return needResources;
	}

	public void setNeedResources(Pair<Resources, Integer> needResources) {
		if(this.needResources == null) {
			this.needResources = new ArrayList<Pair<Resources,Integer>>();
		}
		this.needResources.add(needResources);
	}
}
