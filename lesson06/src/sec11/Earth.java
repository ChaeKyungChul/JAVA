package sec11;

public class Earth {

	//상수로 double 타입으로 earth_radius 를 선언하고 6400을 대입
	//상수 더블타입으로 earth_surface.area 를 선언하고 지구의 원주율을 대입한다.
	//실행클래스에서 지구의 반지름 00km 지구의 표면적 00 km^2 를  출력한다
	
	//상수 선언과 동시에 초기화
	static final double EARTH_RADIUS =  6400;
	
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//정적불럭을 이용하여 초기화
	static {
		EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}			
}

//반지름 * 반지름 2파이알
