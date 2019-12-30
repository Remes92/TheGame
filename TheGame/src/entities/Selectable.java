package entities;

public abstract class  Selectable {
	
	private boolean selected = false;
	


	public boolean isSelected() {
		return selected;
	}


	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
