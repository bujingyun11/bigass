package model;

public class Result {
	private Station star;  //��ʼվ
    private Station end;   //�յ�վ
    private int distance;  //����
    private Station passStations;  //�����վ�����·���е���һվ
    private String line;   //�����վ�ڼ�������
    private int linechange;  //��Ǵ���һվ����վ�Ƿ��л��ˣ�0Ϊ�޻��ˣ�1Ϊ�軻��
    public Station getStar() {
        return star;
    }
    public void setStar(Station star) {
        this.star = star;
    }
    public Station getEnd() {
        return end;
    }
    public void setEnd(Station end) {
        this.end = end;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    } 
    public Station getPassStations() {
		return passStations;
	}
	public void setPassStations(Station passStations) {
		this.passStations = passStations;
	}
	public Result(Station star, Station end, int distance) {
        this.star = star;
        this.end = end;
        this.distance = distance;
    }
    public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public int getLinechange() {
		return linechange;
	}
	public void setLinechange(int linechange) {
		this.linechange = linechange;
	}
	public Result() {

    }
}
