package Prac;

public class Main {
	
	public static void main(String[] args) {
		
		
		HashTable_Prac2 HashTable = new HashTable_Prac2(5);
		
		HashTable.put("Yosup", "인천광역시 연수구 송도2동");
		HashTable.put("MinGun", "서울특별시 강남구 일원동");
		HashTable.put("Yosup", "인천광역시 연수구 송도1동");
		
		System.out.println(HashTable.get("MinGun")); 
		System.out.println(HashTable.get("Yosup"));
		System.out.println(HashTable.get("Insup"));
	}

}
