package FirstHeadDesign.Observe;

public class ObserveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData data=new WeatherData();
		Board board=new Board(data);
		data.setWeather(10, 20);
		data.setWeather(11, 21);
	}

}
