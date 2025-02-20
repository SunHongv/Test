package FirstHeadDesign.Observe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	List<Observer> list=new ArrayList<>();
	private int tem;
	private int hum;
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		if(o!=null) {
			list.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i=list.indexOf(o);
		if(i>=0) {
			list.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : list) {
			observer.update( tem, hum);
		}
	}
	public void setWeather(int tem,int hum) {
		this.tem=tem;
		this.hum=hum;
		notifyObservers();
	}
}
