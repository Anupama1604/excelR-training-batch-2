import java.util.HashSet;
class HashSetDemo2 {
//HashSet does not allow duplicates and it does 
// not guarantee of the 
//order in which the elements are added...
    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("Anu");
		hashSet.add("Jhansi");
		hashSet.add("Pandu");
		hashSet.add("Chintu");
		hashSet.add("Priyanka");
		hashSet.add("Indhu");
		System.out.println(hashSet);
    }
	
}

public class Demo032 {
    public static void main(String[] args) {
		HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
	}
}