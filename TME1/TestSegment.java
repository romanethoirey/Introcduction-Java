public class TestSegment{
	public static void main (String[] args){
	Segment s1 = new Segment(6,8);
	Segment s2 = new Segment(12,5);
	if (s1.longueur()<s2.longueur()){
		System.out.println("s2 est plus long que s1");
	}
	else{
		System.out.println("s1 est plus long que s2");	
	}
	}
}
