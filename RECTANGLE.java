
public class RECTANGLE {
	// TODO Auto-generated method stub

	int length;
	int width;
	
	public RECTANGLE(int length2, int width2) {
		length=length2;
		width=width2;
	}

	public int getArea() {
		int area = length*width;
		return area;
	}
	public int getPerameter() {
		int perameter = ((2*length)+(2*width));
		return perameter;
	}
	}


