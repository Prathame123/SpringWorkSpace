package com.dp.model;

public class House {
	
	private String foundation;
	private String strcture;
	private String roof;
	private boolean hasGarage;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getStrcture() {
		return strcture;
	}
	public void setStrcture(String strcture) {
		this.strcture = strcture;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public boolean isHasGarage() {
		return hasGarage;
	}
	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}
	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}
	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}
	public boolean isHasGarden() {
		return hasGarden;
	}
	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}
	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", strcture=" + strcture + ", roof=" + roof + ", hasGarage="
				+ hasGarage + ", hasSwimmingPool=" + hasSwimmingPool + ", hasGarden=" + hasGarden + "]";
	}
}
