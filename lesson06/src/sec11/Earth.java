package sec11;

public class Earth {

	//����� double Ÿ������ earth_radius �� �����ϰ� 6400�� ����
	//��� ����Ÿ������ earth_surface.area �� �����ϰ� ������ �������� �����Ѵ�.
	//����Ŭ�������� ������ ������ 00km ������ ǥ���� 00 km^2 ��  ����Ѵ�
	
	//��� ����� ���ÿ� �ʱ�ȭ
	static final double EARTH_RADIUS =  6400;
	
	//��� ����
	static final double EARTH_SURFACE_AREA;
	
	//�����ҷ��� �̿��Ͽ� �ʱ�ȭ
	static {
		EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}			
}

//������ * ������ 2���̾�
